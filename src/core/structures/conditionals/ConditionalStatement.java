package core.structures.conditionals;

import core.structures.structure_comp.Expression;

public class ConditionalStatement {

    private Expression exprRepr;
    private ConditionalType conditionalType;


    public ConditionalStatement(String exprRepr)
    {
        this.exprRepr = new Expression(exprRepr);
    }


}
