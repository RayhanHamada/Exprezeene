package core.structure;

import core.datatype.DataType;

public class Value {

    protected DataType type;

    public Value(DataType type)
    {
        this.type = type;
    }

    protected DataType getType()
    {
        return type;
    }

}
