package core.structures;

import core.BaseListener;

public class Notifier {

    public static void report(String message, String scriptName, NotifierType notifierType)
    {
        if (notifierType.equals(NotifierType.WARNING))
        {
            System.out.printf("[WARNING in %s on line %d row %d] : %s", scriptName, BaseListener.currentLine, BaseListener.currentRow, message);
        }
        else if (notifierType.equals(NotifierType.EXCEPTION))
        {
            System.out.printf("[EXCEPTION in %s on line %d row %d] : %s", scriptName, BaseListener.currentLine, BaseListener.currentRow, message);
        }
        else
        {
            System.out.printf("[ERROR in %s on line %d row %d] : %s", scriptName, BaseListener.currentLine, BaseListener.currentRow, message);
        }
    }


    public static void reportException(String message)
    {
        System.out.println(message);
    }
}
