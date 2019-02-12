package core.structures.namespace;

import core.structures.structure_comp.Scope;
import core.structures.structure_comp.ScopeType;

public class NameSpace {

    private String identifier;
    private Scope scope;

    public NameSpace(String identifier, Scope scope)
    {
        this.identifier = identifier;
        this.scope = scope;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Scope getScope()
    {
        return scope;
    }

}
