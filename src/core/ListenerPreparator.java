package core;

import core.structure.Scope;
import core.structure.Variable;

import java.util.ArrayList;
import java.util.Stack;

public class ListenerPreparator {


    /*
    to keep all scopes from GLOBAL to deepest scopes
     */
    protected static ArrayList<Scope> scopes;
    /*
    for keep name or location of current scope
    e.g GLOBAL.AnotherClass.getSomeValue
    GLOBAL : representing the root of all scopes in a *.xpre file
    AnotherClass : representing a class
    getSomeValue : representing a function
    will do pop() after out from current scope
     */
    protected static Stack<String> currentScopeName;
    /*
    for keep count on anonymous scope in current scope and make a anonymous formatted name (for currentScopeName)
    e.g : GLOBAL.MyClass.anonScope1
    default value is 1
    the count reset after out from current scope (to 1)
     */
    protected static int anonScopeCount;
    /*
    keep all variables object
     */
    protected static ArrayList<Variable> variables;


    protected ArrayList<Scope> getScopes()
    {
        return scopes;
    }

    protected String getScopeName()
    {
        String name = "";
        for (String i : (String[])currentScopeName.toArray()) name += i + ".";
        name = name.substring(0,name.length()-1);

        return name;
    }



}
