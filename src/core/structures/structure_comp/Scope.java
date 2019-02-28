package core.structures.structure_comp;

public class Scope {

    private String location;
    private String scopeName;
    private ScopeType scopeType;

    /*
    special for variable, to avoid forward reference, just make sure they could be used in good sequence of existence.
     */
    private int refIndex;

    /*
    for class, namespace, and method
     */
    public Scope(String location, ScopeType scopeType)
    {
        this.location = location;
        this.scopeType = scopeType;
        this.scopeName = location.replaceAll("[^\\.]+\\.", "");
        this.refIndex = 0;
    }

    /*
    for variable statement and expression statement
     */
    public Scope(String location, ScopeType scopeType, int refIndex)
    {
        this(location, scopeType);
        this.refIndex = refIndex;
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

    public int getRefIndex()
    {
        return refIndex;
    }

    public void incrementRefIndex()
    {
        refIndex++;
    }

    public void setRefIndexToZero()
    {
        this.refIndex = 0;
    }

}
