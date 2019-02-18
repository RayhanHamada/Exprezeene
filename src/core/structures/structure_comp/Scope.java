package core.structures.structure_comp;

public class Scope {

    private String location;
    private String scopeName;
    private ScopeType scopeType;

    /*
    special for variable, to avoid forward reference, just make sure they could be used in good sequence of existence.
     */
    private int refIndex;

    public Scope(String location, ScopeType scopeType)
    {
        this.location = location;
        this.scopeType = scopeType;
        this.scopeName = location.replaceAll("[^\\.]+\\.", "");
        this.refIndex = 0;
    }

    public Scope(String location, ScopeType scopeType, int refIndex)
    {
        this(location, scopeType);
        this.refIndex = refIndex;
    }

//    public Scope(Scope s)
//    {
//        this.location = s.location;
//        this.scopeType = s.scopeType;
//        this.scopeName = location.replaceAll("[^\\.]+\\.", "");
//        this.refIndex = 0;
//    }

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
