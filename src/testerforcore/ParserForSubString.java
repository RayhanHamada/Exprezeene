package testerforcore;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class ParserForSubString {

    private String subString;

    public ParserForSubString(String subString)
    {
        this.subString = subString;
    }

    public void evaluate()
    {
        CharStream input = CharStreams.fromString(subString);
        ExprezeeneLexer lexer = new ExprezeeneLexer(input);
        ExprezeeneParser parser = new ExprezeeneParser(new CommonTokenStream(lexer));
        parser.addParseListener(new TestListener());



        parser.program();
    }


}
