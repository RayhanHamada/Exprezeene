package core.structures;

import java.util.ArrayList;
import java.util.Stack;

public class DataHandler {

    private static ArrayList<Variable> variables = new ArrayList<>();
    private static ArrayList<Method> methods = new ArrayList<>();
    private static ArrayList<Class> classes = new ArrayList<>();

    private static String[] primitiveTypes = {"int", "float", "char", "bool"};

    private static Stack<Integer> anonScopeCounts = new Stack<>();

    public static String[] getPrimitiveTypes()
    {
        return primitiveTypes;
    }

    public static Stack<Integer> getAnonScopeCounts()
    {
        return anonScopeCounts;
    }

    public static ArrayList<Variable> getVariables()
    {
        return variables;
    }

    public static ArrayList<Method> getMethods()
    {
        return methods;
    }

    public static ArrayList<Class> getClasses()
    {
        return classes;
    }

}
