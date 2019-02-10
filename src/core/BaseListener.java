package core;

import core.listener.ExprezeeneListener;
import core.listener.ExprezeeneParser;
import core.structures.*;
import core.structures.Class;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Stack;

public class BaseListener implements ExprezeeneListener{

    private String location;
    private boolean canRun = true;
    public static ArrayList<Script> tempScript = new ArrayList<>();
    public static int currentRow = 0, currentLine = 0;

    //for current Variable
    private String varIdentifier = null;
    private AccessModifier varAccessModifier = AccessModifier.PRIVATE;
    private String varDataType = null;
    private boolean _staticVariable = false, _constVariable = false;
    private String varValue = null;

    //for current method
    private String methodIdentifier = null;
    private AccessModifier methodAccessModifier = AccessModifier.PRIVATE;
    private String methodReturnType = null;
    private boolean _staticMethod = false;

    // state for entering class and function scope
    private boolean inMethodScope = false;
    private boolean inClassScope = false;

    //is entering main method
    private boolean inNamespace = false;
    private RunStage runStage;
    private Stack<Scope> scopeStack;
    private String tempClassName;

    //current analyzed script
    private Script currentScript;

    public BaseListener(RunStage runStage, Script currentScript, String location)
    {
        this.runStage = runStage;
        this.location = location;
        this.scopeStack = new Stack<>();
        this.currentScript = currentScript;
    }

    /*
    check if the outer scope of the class is a class or not a class
    */

    public boolean isStillClassScope()
    {
        String currentScopeName = "";
        for (String loc : location.split("\\."))
        {
            if (!loc.matches("[0-9]+\\$[0-9]+"))
            {
                currentScopeName = loc;
            }
            else
            {
                break;
            }
        }

        for (Class c : DataHandler.getClasses())
        {
            if (c.getIdentifier().equals(currentScopeName) && c.getScope().getLocation().equals(location.substring(0, c.getScope().getLocation().length()))) return true;
        }
        return false;
    }

