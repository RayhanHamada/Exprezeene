package core;

import java.io.File;

public class Execution {

    private static ScriptEvaluator mainScriptEvaluator;
    private  static String mainMethodCode = "";

    /*
    contains all fulfilled imported script needed for the main script.
    so there would be no 2 similar script imported.
     */

    public static void main(String... args) throws Exception {


        mainScriptEvaluator = new ScriptEvaluator(args[0], null, true);
        mainScriptEvaluator.evaluate();

    }

    public static void setMainMethodCode(String code)
    {
        mainMethodCode = code;
    }
    public static String getMainMethodCode()
    {
        return mainMethodCode;
    }
}
