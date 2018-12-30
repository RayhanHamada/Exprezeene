package core.structure;

import core.datatype.DataType;

public class Parameter {

    private String identifier;
    private DataType type;

    public Parameter(String identifier, DataType type)
    {
        this.identifier = identifier;
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public DataType getType() {
        return type;
    }
}