    public static void resetTempScript()
    {
        tempScript = new ArrayList<>();
    }

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

    }

    public void enterIdentifier(ExprezeeneParser.IdentifierContext ctx) {

    }

    public void exitIdentifier(ExprezeeneParser.IdentifierContext ctx) {

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
        if (canRun)
        {

        }
        else
        {

        }
    }

    public void enterParameterVar(ExprezeeneParser.ParameterVarContext ctx) {

    }

    public void exitParameterVar(ExprezeeneParser.ParameterVarContext ctx) {

    }

    public void enterDefaultValueParameter(ExprezeeneParser.DefaultValueParameterContext ctx) {

    }

    public void exitDefaultValueParameter(ExprezeeneParser.DefaultValueParameterContext ctx) {

    }

    public void enterArguments(ExprezeeneParser.ArgumentsContext ctx) {

    }

    public void exitArguments(ExprezeeneParser.ArgumentsContext ctx) {

        if (canRun)
        {

        }
        else
        {

        }
    }

    public void enterAccmod(ExprezeeneParser.AccmodContext ctx) {

    }

    public void exitAccmod(ExprezeeneParser.AccmodContext ctx) {

    }

    public void enterModifier(ExprezeeneParser.ModifierContext ctx) {

    }

    public void exitModifier(ExprezeeneParser.ModifierContext ctx) {

    }

    public void enterDataType(ExprezeeneParser.DataTypeContext ctx) {

    }

    public void exitDataType(ExprezeeneParser.DataTypeContext ctx) {

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

    public void enterPreprocessorStatement(ExprezeeneParser.PreprocessorStatementContext ctx) {

    }

    public void exitPreprocessorStatement(ExprezeeneParser.PreprocessorStatementContext ctx) {

    }

    public void enterInPreprocessorStatement(ExprezeeneParser.InPreprocessorStatementContext ctx) {

    }

    public void exitInPreprocessorStatement(ExprezeeneParser.InPreprocessorStatementContext ctx) {

    }

    public void enterNameSpaceDefinition(ExprezeeneParser.NameSpaceDefinitionContext ctx) {

        inNamespace = true;

    }

    public void exitNameSpaceDefinition(ExprezeeneParser.NameSpaceDefinitionContext ctx) {

    }

    public void enterNameSpaceStatement(ExprezeeneParser.NameSpaceStatementContext ctx) {

    }

    public void exitNameSpaceStatement(ExprezeeneParser.NameSpaceStatementContext ctx) {

    }

    public void enterImportStatement(ExprezeeneParser.ImportStatementContext ctx) {

    }

    public void exitImportStatement(ExprezeeneParser.ImportStatementContext ctx) {
        currentLine = ctx.start.getLine();
        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_PREPROCESSOR))
        {
            /*
            if 2 import with same path or name is detected, then it would be ignored and the interpreter
            would just gave warnings.
             */
            for (ExprezeeneParser.ScriptPathContext spc: ctx.scriptPath())
            {
                currentRow = spc.start.getCharPositionInLine();
                for (Script sc : ScriptEvaluator2.allScript)
                {
                    if (spc.getText().substring(1, spc.getText().length()-1).equals(sc.getScriptPath()))
                    {
                        Notifier.report(spc.getText().substring(1, spc.getText().length()-1) + " have duplicate(s)", currentScript.getScriptName(), NotifierType.WARNING);
                        return;
                    }
                }

                tempScript.add(new Script(spc.getText().substring(1, spc.getText().length()-1), currentScript, false));
            }
        }
    }

    public void enterScriptPath(ExprezeeneParser.ScriptPathContext ctx) {

    }

    public void exitScriptPath(ExprezeeneParser.ScriptPathContext ctx) {

    }

    public void enterVarDeclStatement(ExprezeeneParser.VarDeclStatementContext ctx) {

    }

    public void exitVarDeclStatement(ExprezeeneParser.VarDeclStatementContext ctx) {

        if (canRun && runStage.equals(RunStage.SCANNING_NON_MAIN_STATEMENT))
        {
            System.out.println("ketemu deklarasi variable");

            /*
            check whether a local variable inside method is have any modifier
            note : a local variable can't have any modifier (neither static modifier nor access modifier)
            */
            if (inMethodScope)
            {

                try
                {
                    if (!ctx.modifier().getText().equals(""))
                    {
                        Notifier.reportException("{Exception occurred] : a local variable can't have any modifier.");
                        return;
                    }
                } catch (Exception e)
                {
                    varAccessModifier = AccessModifier.LOCAL;
                }
            }

            /*
            check whether a class variable is have any modifier
            class variable can have both static modifier, and access modifier.
            */
            else if (inClassScope)
            {
                try
                {
                    if (ctx.modifier().accmod().getText().equals("private")) varAccessModifier = AccessModifier.PRIVATE;
                    else if (ctx.modifier().accmod().getText().equals("public")) varAccessModifier = AccessModifier.PUBLIC;
                    else if (ctx.modifier().accmod().getText().equals("protected")) varAccessModifier = AccessModifier.PROTECTED;
                } catch (Exception e)
                {
                    varAccessModifier = AccessModifier.PRIVATE;
                }
                try
                {
                    _staticVariable = !ctx.modifier().STATIC().getText().isEmpty();
                } catch (Exception e)
                {
                    _staticVariable = false;
                }
            }

            /*
            check if a variable inside a namespace is have any modifier
            note : a namespace variable can have any modifier except static modifier and protected access modifier.
            */
            else if (inNamespace)
            {
                try
                {
                    if (ctx.modifier().accmod().getText().equals("public")) varAccessModifier = AccessModifier.PUBLIC;
                    else if (ctx.modifier().accmod().getText().equals("private")) varAccessModifier = AccessModifier.PRIVATE;
                    else if (ctx.modifier().accmod().getText().equals("protected"))
                    {
                        System.out.println("[Exception Occured] : a namespace variable can't have protected access modifier.");
                        return;
                    }
                } catch (Exception e)
                {
                    varAccessModifier = AccessModifier.PRIVATE; //default access modifier for namespace variable
                }

                try
                {
                    _staticVariable = !ctx.modifier().STATIC().getText().isEmpty();
                } catch (Exception e)
                {
                    _staticVariable = false;
                }
            }

            /*
            check whether a global scope variable is have access modifier, the default is public
            note:
                public : this variable is accessible by an *.xpre file that import the *.xpre file where this variable is currently on.
                private : this variable is not accessible by an *.xpre file that import the *.xpre file where this variable is currently on.
            */
            else
            {

                try
                {
                    if (ctx.modifier().accmod().getText().equals("private"))
                    {
                        varAccessModifier = AccessModifier.PRIVATE;
                    }
                    else if (ctx.modifier().accmod().getText().equals("public"))
                    {
                        varAccessModifier = AccessModifier.PUBLIC;
                    }
                    else if (ctx.modifier().accmod().getText().equals("protected"))
                    {
                        canRun = false;
                        Notifier.reportException("[Exception occurred] : a global variable can't have protected access modifier.");
                        return;
                    }
                } catch (Exception e)
                {
                    varAccessModifier = AccessModifier.PUBLIC;
                }
            }

            /*
            checking if there's variable(s) declaration or initialization with same identifier in some scope.
            the for loop is used just in case there's multiple variable declaration on same line
            */
            for (int varCount = 0; varCount < ctx.varIdentifier().size(); varCount++ )
            {
                varIdentifier = ctx.varIdentifier(varCount).getText();
                for (Variable variable : DataHandler.getVariables())
                {
                    boolean isSameIdentifier = variable.getIdentifier().equals(varIdentifier);
                    boolean isSameScopeDirection = variable.getScope().getLocation().equals(location.substring(0, variable.getScope().getLocation().length()));

                    /*
                    special checker for class and namespace variable, because they could have same type of structure inside them.
                    */
                    boolean isSameLocation = variable.getScope().getLocation().equals(location);

                    /*
                    checking if other variable with same identifier is exist in outer scope of an anonymous scope of a function
                    checking not going checking beyond function scope, so class variable or global variable wouldn't be marked as duplicate.
                    (applied for global method and in-class method).
                    below for global scope
                    */
                    if (inMethodScope && isSameIdentifier && isSameScopeDirection && variable.getScope().getScopeType().equals(ScopeType.METHOD_SCOPE))
                    {
                        Notifier.reportException("[Exception occurred] : 2 or more identical local variable exist in method scope.");
                        return;
                    }
                    else if (inClassScope && isSameIdentifier && isSameLocation && variable.getScope().getScopeType().equals(ScopeType.CLASS_SCOPE))
                    {
                        Notifier.reportException("[Exception occurred] : 2 or more identical class variable exist in class scope.");
                        return;
                    }
                    else if (inNamespace && isSameIdentifier && isSameLocation && variable.getScope().getScopeType().equals(ScopeType.NAMESPACE_SCOPE))
                    {
                        Notifier.reportException("[Exception occurred] : 2 or more identical namespace variable exist in namespace scope.");
                        return;
                    }
                    else if (!(inMethodScope || inClassScope || inNamespace) && isSameIdentifier && variable.getScope().getScopeType().equals(ScopeType.GLOBAL_SCOPE))
                    {
                        Notifier.reportException("[Exception occurred] : 2 or more identical global variable exist in global scope.");
                        return;
                    }
                }

                /*
                check if varDataType is not in primitive data type or reference data type.
                */
                varDataType = ctx.dataType().getText();
                boolean ketemu = false;

                for (String type : DataHandler.PRIMITIVE_TYPES)
                {
                    if (type.equals(varDataType))
                    {
                        ketemu = true;
                        break;
                    }
                }

                if (!ketemu)
                {
                    for (Class c : DataHandler.getClasses())
                    {
                        if (c.getIdentifier().equals(varDataType))
                        {
                            ketemu = true;
                            break;
                        }
                    }
                }

                if (!ketemu)
                {
                    Notifier.reportException("[Exception occurred] : the type of this variable is not defined");
                    return;
                }

                DataHandler.getVariables().add(new Variable(varIdentifier, varAccessModifier, varDataType, _staticVariable, false, location, scopeStack.peek().getScopeType()));
            }

            resetVariable();
        }
        else if (canRun && runStage.equals(RunStage.RUNNING))
        {
            /*
            check whether a local variable inside method is have any modifier
            note : a local variable can't have any modifier (neither static modifier nor access modifier)
            */
//            try
//            {
//                if (!ctx.modifier().getText().equals(""))
//                {
//                    Notifier.reportException("{Exception occurred] : a local variable can't have any modifier.");
//                    return;
//                }
//            } catch (Exception e)
//            {
//                varAccessModifier = AccessModifier.LOCAL;
//            }




        }
    }

    public void enterVarInitStatement(ExprezeeneParser.VarInitStatementContext ctx) {

    }

    public void exitVarInitStatement(ExprezeeneParser.VarInitStatementContext ctx) {

        if (canRun)
        {
            System.out.println("ketemu inisiasi variable");

        /*
        check for scope type
        */


            if (inMethodScope)
            {
                try
                {
                    if (!ctx.modifier().getText().equals(""))
                    {
                        Notifier.reportException("{Exception occurred] : a local variable can't have any modifier.");
                        return;
                    }
                } catch (Exception e)
                {
                    varAccessModifier = AccessModifier.LOCAL;
                }
            }

            /*
            check whether a class variable is have any modifier
            class variable can have both static modifier, and access modifier.
            */
            else if (inClassScope)
            {
                try
                {
                    if (ctx.modifier().accmod().getText().equals("private")) varAccessModifier = AccessModifier.PRIVATE;
                    else if (ctx.modifier().accmod().getText().equals("public")) varAccessModifier = AccessModifier.PUBLIC;
                    else if (ctx.modifier().accmod().getText().equals("protected")) varAccessModifier = AccessModifier.PROTECTED;
                } catch (Exception e)
                {
                    varAccessModifier = AccessModifier.PRIVATE;
                }

                try
                {
                    _staticVariable = !ctx.modifier().STATIC().getText().isEmpty();
                } catch (Exception e)
                {
                    _staticVariable = false;
                }
            }

            /*
            check if a variable inside a namespace is have any modifier
            note : a namespace variable can have any modifier except static modifier and protected access modifier.
            */
            else if (inNamespace)
            {
                try
                {
                    if (ctx.modifier().accmod().getText().equals("public")) varAccessModifier = AccessModifier.PUBLIC;
                    else if (ctx.modifier().accmod().getText().equals("private")) varAccessModifier = AccessModifier.PRIVATE;
                    else if (ctx.modifier().accmod().getText().equals("protected"))
                    {
                        System.out.println("[Exception Occured] : a namespace variable can't have protected access modifier.");
                        return;
                    }
                } catch (Exception e)
                {
                    varAccessModifier = AccessModifier.PRIVATE; //default access modifier for namespace variable
                }

                try
                {
                    _staticVariable = !ctx.modifier().STATIC().getText().isEmpty();
                } catch (Exception e)
                {
                    _staticVariable = false;
                }
            }

            /*
            check whether a global scope variable is have access modifier, the default is public
            note:
                public : this variable is accessible by an *.xpre file that import the *.xpre file where this variable is currently on.
                private : this variable is not accessible by an *.xpre file that import the *.xpre file where this variable is currently on.
            */
            else
            {
                try
                {
                    if (ctx.modifier().accmod().getText().equals("private"))
                    {
                        varAccessModifier = AccessModifier.PRIVATE;
                    }
                    else if (ctx.modifier().accmod().getText().equals("public"))
                    {
                        varAccessModifier = AccessModifier.PUBLIC;
                    }
                    else if (ctx.modifier().accmod().getText().equals("protected"))
                    {
                        canRun = false;
                        Notifier.reportException("[Exception occurred] : a global variable can't have protected access modifier.");
                        return;
                    }
                } catch (Exception e)
                {
                    varAccessModifier = AccessModifier.PUBLIC;
                }
            }


        /*
        check if a constant or variable
        */
            if (ctx.varConst().equals("var")) _constVariable = false;
            else if (ctx.varConst().getText().equals("const")) _constVariable = true;

            /*
        checking if there's variable(s) declaration or initialization with same identifier in some scope.
        */
            varIdentifier = ctx.varIdentifier().getText();
            for (Variable variable : DataHandler.getVariables())
            {
                boolean isSameIdentifier = variable.getIdentifier().equals(varIdentifier);
                boolean isSameScopeDirection = variable.getScope().getLocation().equals(location.substring(0, variable.getScope().getLocation().length()));

                /*
                special checker for class and namespace variable, because they could have same type of structure inside them.
                */
                boolean isSameLocation = variable.getScope().getLocation().equals(location);

                /*
                checking if other variable with same identifier is exist in outer scope of an anonymous scope of a function
                checking not going checking beyond function scope, so class variable or global variable wouldn't be marked as duplicate.
                (applied for global method and in-class method).
                below for global scope
                */
                if (inMethodScope && isSameIdentifier && isSameScopeDirection && variable.getScope().getScopeType().equals(ScopeType.METHOD_SCOPE))
                {
                    Notifier.reportException("[Exception occurred] : 2 or more identical local variable exist in method scope.");
                    return;
                }
                else if (inClassScope && isSameIdentifier && isSameLocation && variable.getScope().getScopeType().equals(ScopeType.CLASS_SCOPE))
                {
                    Notifier.reportException("[Exception occurred] : 2 or more identical class variable exist in class scope.");
                    return;
                }
                else if (inNamespace && isSameIdentifier && isSameLocation && variable.getScope().getScopeType().equals(ScopeType.NAMESPACE_SCOPE))
                {
                    Notifier.reportException("[Exception occurred] : 2 or more identical namespace variable exist in namespace scope.");
                    return;
                }
                else if (!(inMethodScope || inClassScope || inNamespace) && isSameIdentifier && variable.getScope().getScopeType().equals(ScopeType.GLOBAL_SCOPE))
                {
                    Notifier.reportException("[Exception occurred] : 2 or more identical global variable exist in global scope.");
                    return;
                }
            }

        /*
        check if varDataType is not in primitive data type or reference data type.
        */
            varDataType = ctx.dataType().getText();
            boolean ketemu = false;

            for (String type : new String[] {"int", "char", "float", "bool", "double", "long"})
            {
                if (type.equals(varDataType))
                {
                    ketemu = true;
                    break;
                }
            }

            if (!ketemu)
            {
                for (Class c : DataHandler.getClasses())
                {
                    if (c.getIdentifier().equals(varDataType))
                    {
                        ketemu = true;
                        break;
                    }
                }
            }

            if (!ketemu)
            {
                Notifier.reportException("the type of this variable is not defined");
                return;
            }

            /*
            check if the variable exist in entry point (go function), if so, then the variable would be evaluated.
            if not then :

            if the value is in form of non-literal (or an expression that needs to be evaluated) then it would be kept as string of expression
            (to be evaluated later if needed).

            if the value is in form of literal then value would be instantly stored.
             */
            int a = ctx.expr().start.getStartIndex();
            int b = ctx.expr().stop.getStopIndex();
            Interval interval = new Interval(a, b);
            CharStream input = ctx.expr().start.getInputStream();
            varValue = input.getText(interval);
            System.out.println(ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex())));

            resetVariable();
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

    public void enterVarIdentifier(ExprezeeneParser.VarIdentifierContext ctx) {

    }

    public void exitVarIdentifier(ExprezeeneParser.VarIdentifierContext ctx) {

    }

    public void enterObjInstStatement(ExprezeeneParser.ObjInstStatementContext ctx) {

    }

    public void exitObjInstStatement(ExprezeeneParser.ObjInstStatementContext ctx) {

    }

    public void enterClassDefStatement(ExprezeeneParser.ClassDefStatementContext ctx) {

        //check if previously already in class scope


        inClassScope = true;

    }

    public void exitClassDefStatement(ExprezeeneParser.ClassDefStatementContext ctx) {
        if (canRun)
        {
            /*
            adding current scope identifier into location
             */
            location+=  "." + ctx.classIdentifier().getText();

            /*
            check if still in class scope
             */
            if (!isStillClassScope())
            {
                inClassScope = false;
            }




            /*
            subtract current scope identifier from location
             */
            location = location.substring(0, location.length()-ctx.classIdentifier().getText().length()-1);

        }
        else
        {

        }
    }

    public void enterClassIdentifier(ExprezeeneParser.ClassIdentifierContext ctx) {


    }

    public void exitClassIdentifier(ExprezeeneParser.ClassIdentifierContext ctx) {
        tempClassName = ctx.getText();
    }

    public void enterInClassStatement(ExprezeeneParser.InClassStatementContext ctx) {

    }

    public void exitInClassStatement(ExprezeeneParser.InClassStatementContext ctx) {

    }

    public void enterMethodDefStatement(ExprezeeneParser.MethodDefStatementContext ctx) {

        inMethodScope = true;
    }

    public void exitMethodDefStatement(ExprezeeneParser.MethodDefStatementContext ctx) {

        inMethodScope = false;
        scopeStack.pop();

    }

    public void enterFuncIdentifier(ExprezeeneParser.FuncIdentifierContext ctx) {

    }

    public void exitFuncIdentifier(ExprezeeneParser.FuncIdentifierContext ctx) {
        location += "." + ctx.getText();
        scopeStack.add(new Scope(location, ScopeType.METHOD_SCOPE));
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
