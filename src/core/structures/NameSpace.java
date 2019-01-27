package core.structures;

public class NameSpace {

    private String identifier;
    private String location;
    private ScopeType scopeType;

    public NameSpace(String identifier, String location, ScopeType scopeType)
    {
        this.identifier = identifier;
        this.location = location;
        this.scopeType = scopeType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getLocation() {
        return location;
    }

    public ScopeType getScopeType() {
        return scopeType;
    }
}
