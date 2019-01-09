package core;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import core.listener.ExprezeeneListener;
import core.listener.ExprezeeneParser;
import core.structures.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import sun.reflect.generics.scope.Scope;

import javax.xml.crypto.Data;
import java.util.Arrays;

public class BaseListener implements ExprezeeneListener{

    private static String location = "GLOBAL";
    private static boolean canRun = true;

    //for current Variable
    private static String varIdentifier = null;
    private static AccessModifier varAccessModifier = AccessModifier.PRIVATE;
    private static String varDataType = null;
    private static boolean _staticVariable = false, _constVariable = false;
    private static String varValue = null;

    //for current method
    private static String methodIdentifier = null;
    private static AccessModifier methodAccessModifier = AccessModifier.PRIVATE;
    private static String methodReturnType = null;
    private static boolean _staticMethod = false;
    private static Parameter[] methodParam = null;

    // state for entering class and function scope
    private static boolean isEnterMethodDef = false;
    private static boolean isEnterClassDef = false;

    public void resetVariable()
    {
        varIdentifier = null;
        varAccessModifier = AccessModifier.PRIVATE;
        varDataType = null;
        _staticVariable = false;
        _constVariable = false;
        varValue = null;


    }

    public void resetMethod()
    {
        methodIdentifier = null;
        methodAccessModifier = AccessModifier.PRIVATE;
        methodReturnType = null;
        _staticMethod= false;
        methodParam = null;
    }

