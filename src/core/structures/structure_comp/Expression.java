package core.structures.structure_comp;

import core.listener.ExprezeeneLexer;
import core.listener.ExprezeeneParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

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

    public String getExpr()
    {
        return expr;
    }

    public void evaluate()
    {
        CharStream input = CharStreams.fromString(expr);
        ExprezeeneLexer lexer = new ExprezeeneLexer(input);
        ExprezeeneParser parser = new ExprezeeneParser(new CommonTokenStream(lexer));

        parser.expr();
    }

    public Scope getScope()
    {
        return scope;
    }
}
