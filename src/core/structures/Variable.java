package core.structures;

public class Variable {

    private String identifier;
    private AccessModifier accessModifier;
    private String dataType;
    private boolean _static, _const;
    private Expression expr;
    private boolean state; //false for declared, true for initialized
    private int refCount;
    private Scope scope;


    //for declared variable
    public Variable(String identifier, AccessModifier accessModifier, String dataType, boolean _static, boolean _const, String location, ScopeType scopeType)
    {
        this.identifier = identifier;
        this.accessModifier = accessModifier;
        this.dataType = dataType;
        this._static = _static;
        this._const = _const;
        this.expr = null;
        this.state = false;
        this.scope = new Scope(location, scopeType);
        this.refCount = 0;

    }

    //for initialized
    public Variable(String identifier, AccessModifier accessModifier, String dataType, boolean _static, boolean _const, String location, ScopeType scopeType, Expression expr)
    {
        this(identifier, accessModifier, dataType, _static, _const, location, scopeType);
        this.expr = expr;
        this.state = true;
    }

    public Expression getExpr() {
        return expr;
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

    public int getRefCount() {
        return refCount;
    }

    public Scope getScope() {
        return scope;
    }

    public void evaluate()
    {
        expr.evaluate();
    }

}
