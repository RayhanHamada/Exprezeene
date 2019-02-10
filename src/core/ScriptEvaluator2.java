package core;

import core.listener.ExprezeeneLexer;
import core.listener.ExprezeeneParser;
import core.structures.Notifier;
import core.structures.NotifierType;
import core.structures.RunStage;
import org.antlr.runtime.CharStreamState;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;

public class ScriptEvaluator2 {

    public static boolean canRun = true;
    public static ArrayList<Script> allScript = new ArrayList<>();


    private static void addAllTempIntoAllScript(ArrayList<Script> scripts)
    {
        for (Script script : scripts)
        {
            allScript.add(script);
        }
    }

    public static void evaluate(Script script) throws Exception
    {
        if (canRun)
        {

            if (!(script.getScriptFile().exists() && script.getScriptFile().isFile() && script.getScriptName().matches("[A-Za-z0-9_]+\\.txt")))
            {
                Notifier.report("the script " + script.getScriptName() + " is not valid", (script.isMainScript())? script.getScriptName() : script.getParentScript().getScriptName(), NotifierType.ERROR);
                return;
            }

            /*
            for the main script, the procedure of interpretation are:
            1. scanning preprocessor,
            2. scanning for all statement except preprocessor and main method,
            3. find main method and execute every statement in main method.

            for the imported script, the procedure of interpretation are:
            1. scanning preprocessor,
            2. scanning all statement except preprocessor statement and main method(if any) statement.
             */

            CharStream input = CharStreams.fromFileName(script.getScriptPath());
            ExprezeeneLexer lexer = new ExprezeeneLexer(input);
            ExprezeeneParser parser = new ExprezeeneParser(new CommonTokenStream(lexer));

            /*
            scanning for any imported script(s)
            */
            parser.addParseListener(new BaseListener(RunStage.SCANNING_PREPROCESSOR, script,"GLOBAL"));
            parser.program();

            script.setImportedScript(BaseListener.tempScript);
            addAllTempIntoAllScript(BaseListener.tempScript);
            BaseListener.resetTempScript();

            for (Script s : script.getImportedScript())
            {
                ScriptEvaluator2.evaluate(s);
            }

            /*
            for scanning all statement except preprocessor and the main method.
            */
            parser.addParseListener(new BaseListener(RunStage.SCANNING_NON_MAIN_STATEMENT, script,"GLOBAL"));
            parser.program();

            /*
            if this script is main script.
             */
            if (script.isMainScript())
            {
                /*
                execute every statement in the main method.
                */
                parser.addParseListener(new BaseListener(RunStage.RUNNING, script,"GLOBAL"));
                parser.program();
            }





        }

    }

}
