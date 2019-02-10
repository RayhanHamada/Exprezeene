package core;

import java.io.File;

public class Execution {

    private  static String mainMethodCode = "";

    /*
    contains all fulfilled imported script needed for the main script.
    so there would be no 2 similar script imported.
     */

    public static void main(String... args) throws Exception {


        ScriptEvaluator2.allScript.add(new Script(args[0], null, true));
        ScriptEvaluator2.evaluate(ScriptEvaluator2.allScript.get(0));

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
