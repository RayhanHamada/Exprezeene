package testerforcore;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class TestingGround {

    public static void main(String[] args) throws Exception{

        CharStream input = CharStreams.fromFileName("teks.txt");
//        input.g
        ExprezeeneLexer lexer = new ExprezeeneLexer(input);
        ExprezeeneParser parser = new ExprezeeneParser(new CommonTokenStream(lexer));
        parser.addParseListener(new TestListener());

        parser.program();
    }
}
