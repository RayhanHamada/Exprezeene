package core.runtime;

import core.datatype.DataType;
import core.datatype.DataTypeType;
import core.structure.Value;

public class InFunctionVarInitialization implements Action{

    private String identifier;
    private DataType type;
    private DataTypeType typeType;
    private Value value;

    public InFunctionVarInitialization(String identifier, DataType type, Value value)
    {
        this.identifier = identifier;
        this.type = type;
        this.value = value;
    }

    @Override
    public void evaluate() {
        
    }
}
