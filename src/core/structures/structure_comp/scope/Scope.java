package core.structures.structure_comp.scope;

public class Scope {

    private String location;
    private String scopeName;
    private ScopeType scopeType;

    /*
    special for variable, to avoid forward reference, just make sure they could be used in good sequence of existence.
     */
    private int orderIndex;

    /*
    for class, namespace, and method
     */
    public Scope(String location, ScopeType scopeType)
    {
        this.location = location;
        this.scopeType = scopeType;
        this.scopeName = location.replaceAll("[^\\.]+\\.", "");
        this.orderIndex = 0;
    }

    /*
    for variable statement and expression statement
     */
    public Scope(String location, ScopeType scopeType, int orderIndex)
    {
        this(location, scopeType);
        this.orderIndex = orderIndex;
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

    public int getOrderIndex()
    {
        return orderIndex;
    }

    public void incrementOrderIndex()
    {
        orderIndex++;
    }

    public void setOrderIndexToZero()
    {
        this.orderIndex = 0;
    }

}
