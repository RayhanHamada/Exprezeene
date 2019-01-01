package core.structure;

import core.datatype.DataType;

public class PrimitiveValue extends Value {

    private String representation;

    public PrimitiveValue(String representation, DataType type)
    {
        super(type);
        this.representation = representation;
    }

    public String getRepresentation()
    {
        return representation;
    }


}
