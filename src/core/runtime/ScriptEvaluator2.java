package core.runtime;

import core.listener.ExprezeeneLexer;
import core.listener.ExprezeeneParser;
import core.notifier.Notifier;
import core.notifier.NotifierType;

import core.runtime.antlrgenerated.BaseListener;
import core.structures.structure_comp.Expression;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;

public class ScriptEvaluator2 {

    public static boolean canRun = true;
    public static ArrayList<Script> allScript = new ArrayList<>();

    private static void addAllTempIntoAllScript()
    {
        for (Script script : BaseListener.tempScript)
        {
            allScript.add(script);
        }
        BaseListener.resetTempScript();
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
            interpretation procedure of main script :
            1. scanning all preprocessor.
            2. scanning all statement(include main method statement) except preprocessor.

            interpretation procedure of non-main script
            1. scanning all preprocessor.
            2. scanning all statement(with no main method, if there's any, then the main method would be ignored) except preprocessor.
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
            addAllTempIntoAllScript();

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
            p1.addParseListener(new BaseListener(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT, script,"GLOBAL"));
            p1.program();

            /*
            if this script is main script, then execute every statement in the main method.
             */
            if (script.isMainScript())
            {
                // if the first main method statement is variable statement, then it would be false, if it's expression statement, then it would be true.
                boolean varOrExpression = false;

                for (Expression expression : DataHandler.getExpressionStatements())
                {
                    if (expression.getScope().getLocation().equals("GLOBAL.main") && expression.getScope().getRefIndex() == 0)
                    {
                        varOrExpression = true;
                    }
                }

                if (varOrExpression)
                {

                }
            }
        }
    }
}
