package core.structures;

public class Parameter {

    private String identifier;
    private String dataType;
    private String value;

    public Parameter(String identifier, String dataType)
    {
        this.identifier = identifier;
        this.dataType = dataType;
    }

    // for default value parameter (valued parameter)
    public Parameter(String identifier, String dataType, String value)
    {
        this(identifier, dataType);
        this.value = value;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public String getDataType()
    {
        return dataType;
    }

    public String getValue()
    {
        return value;
    }

}
