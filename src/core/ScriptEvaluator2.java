package core;

public class ScriptEvaluator2 {




    public static void evaluate(Script script)
    {

        if (script.getScriptFile().exists() && script.getScriptFile().isFile() && script.getScriptPath().matches("[A-Za-z0-9_]+\\.xpre"))
        {
            if (script.isMainScript())
            {

            }
        }

    }

}
