package core.structures;

public class Class {

    private String identifier;
    private AccessModifier accessModifier;
    private Scope scope;
    private Class heir;

    public Class(String identifier, AccessModifier accessModifier, String location, ScopeType scopeType, Class heir)
    {
        this.identifier = identifier;
        this.accessModifier = accessModifier;
        this.scope = new Scope(location, scopeType);
        this.heir = heir;
    }

    public String getIdentifier() {
        return identifier;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public Scope getScope()
    {
        return scope;
    }

    public Class getHeir() {
        return heir;
    }
}
