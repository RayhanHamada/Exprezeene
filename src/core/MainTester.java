package core;

import core.listener.ExprezeeneLexer;
import core.listener.ExprezeeneParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class MainTester {

    final int a = 3;

    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromFileName("teks.txt");
        ExprezeeneLexer lexer = new ExprezeeneLexer(input);
        ExprezeeneParser parser = new ExprezeeneParser(new CommonTokenStream(lexer));
        parser.addParseListener(new BaseListener());

        parser.program();
    }
}
