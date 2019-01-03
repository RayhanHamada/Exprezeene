package core.structures;

public class Method {

    private String identifier;
    private Parameter[] param;
    private AccessModifier accessModifier;
    private String scopeName;
    private Type returnType;

    public Method(String identifier, Parameter[] param, AccessModifier accessModifier, String scopeName, Type returnType)
    {
        this.identifier = identifier;
        this.param = param;
        this.accessModifier = accessModifier;
        this.scopeName = scopeName;
        this.returnType = returnType;
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

    public Type getReturnType() {
        return returnType;
    }


}
