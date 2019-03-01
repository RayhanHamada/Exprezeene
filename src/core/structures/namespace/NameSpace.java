package core.structures.namespace;

import core.structures.structure_comp.scope.Scope;

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
