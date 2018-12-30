package core.structure;

public class Class {

    private String identifier;
    private boolean _static;
    private AccessModifier accmod;
    private Scope scope;


    public Class(){}

    public Class(String identifier, boolean _static, AccessModifier accmod, Scope scope)
    {
        this.identifier = identifier;
        this._static = _static;
        if (accmod.equals(null))this.accmod = AccessModifier.PRIVATE;
        else this.accmod = accmod;
        this.scope = scope;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public boolean is_static()
    {
        return _static;
    }

    public AccessModifier getAccMod()
    {
        return accmod;
    }

    public Scope getScope()
    {
        return scope;
    }



}
