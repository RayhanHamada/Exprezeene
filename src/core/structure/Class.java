package core.structure;

public class Class extends Scope {

    private String identifier;
    private boolean _static;
    private AccessModifier accmod;

    public Class(String identifier, boolean _static, AccessModifier accmod)
    {
        super(identifier, ScopeType.CLASS);
        this.identifier = identifier;
        this._static = _static;
        if (accmod.equals(null))this.accmod = AccessModifier.PRIVATE;
        else this.accmod = accmod;
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

}
