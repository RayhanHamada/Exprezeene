package core.runtime;

import core.listener.ExprezeeneLexer;
import core.listener.ExprezeeneParser;
import core.notifier.Notifier;
import core.notifier.NotifierType;
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
                canRun = false;
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
            CharStream i1 = CharStreams.fromFileName(script.getScriptPath());
            ExprezeeneLexer l1 = new ExprezeeneLexer(i1);
            ExprezeeneParser p1 = new ExprezeeneParser(new CommonTokenStream(l1));
            p1.addParseListener(new BaseListener(RunStage.SCANNING_NON_MAIN_STATEMENT, script,"GLOBAL"));
            p1.program();

            /*
            if this script is main script.
             */
            if (script.isMainScript())
            {
                /*
                execute every statement in the main method.
                */
                CharStream i2 = CharStreams.fromFileName(script.getScriptPath());
                ExprezeeneLexer l2= new ExprezeeneLexer(i2);
                ExprezeeneParser p2 = new ExprezeeneParser(new CommonTokenStream(l2));
                p2.addParseListener(new BaseListener(RunStage.RUNNING, script,"GLOBAL"));
                p2.program();
            }





        }

    }

}
