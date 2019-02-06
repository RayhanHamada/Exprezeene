package core.structures;

public class Scope {

    private String location;
    private ScopeType scopeType;

    public Scope(String location, ScopeType scopeType)
    {
        this.location = location;
        this.scopeType = scopeType;
    }

    public String getLocation()
    {
        return location;
    }

    public ScopeType getScopeType()
    {
        return scopeType;
    }
}
