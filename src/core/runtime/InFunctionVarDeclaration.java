package core.runtime;

import core.DataHandler;
import core.datatype.DataType;
import core.datatype.DataTypeType;
import core.structure.AccessModifier;
import core.structure.Variable;

public class InFunctionVarDeclaration implements Action {

    private String identifier;
    private DataType type;
    private DataTypeType typeType;

    public InFunctionVarDeclaration(String identifier, DataType type)
    {
        this.identifier = identifier;
        this.type = type;
        if (isBuiltInType()) this.typeType = DataTypeType.BUILT_IN;
        else this.typeType = DataTypeType.USER_DEFINED;

    }

    public boolean isBuiltInType()
    {
        for (String i : new String[] {"int", "float", "double", "char", "bool", "long", "char"})
        {
            if (i.equals(this.type.getIdentifier()))return true;
        }
        return false;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public DataType getType()
    {
        return type;
    }

    public DataTypeType getTypeType()
    {
        return typeType;
    }

    @Override
    public void evaluate() {
        DataHandler.getVariables().add(new Variable(identifier, AccessModifier.PRIVATE,false, false, typeType, type, null, 0));
    }
}
