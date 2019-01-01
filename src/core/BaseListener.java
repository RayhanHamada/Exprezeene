package core;

import core.listener.ExprezeeneListener;
import core.listener.ExprezeeneParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class BaseListener extends ListenerPreparator implements ExprezeeneListener{

    public BaseListener()
    {
        this.scopes = new ArrayList<>();
    }

    public void enterIntegerLiteral(ExprezeeneParser.IntegerLiteralContext ctx) {

    }

    public void exitIntegerLiteral(ExprezeeneParser.IntegerLiteralContext ctx) {

    }

    public void enterFloatLiteral(ExprezeeneParser.FloatLiteralContext ctx) {

    }

    public void exitFloatLiteral(ExprezeeneParser.FloatLiteralContext ctx) {

    }

    public void enterLiteral(ExprezeeneParser.LiteralContext ctx) {

    }

    public void exitLiteral(ExprezeeneParser.LiteralContext ctx) {

    }

    public void enterMethodCall(ExprezeeneParser.MethodCallContext ctx) {

    }

    public void exitMethodCall(ExprezeeneParser.MethodCallContext ctx) {

    }

    public void enterExpr(ExprezeeneParser.ExprContext ctx) {

    }

    public void exitExpr(ExprezeeneParser.ExprContext ctx) {

    }

    public void enterPrimary(ExprezeeneParser.PrimaryContext ctx) {

    }

    public void exitPrimary(ExprezeeneParser.PrimaryContext ctx) {

    }

    public void enterParameter(ExprezeeneParser.ParameterContext ctx) {

    }

    public void exitParameter(ExprezeeneParser.ParameterContext ctx) {

    }

    public void enterDefaultValueParameter(ExprezeeneParser.DefaultValueParameterContext ctx) {

    }

    public void exitDefaultValueParameter(ExprezeeneParser.DefaultValueParameterContext ctx) {

    }

    public void enterArguments(ExprezeeneParser.ArgumentsContext ctx) {

    }

    public void exitArguments(ExprezeeneParser.ArgumentsContext ctx) {

    }

    public void enterAccmod(ExprezeeneParser.AccmodContext ctx) {

    }

    public void exitAccmod(ExprezeeneParser.AccmodContext ctx) {

    }

    public void enterModifier(ExprezeeneParser.ModifierContext ctx) {

    }

    public void exitModifier(ExprezeeneParser.ModifierContext ctx) {

    }

    public void enterType(ExprezeeneParser.TypeContext ctx) {

    }

    public void exitType(ExprezeeneParser.TypeContext ctx) {

    }

    public void enterPrimitiveType(ExprezeeneParser.PrimitiveTypeContext ctx) {

    }

    public void exitPrimitiveType(ExprezeeneParser.PrimitiveTypeContext ctx) {

    }

    public void enterReferenceType(ExprezeeneParser.ReferenceTypeContext ctx) {

    }

    public void exitReferenceType(ExprezeeneParser.ReferenceTypeContext ctx) {

    }

    public void enterUserDefinedType(ExprezeeneParser.UserDefinedTypeContext ctx) {

    }

    public void exitUserDefinedType(ExprezeeneParser.UserDefinedTypeContext ctx) {

    }

    public void enterProgram(ExprezeeneParser.ProgramContext ctx) {

    }

    public void exitProgram(ExprezeeneParser.ProgramContext ctx) {

    }

    public void enterGlobalScopeStatement(ExprezeeneParser.GlobalScopeStatementContext ctx) {

    }

    public void exitGlobalScopeStatement(ExprezeeneParser.GlobalScopeStatementContext ctx) {

    }

    public void enterEntryPoint(ExprezeeneParser.EntryPointContext ctx) {

    }

    public void exitEntryPoint(ExprezeeneParser.EntryPointContext ctx) {

    }

    public void enterAllowedEntryPointStatement(ExprezeeneParser.AllowedEntryPointStatementContext ctx) {

    }

    public void exitAllowedEntryPointStatement(ExprezeeneParser.AllowedEntryPointStatementContext ctx) {

    }

    public void enterImportStatement(ExprezeeneParser.ImportStatementContext ctx) {

    }

    public void exitImportStatement(ExprezeeneParser.ImportStatementContext ctx) {

    }

    public void enterVarDeclStatement(ExprezeeneParser.VarDeclStatementContext ctx) {

    }

    public void exitVarDeclStatement(ExprezeeneParser.VarDeclStatementContext ctx) {

    }

    public void enterVarInitStatement(ExprezeeneParser.VarInitStatementContext ctx) {

    }

    public void exitVarInitStatement(ExprezeeneParser.VarInitStatementContext ctx) {

    }

    public void enterVarAssignStatement(ExprezeeneParser.VarAssignStatementContext ctx) {

    }

    public void exitVarAssignStatement(ExprezeeneParser.VarAssignStatementContext ctx) {

    }

    public void enterObjInstStatement(ExprezeeneParser.ObjInstStatementContext ctx) {

    }

    public void exitObjInstStatement(ExprezeeneParser.ObjInstStatementContext ctx) {

    }

    public void enterClassDefStatement(ExprezeeneParser.ClassDefStatementContext ctx) {

    }

    public void exitClassDefStatement(ExprezeeneParser.ClassDefStatementContext ctx) {

    }

    public void enterInClassStatement(ExprezeeneParser.InClassStatementContext ctx) {

    }

    public void exitInClassStatement(ExprezeeneParser.InClassStatementContext ctx) {

    }

    public void enterMethodDefStatement(ExprezeeneParser.MethodDefStatementContext ctx) {

    }

    public void exitMethodDefStatement(ExprezeeneParser.MethodDefStatementContext ctx) {

    }

    public void enterInMethodStatement(ExprezeeneParser.InMethodStatementContext ctx) {

    }

    public void exitInMethodStatement(ExprezeeneParser.InMethodStatementContext ctx) {

    }

    public void enterCondStatement(ExprezeeneParser.CondStatementContext ctx) {

    }

    public void exitCondStatement(ExprezeeneParser.CondStatementContext ctx) {

    }

    public void enterIfStatement(ExprezeeneParser.IfStatementContext ctx) {

    }

    public void exitIfStatement(ExprezeeneParser.IfStatementContext ctx) {

    }

    public void enterElseIfStatement(ExprezeeneParser.ElseIfStatementContext ctx) {

    }

    public void exitElseIfStatement(ExprezeeneParser.ElseIfStatementContext ctx) {

    }

    public void enterElseStatement(ExprezeeneParser.ElseStatementContext ctx) {

    }

    public void exitElseStatement(ExprezeeneParser.ElseStatementContext ctx) {

    }

    public void enterInIfStatement(ExprezeeneParser.InIfStatementContext ctx) {

    }

    public void exitInIfStatement(ExprezeeneParser.InIfStatementContext ctx) {

    }

    public void enterLooperatorStatement(ExprezeeneParser.LooperatorStatementContext ctx) {

    }

    public void exitLooperatorStatement(ExprezeeneParser.LooperatorStatementContext ctx) {

    }

    public void enterWhileLooperator(ExprezeeneParser.WhileLooperatorContext ctx) {

    }

    public void exitWhileLooperator(ExprezeeneParser.WhileLooperatorContext ctx) {

    }

    public void enterForLooperator(ExprezeeneParser.ForLooperatorContext ctx) {

    }

    public void exitForLooperator(ExprezeeneParser.ForLooperatorContext ctx) {

    }

    public void enterForeachLooperator(ExprezeeneParser.ForeachLooperatorContext ctx) {

    }

    public void exitForeachLooperator(ExprezeeneParser.ForeachLooperatorContext ctx) {

    }

    public void enterDoWhileLooperator(ExprezeeneParser.DoWhileLooperatorContext ctx) {

    }

    public void exitDoWhileLooperator(ExprezeeneParser.DoWhileLooperatorContext ctx) {

    }

    public void enterInLooperatorStatement(ExprezeeneParser.InLooperatorStatementContext ctx) {

    }

    public void exitInLooperatorStatement(ExprezeeneParser.InLooperatorStatementContext ctx) {

    }

    public void visitTerminal(TerminalNode terminalNode) {

    }

    public void visitErrorNode(ErrorNode errorNode) {

    }

    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
