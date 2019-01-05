package core.structures;

import java.util.ArrayList;
import java.util.Stack;

public class DataHandler {

    private static String location = "GLOBAL";
    private static ArrayList<Variable> variables = new ArrayList<>();
    private static ArrayList<Method> methods = new ArrayList<>();
    private static ArrayList<Class> classes = new ArrayList<>();

    private static Stack<Integer> anonScopeCounts = new Stack<>();

    private static Stack<Integer> getAnonScopeCounts()
    {
        return anonScopeCounts;
    }

    public static String getLocation()
    {
        return location;
    }

    public static void addLocation(String name)
    {
        location += "." + name;
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
