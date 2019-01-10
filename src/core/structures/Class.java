package core.structures;

public class Class {

    private String identifier;
    private AccessModifier accessModifier;
    private String location;
    private ScopeType scopeType;
    private Class heir;

    public Class(String identifier, AccessModifier accessModifier, String location, ScopeType scopeType, Class heir)
    {
        this.identifier = identifier;
        this.accessModifier = accessModifier;
        this.location = location;
        this.scopeType = scopeType;
        this.heir = heir;
    }

    public String getIdentifier() {
        return identifier;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public String getLocation() {
        return location;
    }

    public Class getHeir() {
        return heir;
    }

    public ScopeType getScopeType()
    {
        return scopeType;
    }
}
