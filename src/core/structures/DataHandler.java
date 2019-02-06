package core.structures;

import java.io.File;
import java.util.ArrayList;
import java.util.Stack;

public class DataHandler {

    private static ArrayList<Variable> variables = new ArrayList<>();
    private static ArrayList<Method> methods = new ArrayList<>();
    private static ArrayList<Class> classes = new ArrayList<>();
    private static ArrayList<NameSpace> nameSpaces = new ArrayList<>();

    private ArrayList<File> importedScript = new ArrayList<>();


    public static final String[] PRIMITIVE_TYPES = {"int", "char", "float", "bool", "double", "long"};

    public static final String[] RESERVED_WORD = {"class", "var", "func", "for", "if", "else", "const",
                                                  "define", "alias", "import", "as", "this", "new",
                                                  "inherit", "public", "private", "protected", "static",
                                                  "while", "for", "do", "in", "go"};


    private static Stack<Integer> anonScopeCounts = new Stack<>();

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

    public static ArrayList<NameSpace> getNameSpaces()
    {
        return nameSpaces;
    }


}
