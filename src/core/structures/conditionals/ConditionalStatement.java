package core.structures.conditionals;

import core.structures.structure_comp.Expression;
import core.structures.structure_comp.scope.Scope;

public class ConditionalStatement {

    private Expression exprRepr;
    private ConditionalType conditionalType;
    private Scope scope;


    public ConditionalStatement(String exprRepr, ConditionalType conditionalType, Scope scope)
    {
        this.exprRepr = new Expression(exprRepr);
        this.conditionalType = conditionalType;
        this.scope = scope;
    }

    public Expression getExprRepr()
    {
        return exprRepr;
    }

    public ConditionalType getConditionalType()
    {
        return conditionalType;
    }



}
