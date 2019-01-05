package core.structures;

public class Method {

    private String identifier;
    private Parameter[] param;
    private AccessModifier accessModifier;
    private String scopeName;
    private String returnDataType;


    public Method(String identifier, Parameter[] param, AccessModifier accessModifier, String scopeName, String returnDataType)
    {
        this.identifier = identifier;
        this.param = param;
        this.accessModifier = accessModifier;
        this.scopeName = scopeName;
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

    public String getScopeName() {
        return scopeName;
    }

    public String getReturnDataType() {
        return returnDataType;
    }


}
