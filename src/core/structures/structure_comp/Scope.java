package core.structures.structure_comp;

public class Scope {

    private String location;
    private String scopeName;
    private ScopeType scopeType;

    public Scope(String location, ScopeType scopeType)
    {
        this.location = location;
        this.scopeType = scopeType;
        this.scopeName = location.replaceAll("[^\\.]+\\.", "");
    }

    public String getLocation()
    {
        return location;
    }

    public String getScopeName()
    {
        return scopeName;
    }

    public ScopeType getScopeType()
    {
        return scopeType;
    }


}
