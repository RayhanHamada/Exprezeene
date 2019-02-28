package core.runtime;

public class Execution {


    public static void main(String... args) throws Exception {


           ScriptEvaluator2.allScript.add(new Script(args[0], null, true));
        ScriptEvaluator2.evaluate(ScriptEvaluator2.allScript.get(0));

    }
}
