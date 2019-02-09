package core;

import core.listener.ExprezeeneParser;
import core.listener.ExprezeeneVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BaseVisitor implements ExprezeeneVisitor {

    public Object visitIdentifier(ExprezeeneParser.IdentifierContext ctx) {
        return null;
    }

    public Object visitIntegerLiteral(ExprezeeneParser.IntegerLiteralContext ctx) {
        return null;
    }

    public Object visitFloatLiteral(ExprezeeneParser.FloatLiteralContext ctx) {
        return null;
    }

    public Object visitLiteral(ExprezeeneParser.LiteralContext ctx) {
        return null;
    }

    public Object visitMethodCall(ExprezeeneParser.MethodCallContext ctx) {
        return null;
    }

    public Object visitAssignmentExpr(ExprezeeneParser.AssignmentExprContext ctx) {
        return null;
    }

    public Object visitPostFixExpr(ExprezeeneParser.PostFixExprContext ctx) {
        return null;
    }

    public Object visitOrLogicExpr(ExprezeeneParser.OrLogicExprContext ctx) {
        return null;
    }

    public Object visitOrBitWiseExpr(ExprezeeneParser.OrBitWiseExprContext ctx) {
        return null;
    }

    public Object visitAndLogicExpr(ExprezeeneParser.AndLogicExprContext ctx) {
        return null;
    }

    public Object visitPreFixExpr(ExprezeeneParser.PreFixExprContext ctx) {
        return null;
    }

    public Object visitBitShiftExpr(ExprezeeneParser.BitShiftExprContext ctx) {
        return null;
    }

    public Object visitRelationalExpr(ExprezeeneParser.RelationalExprContext ctx) {
        return null;
    }

    public Object visitMultExpr(ExprezeeneParser.MultExprContext ctx) {
        return null;
    }

    public Object visitMethodCallExpr(ExprezeeneParser.MethodCallExprContext ctx) {
        return null;
    }

    public Object visitObjInstExpr(ExprezeeneParser.ObjInstExprContext ctx) {
        return null;
    }

    public Object visitArrayAccessExpr(ExprezeeneParser.ArrayAccessExprContext ctx) {
        return null;
    }

    public Object visitPrimaryExpr(ExprezeeneParser.PrimaryExprContext ctx) {
        return null;
    }

    public Object visitAddExpr(ExprezeeneParser.AddExprContext ctx) {
        return null;
    }

    public Object visitXorBitWiseExpr(ExprezeeneParser.XorBitWiseExprContext ctx) {
        return null;
    }

    public Object visitMemberAccessExpr(ExprezeeneParser.MemberAccessExprContext ctx) {
        return null;
    }

    public Object visitAndBitWiseExpr(ExprezeeneParser.AndBitWiseExprContext ctx) {
        return null;
    }

    public Object visitPrimary(ExprezeeneParser.PrimaryContext ctx) {
        return null;
    }

    public Object visitParameter(ExprezeeneParser.ParameterContext ctx) {
        return null;
    }

    public Object visitParameterVar(ExprezeeneParser.ParameterVarContext ctx) {
        return null;
    }

    public Object visitDefaultValueParameter(ExprezeeneParser.DefaultValueParameterContext ctx) {
        return null;
    }

    public Object visitArguments(ExprezeeneParser.ArgumentsContext ctx) {
        return null;
    }

    public Object visitAccmod(ExprezeeneParser.AccmodContext ctx) {
        return null;
    }

    public Object visitModifier(ExprezeeneParser.ModifierContext ctx) {
        return null;
    }

    public Object visitDataType(ExprezeeneParser.DataTypeContext ctx) {
        return null;
    }

    public Object visitPrimitiveType(ExprezeeneParser.PrimitiveTypeContext ctx) {
        return null;
    }

    public Object visitReferenceType(ExprezeeneParser.ReferenceTypeContext ctx) {
        return null;
    }

    public Object visitUserDefinedType(ExprezeeneParser.UserDefinedTypeContext ctx) {
        return null;
    }

    public Object visitProgram(ExprezeeneParser.ProgramContext ctx) {
        return null;
    }

    public Object visitGlobalScopeStatement(ExprezeeneParser.GlobalScopeStatementContext ctx) {
        return null;
    }

    public Object visitPreprocessorStatement(ExprezeeneParser.PreprocessorStatementContext ctx) {
        return null;
    }

    public Object visitInPreprocessorStatement(ExprezeeneParser.InPreprocessorStatementContext ctx) {
        return null;
    }

    public Object visitNameSpaceDefinition(ExprezeeneParser.NameSpaceDefinitionContext ctx) {
        return null;
    }

    public Object visitNameSpaceStatement(ExprezeeneParser.NameSpaceStatementContext ctx) {
        return null;
    }

    public Object visitImportStatement(ExprezeeneParser.ImportStatementContext ctx) {
        return null;
    }

    public Object visitScriptPath(ExprezeeneParser.ScriptPathContext ctx) {
        return null;
    }

    public Object visitVarDeclStatement(ExprezeeneParser.VarDeclStatementContext ctx) {
        return null;
    }

    public Object visitVarInitStatement(ExprezeeneParser.VarInitStatementContext ctx) {
        return null;
    }

    public Object visitVarConst(ExprezeeneParser.VarConstContext ctx) {
        return null;
    }

    public Object visitVarAssignStatement(ExprezeeneParser.VarAssignStatementContext ctx) {
        return null;
    }

    public Object visitVarIdentifier(ExprezeeneParser.VarIdentifierContext ctx) {
        return null;
    }

    public Object visitObjInstStatement(ExprezeeneParser.ObjInstStatementContext ctx) {
        return null;
    }

    public Object visitClassDefStatement(ExprezeeneParser.ClassDefStatementContext ctx) {
        return null;
    }

    public Object visitClassIdentifier(ExprezeeneParser.ClassIdentifierContext ctx) {
        return null;
    }

    public Object visitInClassStatement(ExprezeeneParser.InClassStatementContext ctx) {
        return null;
    }

    public Object visitMethodDefStatement(ExprezeeneParser.MethodDefStatementContext ctx) {
        return null;
    }

    public Object visitFuncIdentifier(ExprezeeneParser.FuncIdentifierContext ctx) {
        return null;
    }

    public Object visitInMethodStatement(ExprezeeneParser.InMethodStatementContext ctx) {
        return null;
    }

    public Object visitCondStatement(ExprezeeneParser.CondStatementContext ctx) {
        return null;
    }

    public Object visitIfStatement(ExprezeeneParser.IfStatementContext ctx) {
        return null;
    }

    public Object visitElseIfStatement(ExprezeeneParser.ElseIfStatementContext ctx) {
        return null;
    }

    public Object visitElseStatement(ExprezeeneParser.ElseStatementContext ctx) {
        return null;
    }

    public Object visitInIfStatement(ExprezeeneParser.InIfStatementContext ctx) {
        return null;
    }

    public Object visitLoopStatement(ExprezeeneParser.LoopStatementContext ctx) {
        return null;
    }

    public Object visitWhileloop(ExprezeeneParser.WhileloopContext ctx) {
        return null;
    }

    public Object visitForloop(ExprezeeneParser.ForloopContext ctx) {
        return null;
    }

    public Object visitForeachloop(ExprezeeneParser.ForeachloopContext ctx) {
        return null;
    }

    public Object visitDoWhileloop(ExprezeeneParser.DoWhileloopContext ctx) {
        return null;
    }

    public Object visitInloopStatement(ExprezeeneParser.InloopStatementContext ctx) {
        return null;
    }

    public Object visit(ParseTree parseTree) {
        return null;
    }

    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
