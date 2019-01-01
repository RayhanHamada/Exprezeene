package core.structure;

public class Scope {

    private String scopeName;
    private ScopeType scopeType;
    /*
    for keep count on anonymous scope in current scope and make a anonymous formatted name (for currentScopeName)
    e.g : GLOBAL.MyClass.anonScope1
    default value is 1
    the count reset after out from current scope (to 1)
     */
    protected int anonScopeCount = 0;

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
