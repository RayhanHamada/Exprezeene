package core.structure;

import core.datatype.DataType;
import core.datatype.DataTypeType;

public class Variable {

    private String identifier;
    private AccessModifier accmod;
    private boolean _static, _const;
    private DataTypeType typetype;
    private DataType type;

    public Variable(String identifier, AccessModifier accmod, boolean _static, boolean _const, DataTypeType typeType, DataType type)
    {
        this.identifier = identifier;
        if (accmod.equals(null)) this.accmod = AccessModifier.PRIVATE;
        else this.accmod = accmod;
        this._static = _static;
        this._const = _const;
        this.typetype = typeType;
        this.type = type;
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
