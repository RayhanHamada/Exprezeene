package core;

import core.structures.Notifier;
import core.structures.NotifierType;

public class ScriptEvaluator2 {

    public static boolean canRun = true;


    public static void evaluate(Script script)
    {
        if (canRun)
        {

            if (!(script.getScriptFile().exists() && script.getScriptFile().isFile() && script.getScriptName().matches("[A-Za-z0-9_]+\\.txt")))
            {
                Notifier.report("the script " + script.getScriptName() + " is not valid.", script.getParentScript().getScriptName(), NotifierType.ERROR);
                return;
            }


        }

    }

}
