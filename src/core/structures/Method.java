package core.structures;

public class Method {

    private String identifier;
    private Parameter[] param;
    private AccessModifier accessModifier;
    private String location;
    private ScopeType scopeType;
    private String returnDataType;


    public Method(String identifier, Parameter[] param, AccessModifier accessModifier, String location, ScopeType scopeType, String returnDataType)
    {
        this.identifier = identifier;
        this.param = param;
        this.accessModifier = accessModifier;
        this.location = location;
        this.scopeType = scopeType;
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

    public String getLocation() {
        return location;
    }

    public ScopeType getScopeType()
    {
        return scopeType;
    }

    public String getReturnDataType() {
        return returnDataType;
    }


}
