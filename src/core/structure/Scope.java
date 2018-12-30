package core.structure;

public class Scope {

    private String scopeName;
    private ScopeType scopeType;

    public Scope(String scopeName, ScopeType scopeType)
    {
        this.scopeName = scopeName;
        this.scopeType = scopeType;
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
