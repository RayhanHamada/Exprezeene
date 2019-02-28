package core.structures.variable;

import core.structures.structure_comp.*;

public class Variable {

    private String identifier; // the name of the variable
    private AccessModifier accessModifier; // access modifier of the variable
    private String dataType; // for datatype of the variable
    private boolean _static, _const; // is static? is constant ?
    private Expression exprRepr; // if the variable is initialized, then it must have a value.
    private boolean state; //false for declared, true for initialized
    private int refCount; // how many times this variable is used
    private Scope scope; // for scope reference


    //for declared variable
    public Variable(String identifier, AccessModifier accessModifier, String dataType, boolean _static, boolean _const, Scope scope)
    {
        this.identifier = identifier;
        this.accessModifier = accessModifier;
        this.dataType = dataType;
        this._static = _static;
        this._const = _const;
        this.exprRepr = null;
        this.state = false;
        this.scope = scope;

    }

    //for initialized
    public Variable(String identifier, AccessModifier accessModifier, String dataType, boolean _static, boolean _const, Scope scope, String exprRepr)
    {
        this(identifier, accessModifier, dataType, _static, _const, scope);
        this.exprRepr = new Expression(exprRepr);
        this.state = true;
    }

    public Expression getExpr() {
        return exprRepr;
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
        if (exprRepr ==  null) return;
        exprRepr.evaluate();
    }


}
