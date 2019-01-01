package core;

import core.structure.Scope;
import core.structure.Variable;

import java.util.ArrayList;
import java.util.Stack;

public class DataHandler {


    /*
    to keep all scopes from GLOBAL to deepest scopes
     */
    private static ArrayList<Scope> scopes;
    /*
    for keep name or location of current scope
    e.g GLOBAL.AnotherClass.getSomeValue
    GLOBAL : representing the root of all scopes in a *.xpre file
    AnotherClass : representing a class
    getSomeValue : representing a function
    will do pop() after out from current scope
     */
    private static Stack<String> currentScopeName;
    /*
    keep all variables object
     */
    private static ArrayList<Variable> variables;


    private static ArrayList<Scope> getScopes()
    {
        return scopes;
    }

    public static String getScopeName()
    {
        String name = "";
        for (String i : (String[])currentScopeName.toArray()) name += "." + i;
        return name;
    }

    public static ArrayList<Variable> getVariables()
    {
        return variables;
    }

    public static Stack<String> getCurrentScopeName()
    {
        return currentScopeName;
    }


}
