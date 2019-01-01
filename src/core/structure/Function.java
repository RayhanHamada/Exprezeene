package core.structure;

import core.datatype.DataType;
import core.datatype.DataTypeType;
import core.runtime.Action;

import java.util.ArrayList;

public class Function extends Scope {

    private String identifier;
    private Parameter[] param;
    private AccessModifier accmod;
    private DataTypeType typeType;
    private DataType type;
    private ArrayList<Action> actions;

    public Function(String identifier, Parameter[] param, AccessModifier accmod, DataTypeType typeType, DataType type)
    {
        super(identifier, ScopeType.FUNCTION);
        this.identifier = identifier;
        this.param = param;

        if (accmod.equals(null)) this.accmod = AccessModifier.PRIVATE;
        else this.accmod = accmod;
        this.type = type;
        this.typeType = typeType;
        this.actions = new ArrayList<Action>();
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
