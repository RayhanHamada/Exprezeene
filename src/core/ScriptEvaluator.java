package core;


import core.listener.ExprezeeneLexer;
import core.listener.ExprezeeneParser;
import core.structures.Notifier;
import core.structures.NotifierType;
import core.structures.RunStage;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.util.ArrayList;

public class ScriptEvaluator {

    private boolean isMainScript;
    private File script;
    private String parentScriptName;
    /*
    contain imported script, and current script
     */
    public static ArrayList<ScriptEvaluator> scripts = new ArrayList<>();
    public ArrayList<ScriptEvaluator> currentScriptScripts = new ArrayList<>();
    public static boolean canRun = true;

    public ScriptEvaluator(String scriptPath, String parentScriptName, boolean isMainScript)
    {
        this.script = new File(scriptPath);
        this.parentScriptName = parentScriptName;
        this.isMainScript = isMainScript;
    }

    public File getScript()
    {
        return script;
    }

    public boolean isMainScript()
    {
        return isMainScript;
    }

    public static boolean isCanRun()
    {
        return canRun;
    }

    public static void setCanRun(boolean c)
    {
        canRun = c;
    }

    public String getParentEvaluator()
    {
        return parentScriptName;
    }


    /*
    to check if the script is valid
    a valid *.xpre script is have this following criteria:
    1. it should exist.
    2. it should be a file.
    3. it should have "xpre" file extension, although in reality the interpreter itself could still accept file with "txt" extension
    (it just for formality).
     */
    private boolean checkIfScriptValid()
    {
        if (script.exists() && script.isFile() && script.getName().matches("[A-Za-z0-9_]+\\.txt")) return true;
        return false;
    }

    public void evaluate() throws Exception
    {
        if (canRun)
        {
            if (!checkIfScriptValid())
            {
                Notifier.report("the script " + this.script.getPath() + " is not valid" , parentScriptName,  NotifierType.ERROR);
                return;
            }

            if (isMainScript) scripts.add(this);

            /*
            for the main script, the procedure of interpretation are:
            1. scanning preprocessor,
            2. scanning for all statement except preprocessor and main method,
            3. find main method and execute every statement in main method.

            for the imported script, the procedure of interpretation are:
            1. scanning preprocessor,
            2. scanning all statement except preprocessor statement and main method(if any) statement.
             */

            CharStream input = CharStreams.fromFileName(script.getPath());
            ExprezeeneLexer lexer = new ExprezeeneLexer(input);
            ExprezeeneParser parser = new ExprezeeneParser(new CommonTokenStream(lexer));

            /*
            scanning for any imported script(s)
            */
            parser.addParseListener(new BaseListener(RunStage.SCANNING_PREPROCESSOR, this.script.getName(),"GLOBAL"));
            parser.program();

            /*
            set imported script for current script , add every tempScript element into scripts and reset tempScript
             */
            currentScriptScripts = BaseListener.tempScript;
            for (ScriptEvaluator se : currentScriptScripts) scripts.add(se);

            BaseListener.resetTempScript();

            /*
            set the script evaluator imported script
             */
            for (ScriptEvaluator se : currentScriptScripts)
            {
                se.evaluate();
            }

            /*
            for scanning all statement except preprocessor and the main method.
            */
            parser.addParseListener(new BaseListener(RunStage.SCANNING_NON_MAIN_STATEMENT, this.script.getName(),"GLOBAL"));
            parser.program();

            /*
            if this script is main script.
             */
            if (isMainScript)
            {
                /*
                execute every statement in the main method.
                */
                parser.addParseListener(new BaseListener(RunStage.RUNNING, this.script.getName(),"GLOBAL"));
                parser.program();
            }

        }
    }
}
