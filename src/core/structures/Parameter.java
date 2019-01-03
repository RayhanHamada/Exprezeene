package core.structures;

public class Parameter {

    private String identifier;
    private Type type;

    public Parameter(String identifier, Type type)
    {
        this.identifier = identifier;
        this.type = type;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public Type getType()
    {
        return type;
    }

}
