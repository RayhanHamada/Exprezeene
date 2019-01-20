package core;

import core.listener.ExprezeeneLexer;
import core.listener.ExprezeeneParser;
import core.structures.RunStage;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Runtime {

    private static String mainMethodCode;
    private static boolean foundMainMethod = false;
    private static RunStage runStage;

    public static void setFoundMainMethod()
    {
        foundMainMethod = true;
    }

    public static String getMainMethodCode()
    {
        return mainMethodCode;
    }

    public static void setMainMethodCode(String code)
    {
        mainMethodCode = code;
    }

    public static RunStage getRunStage()
    {
        return runStage;
    }

    public static void goRunThisProgram() throws Exception
    {
        /*
        scanning every imported script(s)
         */
        runStage = RunStage.SCANNING_PREPROCESSOR;
        CharStream input = CharStreams.fromFileName("teks.txt");
        ExprezeeneLexer lexer = new ExprezeeneLexer(input);
        ExprezeeneParser parser = new ExprezeeneParser(new CommonTokenStream(lexer));
        parser.addParseListener(new BaseListener());
        parser.program();

    }

    public static void main(String[] args) throws Exception {

        Runtime.goRunThisProgram();
    }
}
