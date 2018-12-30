package core.structure;

import core.datatype.DataType;
import core.datatype.DataTypeType;

public class Function {

    private String identifier;
    private Parameter[] param;
    private AccessModifier accmod;
    private DataTypeType typeType;
    private DataType type;

    public Function(String identifier, Parameter[] param, AccessModifier accmod, DataTypeType typeType, DataType type)
    {
        this.identifier = identifier;
        this.param = param;

        if (accmod.equals(null)) this.accmod = AccessModifier.PRIVATE;
        else this.accmod = accmod;
        this.type = type;
        this.typeType = typeType;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public Parameter[] getParam()
    {
        return param;
    }

    public AccessModifier getAccmod()
    {
        return accmod;
    }


}
