package core.structure;

import core.datatype.DataType;

public class ObjectValue extends Value {

    private Value[] values;

    public ObjectValue(Value[] values, DataType type)
    {
        super(type);
        this.values = values;
    }
}
