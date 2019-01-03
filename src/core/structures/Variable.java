package core.structures;

public class Variable {

    private String identifier;
    private AccessModifier accessModifier;
    private Type type;
    private boolean _static, _const;
    private Value value;
    private boolean state; //false for declared, true for initialized
    private String scope;

    //for declared
    public Variable(String identifier, AccessModifier accessModifier, Type type, boolean _static, boolean _const, String scope)
    {
        this.identifier = identifier;
        this.accessModifier = accessModifier;
        this.type = type;
        this._static = _static;
        this._const = _const;
        this.value = null;
        this.state = false;
        this.scope = scope;
    }

    //for initialized
    public Variable(String identifier, AccessModifier accessModifier, Type type, boolean _static, boolean _const, String scope, Value value)
    {
        this(identifier, accessModifier, type, _static, _const, scope);
        this.value = value;
        this.state = true;
    }

    public String getIdentifier() {
        return identifier;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public Type getType() {
        return type;
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
}
