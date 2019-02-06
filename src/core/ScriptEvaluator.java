package core;

import core.listener.ExprezeeneLexer;
import core.listener.ExprezeeneParser;
import core.structures.RunStage;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.util.ArrayList;

public class ScriptEvaluator {

    private boolean isMainScript;
    private File script;
    /*
    contain imported script, and current script
     */
    public static ArrayList<ScriptEvaluator> neededScripts;

    public ScriptEvaluator(String scriptPath, boolean isMainScript)
    {
        this.script = new File(scriptPath);
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
        if (script.exists() && script.isFile() && script.getName().matches("[A-Za-z0-9_]+\\.xpre")) return true;
        return false;
    }

    public void evaluate() throws Exception
    {
        if (!checkIfScriptValid())
        {
            System.out.println("[Error Occurred] : the script \"" + script.getPath() + "\" is not valid." );
            return;
        }

        neededScripts.add(this);

        if (isMainScript)
        {
            /*
            scanning for any imported script(s)
            */
            CharStream input = CharStreams.fromFileName(script.getPath());
            ExprezeeneLexer lexer = new ExprezeeneLexer(input);
            ExprezeeneParser parser = new ExprezeeneParser(new CommonTokenStream(lexer));
            parser.addParseListener(new BaseListener(RunStage.SCANNING_PREPROCESSOR, "GLOBAL"));
            parser.program();

            // set the script evaluator imported script
            this.neededScripts = BaseListener.importedScript;
            BaseListener.resetImportedScript();
            for (ScriptEvaluator se : neededScripts)
            {
//                if ()
            }

            /*
             scanning for imported script(s) statement
             */
            parser.addParseListener(new BaseListener(RunStage.SCANNING_IMPORTED_SCRIPT, "GLOBAL"));
            parser.program();



            /*
            scan for main method
             */
            parser.addParseListener(new BaseListener(RunStage.SCANNING_MAIN_METHOD, "GLOBAL"));
            parser.program();

            /*
            scan
             */




        }
        else
        {

        }
    }

    /*
    for the main script
     */
    public void goRunThisProgram() throws Exception
    {
        // run the main method code
    }
}
