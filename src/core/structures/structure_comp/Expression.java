package core.structures.structure_comp;

import core.structures.structure_comp.scope.Scope;

import java.util.ArrayList;

public class Expression {

    private String expr;
    private Scope scope;

    private ArrayList<Expression> expressions;

    public Expression(String expr, Scope scope)
    {
        this.expr = expr;
        this.scope = scope;
    }

    public Expression(String expr)
    {
        this(expr, null);
    }

    public String getExpr()
    {
        return expr;
    }

    public void evaluate()
    {

    }

    public Scope getScope()
    {
        return scope;
    }
}