    public static boolean checkIfFunction(String location)
    {
        for (Method method : DataHandler.getMethods())
        {
            if (method.getScopeName().equals(location))
            {
                return true;
            }
        }
        return false;
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

    public void enterAssignmentExpr(ExprezeeneParser.AssignmentExprContext ctx) {

    }

    public void exitAssignmentExpr(ExprezeeneParser.AssignmentExprContext ctx) {

    }

    public void enterPostFixExpr(ExprezeeneParser.PostFixExprContext ctx) {

    }

    public void exitPostFixExpr(ExprezeeneParser.PostFixExprContext ctx) {

    }

    public void enterOrLogicExpr(ExprezeeneParser.OrLogicExprContext ctx) {

    }

    public void exitOrLogicExpr(ExprezeeneParser.OrLogicExprContext ctx) {

    }

    public void enterOrBitWiseExpr(ExprezeeneParser.OrBitWiseExprContext ctx) {

    }

    public void exitOrBitWiseExpr(ExprezeeneParser.OrBitWiseExprContext ctx) {

    }

    public void enterAndLogicExpr(ExprezeeneParser.AndLogicExprContext ctx) {

    }

    public void exitAndLogicExpr(ExprezeeneParser.AndLogicExprContext ctx) {

    }

    public void enterPreFixExpr(ExprezeeneParser.PreFixExprContext ctx) {

    }

    public void exitPreFixExpr(ExprezeeneParser.PreFixExprContext ctx) {

    }

    public void enterBitShiftExpr(ExprezeeneParser.BitShiftExprContext ctx) {

    }

    public void exitBitShiftExpr(ExprezeeneParser.BitShiftExprContext ctx) {

    }

    public void enterRelationalExpr(ExprezeeneParser.RelationalExprContext ctx) {

    }

    public void exitRelationalExpr(ExprezeeneParser.RelationalExprContext ctx) {

    }

    public void enterMultExpr(ExprezeeneParser.MultExprContext ctx) {

    }

    public void exitMultExpr(ExprezeeneParser.MultExprContext ctx) {

    }

    public void enterMethodCallExpr(ExprezeeneParser.MethodCallExprContext ctx) {

    }

    public void exitMethodCallExpr(ExprezeeneParser.MethodCallExprContext ctx) {

    }

    public void enterObjInstExpr(ExprezeeneParser.ObjInstExprContext ctx) {

    }

    public void exitObjInstExpr(ExprezeeneParser.ObjInstExprContext ctx) {

    }

    public void enterArrayAccessExpr(ExprezeeneParser.ArrayAccessExprContext ctx) {

    }

    public void exitArrayAccessExpr(ExprezeeneParser.ArrayAccessExprContext ctx) {

    }

    public void enterPrimaryExpr(ExprezeeneParser.PrimaryExprContext ctx) {

    }

    public void exitPrimaryExpr(ExprezeeneParser.PrimaryExprContext ctx) {

    }

    public void enterAddExpr(ExprezeeneParser.AddExprContext ctx) {

    }

    public void exitAddExpr(ExprezeeneParser.AddExprContext ctx) {

    }

    public void enterXorBitWiseExpr(ExprezeeneParser.XorBitWiseExprContext ctx) {

    }

    public void exitXorBitWiseExpr(ExprezeeneParser.XorBitWiseExprContext ctx) {

    }

    public void enterMemberAccessExpr(ExprezeeneParser.MemberAccessExprContext ctx) {

    }

    public void exitMemberAccessExpr(ExprezeeneParser.MemberAccessExprContext ctx) {

    }

    public void enterAndBitWiseExpr(ExprezeeneParser.AndBitWiseExprContext ctx) {

    }

    public void exitAndBitWiseExpr(ExprezeeneParser.AndBitWiseExprContext ctx) {

    }

    public void enterPrimary(ExprezeeneParser.PrimaryContext ctx) {

    }

    public void exitPrimary(ExprezeeneParser.PrimaryContext ctx) {

    }

    public void enterParameter(ExprezeeneParser.ParameterContext ctx) {

    }

    public void exitParameter(ExprezeeneParser.ParameterContext ctx) {

    }

    @Override
    public void enterParameterVar(ExprezeeneParser.ParameterVarContext ctx) {

    }

    @Override
    public void exitParameterVar(ExprezeeneParser.ParameterVarContext ctx) {

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
        if (canRun)
        {
            //run the non-Excepted code here

        }
        else
        {
            //not running the Excepted code, display error message

        }
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

        System.out.println(ctx.getText());
        if (canRun) {
            System.out.println("ketemu vardecl");

            ScopeType scopeType;
            if (isEnterMethodDef)
            {
                scopeType = ScopeType.FUNCTION_SCOPE;
                System.out.println("function scope");
            }
            else if (isEnterClassDef && !isEnterMethodDef)
            {
                scopeType = ScopeType.CLASS_SCOPE;
                System.out.println("class scope");
            }
            else
            {
                scopeType = ScopeType.GLOBAL_SCOPE;
                System.out.println("global scope");
            }


            try {
                if (ctx.modifier().accmod().getText().equals("private")) varAccessModifier = AccessModifier.PRIVATE;
                else if (ctx.modifier().accmod().getText().equals("public")) varAccessModifier = AccessModifier.PUBLIC;
                else varAccessModifier = AccessModifier.PROTECTED;
            } catch (NullPointerException e) {
                varAccessModifier = AccessModifier.PRIVATE;
            }

            try {
                if (ctx.modifier().STATIC().getText().equals("static")) _staticVariable = true;
            } catch (NullPointerException e) {
                _staticVariable = false;
            }

            varIdentifier = ctx.IDENTIFIER().get(0).getText();

            /*
            checking if there's variable(s) declaration or initialization with same identifier in some scope.
             */
            for (Variable variable : DataHandler.getVariables())
            {
                boolean isSameIdentifier = variable.getIdentifier().equals(varIdentifier);
                boolean isSameScopeDirection = variable.getScope().equals(location.substring(0, variable.getScope().length()));
                /*
                checking if other variable with same identifier is exist in outer scope of an anonymous scope of a function
                checking not going checking beyond function scope, so class variable or global variable wouldn't be marked as duplicate.
                (applied for global method and in-class method).
                below for in-class method.
                */
                if (isEnterMethodDef && isSameIdentifier && isSameScopeDirection && variable.getScopeType().equals(ScopeType.FUNCTION_SCOPE))
                {
                    canRun = false;
                    ExceptionHandler.reportException("A local variable declaration with same identifier as previous declared or initialized variable is detected.");
                    return;
                }
                else if (isEnterClassDef && isSameIdentifier && isSameScopeDirection )
                {
                    canRun = false;
                    ExceptionHandler.reportException("A class variable declaration with same identifier as previous declared or initialized variable is detected.");
                    return;
                }

            }

//            for ()

            varDataType = ctx.type().getText();
            DataHandler.getVariables().add(new Variable(varIdentifier, varAccessModifier, varDataType, _staticVariable, false, location, scopeType));
            System.out.println("this operation success");
        } else
        {
            // skip and print error message
        }
    }

    public void enterVarInitStatement(ExprezeeneParser.VarInitStatementContext ctx) {

    }

    public void exitVarInitStatement(ExprezeeneParser.VarInitStatementContext ctx) {

        if (canRun)
        {


        }
        else
        {
            // if an error occurred, then the program would not run and outputting error message
        }
    }

    public void enterVarConst(ExprezeeneParser.VarConstContext ctx) {

    }

    public void exitVarConst(ExprezeeneParser.VarConstContext ctx) {

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

        isEnterClassDef = true;
    }

    public void exitClassDefStatement(ExprezeeneParser.ClassDefStatementContext ctx) {
        isEnterClassDef = false;
    }

    public void enterInClassStatement(ExprezeeneParser.InClassStatementContext ctx) {

    }

    public void exitInClassStatement(ExprezeeneParser.InClassStatementContext ctx) {

    }

    public void enterMethodDefStatement(ExprezeeneParser.MethodDefStatementContext ctx) {
        isEnterMethodDef = true;
    }

    public void exitMethodDefStatement(ExprezeeneParser.MethodDefStatementContext ctx) {

        isEnterMethodDef= false;
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

    public void enterLoopStatement(ExprezeeneParser.LoopStatementContext ctx) {

    }

    public void exitLoopStatement(ExprezeeneParser.LoopStatementContext ctx) {

    }

    public void enterWhileloop(ExprezeeneParser.WhileloopContext ctx) {

    }

    public void exitWhileloop(ExprezeeneParser.WhileloopContext ctx) {

    }

    public void enterForloop(ExprezeeneParser.ForloopContext ctx) {

    }

    public void exitForloop(ExprezeeneParser.ForloopContext ctx) {

    }

    public void enterForeachloop(ExprezeeneParser.ForeachloopContext ctx) {

    }

    public void exitForeachloop(ExprezeeneParser.ForeachloopContext ctx) {

    }

    public void enterDoWhileloop(ExprezeeneParser.DoWhileloopContext ctx) {

    }

    public void exitDoWhileloop(ExprezeeneParser.DoWhileloopContext ctx) {

    }

    public void enterInloopStatement(ExprezeeneParser.InloopStatementContext ctx) {

    }

    public void exitInloopStatement(ExprezeeneParser.InloopStatementContext ctx) {

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
