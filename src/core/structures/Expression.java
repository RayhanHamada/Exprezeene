package core.structures;

import core.BaseListener;
import core.listener.ExprezeeneLexer;
import core.listener.ExprezeeneParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;

public class Expression {

//    public enum ExpressionType
//    {
//        EXPRESSION,
//        LITERAL_VALUE,
//        OBJECT
//    }


    private String expr;
//    private ExpressionType type;

    private ArrayList<Expression> expressions;

    public Expression(String expr)
    {
        this.expr = expr;
        this.expressions = new ArrayList<>();
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
}
