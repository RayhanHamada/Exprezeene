package core.structure;

import core.datatype.DataType;
import core.datatype.DataTypeType;

public class Variable {

    private String identifier;
    private AccessModifier accmod;
    private boolean _static, _const;
    private DataTypeType typetype;
    private DataType type;
    private Value value;
    private int state; // 0 for declared, 1 for initialized

    public Variable(String identifier, AccessModifier accmod, boolean _static, boolean _const, DataTypeType typeType, DataType type, Value value, int state)
    {
        this.identifier = identifier;
        if (accmod.equals(null)) this.accmod = AccessModifier.PRIVATE;
        else this.accmod = accmod;
        this._static = _static;
        this._const = _const;
        this.typetype = typeType;
        this.type = type;
        this.value = value;
        this.state = state;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public AccessModifier getAccmod() {
        return accmod;
    }

    public boolean is_static() {
        return _static;
    }

    public boolean is_const() {
        return _const;
    }

    public DataTypeType getTypetype() {
        return typetype;
    }

    public DataType getType() {
        return type;
    }
}
