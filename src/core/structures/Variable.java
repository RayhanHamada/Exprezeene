package core.structures;

public class Variable {

    private String identifier;
    private AccessModifier accessModifier;
    private String dataType;
    private boolean _static, _const;
    private String value;
    private boolean state; //false for declared, true for initialized
    private String location;
    private ScopeType scopeType;
    private int refCount;


    //for declared variable
    public Variable(String identifier, AccessModifier accessModifier, String dataType, boolean _static, boolean _const, String location, ScopeType scopeType)
    {
        this.identifier = identifier;
        this.accessModifier = accessModifier;
        this.dataType = dataType;
        this._static = _static;
        this._const = _const;
        this.value = null;
        this.state = false;
        this.location = location;
        this.refCount = 0;
        this.scopeType = scopeType;
    }

    //for initialized
    public Variable(String identifier, AccessModifier accessModifier, String dataType, boolean _static, boolean _const, String location, ScopeType scopeType, String value)
    {
        this(identifier, accessModifier, dataType, _static, _const, location, scopeType);
        this.value = value;
        this.state = true;
    }

    public String getValue() {
        return value;
    }

    public String getLocation() {
        return location;
    }

    public String getIdentifier() {
        return identifier;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public String getDataType() {
        return dataType;
    }

    public boolean is_static() {
        return _static;
    }

    public boolean is_const() {
        return _const;
    }

    public boolean isState() {
        return state;
    }

    public ScopeType getScopeType() {
        return scopeType;
    }

    public int getRefCount() {
        return refCount;
    }
}
