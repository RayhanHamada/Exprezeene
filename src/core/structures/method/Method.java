package core.structures.method;

import core.structures.structure_comp.AccessModifier;
import core.structures.structure_comp.scope.Scope;
import core.structures.structure_comp.scope.ScopeType;

public class Method {

    private String identifier;
    private Parameter[] param;
    private AccessModifier accessModifier;
    private Scope scope;
    private String returnDataType;


    public Method(String identifier, Parameter[] param, AccessModifier accessModifier, String location, ScopeType scopeType, String returnDataType)
    {
        this.identifier = identifier;
        this.param = param;
        this.accessModifier = accessModifier;
        this.scope = new Scope(location, scopeType);
        this.returnDataType = returnDataType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Parameter[] getParam() {
        return param;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public Scope getScope()
    {
        return scope;
    }

    public String getReturnDataType() {
        return returnDataType;
    }


}
