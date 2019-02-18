package core.notifier;

import core.runtime.antlrgenerated.BaseListener;
import core.runtime.ScriptEvaluator2;

public class Notifier {

    public static void report(String message, String scriptWhereThisOccur, NotifierType notifierType)
    {
        if (notifierType.equals(NotifierType.WARNING))
        {
            System.out.printf("[WARNING in %s:%d:%d] : %s.\n", scriptWhereThisOccur, BaseListener.currentLine, BaseListener.currentRow, message);
        }
        else
        {
            System.out.printf("[ERROR in %s:%d:%d] : %s.\n", scriptWhereThisOccur, BaseListener.currentLine, BaseListener.currentRow, message);
            ScriptEvaluator2.canRun = false;
        }
    }


    public static void reportException(String message)
    {
        System.out.println(message);
    }
}
