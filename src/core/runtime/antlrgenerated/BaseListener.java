package core.runtime.antlrgenerated;

import core.listener.ExprezeeneListener;
import core.listener.ExprezeeneParser;
import core.notifier.Notifier;
import core.notifier.NotifierType;
import core.runtime.DataHandler;
import core.runtime.RunStage;
import core.runtime.Script;
import core.runtime.ScriptEvaluator2;
import core.structures.class_.Class;

import core.structures.conditionals.ConditionalStatement;
import core.structures.conditionals.ConditionalType;
import core.structures.namespace.NameSpace;
import core.structures.structure_comp.AccessModifier;
import core.structures.structure_comp.Expression;
import core.structures.structure_comp.scope.Scope;
import core.structures.structure_comp.scope.ScopeType;
import core.structures.variable.Variable;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Stack;

public class BaseListener implements ExprezeeneListener{

    private String location;
    public static ArrayList<Script> tempScript = new ArrayList<>();
    private Script currentScript;
    public static int currentRow = 0, currentLine = 0;
    private RunStage runStage;
    private Stack<Scope> scopeStack;

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

    public BaseListener(RunStage runStage, Script currentScript, String location)
    {
        this.runStage = runStage;
        this.location = location;
        this.scopeStack = new Stack<>();
        this.currentScript = currentScript;
        scopeStack.add(new Scope(location, ScopeType.GLOBAL_SCOPE));
    }

    /*
    check if the outer scope of the class is a class or not a class
    */

    public boolean isStillClassScope()
    {
        if (scopeStack.peek().getScopeType().equals(ScopeType.CLASS_SCOPE)) return true;
        else return false;
    }

    public boolean isStillNameSpaceScope()
    {
        if (scopeStack.peek().getScopeType().equals(ScopeType.NAMESPACE_SCOPE)) return true;
        else return false;
    }


    public void popScope()
    {
        location = location.replaceFirst("\\.[^\\.]+$", "");
        scopeStack.pop();
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

    public void enterExpr(ExprezeeneParser.ExprContext ctx) {

    }

    public void exitExpr(ExprezeeneParser.ExprContext ctx) {

    }

    public void enterPrimary(ExprezeeneParser.PrimaryContext ctx) {

    }

    public void exitPrimary(ExprezeeneParser.PrimaryContext ctx) {

    }

    public void enterExpressionStatement(ExprezeeneParser.ExpressionStatementContext ctx) {

    }

    public void exitExpressionStatement(ExprezeeneParser.ExpressionStatementContext ctx) {

        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
        {
            System.out.println("ketemu statement ekspresi");
            /*
            get current line and current row of the statement
             */
            currentLine = ctx.start.getLine();
            currentRow = ctx.start.getCharPositionInLine();

            /*
            * get the expression string and store it to data handler
            * */
            int a = ctx.expr().start.getStartIndex();
            int b = ctx.expr().stop.getStopIndex();
            Interval interval = new Interval(a, b);
            CharStream input = ctx.expr().start.getInputStream();


            if (input.getText(interval).matches(".*[A-Za-z_][A-Za-z0-9_]*$"))
            {
                Notifier.report("\"" + input.getText(interval) + "\" is not a valid statement", currentScript.getScriptName(), NotifierType.ERROR);
            }
            else
            {
                DataHandler.getExpressionStatements().add(new Expression(input.getText(interval), scopeStack.peek()));
                /*
                remove the last Scope element in the scopeStack, then instantiate a new Scope with same properties as the removed scope have.
                */

                int curOrderIndex = scopeStack.peek().getOrderIndex();
                ScopeType st = scopeStack.peek().getScopeType();
                scopeStack.pop();
                scopeStack.add(new Scope(location, st, curOrderIndex));
                scopeStack.peek().incrementOrderIndex();
            }

        }
    }

    public void enterParameter(ExprezeeneParser.ParameterContext ctx) {

    }

    public void exitParameter(ExprezeeneParser.ParameterContext ctx) {
        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
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

        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
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

    public void enterNameSpaceIdentifier(ExprezeeneParser.NameSpaceIdentifierContext ctx) {

    }

    public void exitNameSpaceIdentifier(ExprezeeneParser.NameSpaceIdentifierContext ctx) {

        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
        {
            System.out.println("ketemu namespace");

            DataHandler.getNameSpaces().add(new NameSpace(ctx.getText(), scopeStack.peek()));

            /*
            adding namespace identifier into location
            */
            location += "." + ctx.getText();
            scopeStack.add(new Scope(location, ScopeType.NAMESPACE_SCOPE));
            inNamespace = true;
        }
    }

    public void enterInPreprocessorStatement(ExprezeeneParser.InPreprocessorStatementContext ctx) {

    }

    public void exitInPreprocessorStatement(ExprezeeneParser.InPreprocessorStatementContext ctx) {

    }

    public void enterNameSpaceDefinition(ExprezeeneParser.NameSpaceDefinitionContext ctx) {

        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
        {
            inNamespace = true;
        }

    }

    public void exitNameSpaceDefinition(ExprezeeneParser.NameSpaceDefinitionContext ctx) {

        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
        {
            popScope();
            inNamespace = isStillNameSpaceScope();
        }
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

        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
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
                        Notifier.report("a local variable can't have any modifier.", currentScript.getScriptName(), NotifierType.ERROR);
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
                    if (!ctx.modifier().getText().equals(""))
                    {
                        
                        Notifier.report("a namespace variable can't have any modifier.", currentScript.getScriptName(), NotifierType.ERROR);
                        return;
                    }

                } catch (Exception e)
                {
                    varAccessModifier = AccessModifier.PUBLIC;
                }
            }

            /*
            check whether a global scope variable is have access modifier, the default is public
            note:
                public : this variable is accessible by an *.xpre file that import the *.xpre file where this variable is currently on.
                private : this variable is not accessible by an *.xpre file that import the *.xpre file where this variable is currently on.
            */
            else if (!(inMethodScope || inClassScope || inNamespace))
            {

                try
                {
                    if (!ctx.modifier().getText().equals(""))
                    {
                        
                        Notifier.report("a global variable can't have any modifier.", currentScript.getScriptName(), NotifierType.ERROR);
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
                currentLine = ctx.varIdentifier(varCount).start.getLine();
                currentRow = ctx.varIdentifier(varCount).start.getCharPositionInLine();
                for (Variable variable : DataHandler.getVariables())
                {
                    boolean isSameIdentifier = variable.getIdentifier().equals(varIdentifier);

                    /*
                        determine whether the iterated variable and current variable is in a same direction.
                     */
                    boolean isSameScopeDirection;
                    if (variable.getScope().getLocation().length() < location.length())
                    {
                        isSameScopeDirection = variable.getScope().getLocation().equals(location.substring(0, variable.getScope().getLocation().length()));
                    }
                    else
                    {
                        isSameScopeDirection = location.equals(variable.getScope().getLocation().substring(0, location.length()));
                    }
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
                        Notifier.report("2 local variable with same identifier is detected in method scope.", currentScript.getScriptName(), NotifierType.ERROR);
                        return;
                    }
                    else if (inClassScope && isSameIdentifier && isSameLocation && variable.getScope().getScopeType().equals(ScopeType.CLASS_SCOPE))
                    {
                        Notifier.report("2 class variable with same identifier is detected in class scope.", currentScript.getScriptName(), NotifierType.ERROR);
                        return;
                    }
                    else if (inNamespace && isSameIdentifier && isSameLocation && variable.getScope().getScopeType().equals(ScopeType.NAMESPACE_SCOPE))
                    {
                        Notifier.report("2 variable with same identifier is detected in namespace scope.", currentScript.getScriptName(), NotifierType.ERROR);
                        return;
                    }
                    else if (!(inMethodScope || inClassScope || inNamespace) && isSameIdentifier && variable.getScope().getScopeType().equals(ScopeType.GLOBAL_SCOPE))
                    {
                        Notifier.report("2 variable with same identifier is detected in global scope.", currentScript.getScriptName(), NotifierType.ERROR);
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
                    Notifier.report("the data type of this variable is undefined.", currentScript.getScriptName(), NotifierType.ERROR);
                    return;
                }
//                Scope s = new Scope(scopeStack.peek().getLocation(), scopeStack.peek().getScopeType());

                DataHandler.getVariables().add(new Variable(varIdentifier, varAccessModifier, varDataType, _staticVariable, false, scopeStack.peek()));

            }

            /*
            remove the last Scope element in the scopeStack, then instantiate a new Scope with same properties as the removed scope have.
            this is because to prevent (idk, java behaviour maybe ??) to assume that the assigned scope when instantiated a variable is a reference to the next
            variable instance's scope too. the result of this behaviour is every variable declared in same scope would have same refIndex, and it is wrong.
             */
            int curOrderIndex = scopeStack.peek().getOrderIndex();
            ScopeType st = scopeStack.peek().getScopeType();
            scopeStack.pop();
            scopeStack.add(new Scope(location, st, curOrderIndex));

            /*
            incrementing the ref index
            */
            scopeStack.peek().incrementOrderIndex();

            resetVariable();
        }


    }

    public void enterVarInitStatement(ExprezeeneParser.VarInitStatementContext ctx) {

    }

    public void exitVarInitStatement(ExprezeeneParser.VarInitStatementContext ctx) {

        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
        {
            System.out.println("ketemu inisiasi variable");

            currentLine = ctx.start.getLine();
            currentRow = ctx.start.getCharPositionInLine();

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
                        Notifier.report("a local variable can't have any modifier.", currentScript.getScriptName(), NotifierType.ERROR);
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
                    if (!ctx.modifier().getText().equals(""))
                    {
                        
                        Notifier.report("a namespace variable can't have any modifier.", currentScript.getScriptName(), NotifierType.ERROR);
                        return;
                    }

                } catch (Exception e)
                {
                    varAccessModifier = AccessModifier.PUBLIC;
                }
            }

            /*
            check whether a global scope variable is have access modifier, the default is public
            note:
                public : this variable is accessible by an *.xpre file that import the *.xpre file where this variable is currently on.
                private : this variable is not accessible by an *.xpre file that import the *.xpre file where this variable is currently on.
            */
            else if (!(inMethodScope || inClassScope || inNamespace))
            {
                try
                {
                    if (!ctx.modifier().getText().equals(""))
                    {
                        Notifier.report("a global variable can't have any modifier.", currentScript.getScriptName(), NotifierType.ERROR);
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

                /*
                determine whether the iterated variable and current variable is in a same direction.
                */
                boolean isSameScopeDirection = false;

                if (variable.getScope().getLocation().length() < location.length())
                {
                    isSameScopeDirection = variable.getScope().getLocation().equals(location.substring(0, variable.getScope().getLocation().length()));
                }
                else
                {
                    isSameScopeDirection = location.equals(variable.getScope().getLocation().substring(0, location.length()));
                }
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
                    Notifier.report("2 or more variable with same name exist in method scope.", currentScript.getScriptName(), NotifierType.ERROR);
                    return;
                }
                else if (inClassScope && isSameIdentifier && isSameLocation && variable.getScope().getScopeType().equals(ScopeType.CLASS_SCOPE))
                {
                    Notifier.report("2 or more variable with same name exist in class scope.", currentScript.getScriptName(), NotifierType.ERROR);
                    return;
                }
                else if (inNamespace && isSameIdentifier && isSameLocation && variable.getScope().getScopeType().equals(ScopeType.NAMESPACE_SCOPE))
                {
                    Notifier.report("2 or more variable with same name exist in namespace scope.", currentScript.getScriptName(), NotifierType.ERROR);
                    return;
                }
                else if (!(inMethodScope || inClassScope || inNamespace) && isSameIdentifier && variable.getScope().getScopeType().equals(ScopeType.GLOBAL_SCOPE))
                {
                    Notifier.report("2 or more variable with same name exist in global scope.", currentScript.getScriptName(), NotifierType.ERROR);
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
                Notifier.report("the data type of this variable is undefined", currentScript.getScriptName(), NotifierType.ERROR);
                return;
            }


            int a = ctx.expr().start.getStartIndex();
            int b = ctx.expr().stop.getStopIndex();
            Interval interval = new Interval(a, b);
            CharStream input = ctx.expr().start.getInputStream();
            varValue = input.getText(interval);
            DataHandler.getVariables().add(new Variable(varIdentifier, varAccessModifier, varDataType, _staticVariable, _constVariable, scopeStack.peek(), varValue));

            /*
            remove the last Scope element in the scopeStack, then instantiate a new Scope with same properties as the removed scope have.
            this is because to prevent (idk, java behaviour maybe ??) to assume that the assigned scope when instantiated a variable is a reference to the next
            variable instance's scope too. the result of this behaviour is every variable declared in same scope would have same refIndex, and it is wrong.
             */
            int curOrderIndex = scopeStack.peek().getOrderIndex();
            ScopeType st = scopeStack.peek().getScopeType();
            scopeStack.pop();
            scopeStack.add(new Scope(location, st, curOrderIndex));
            scopeStack.peek().incrementOrderIndex();

            resetVariable();
        }
    }

    public void enterVarConst(ExprezeeneParser.VarConstContext ctx) {

    }

    public void exitVarConst(ExprezeeneParser.VarConstContext ctx) {

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

        currentLine = ctx.start.getLine();
        currentRow = ctx.start.getCharPositionInLine();
        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
        {
            inClassScope = true;
        }

    }

    public void exitClassDefStatement(ExprezeeneParser.ClassDefStatementContext ctx) {

        currentLine = ctx.start.getLine();
        currentRow = ctx.start.getCharPositionInLine();
        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
        {
            popScope();
            inClassScope = isStillClassScope();

        }
    }

    public void enterClassIdentifier(ExprezeeneParser.ClassIdentifierContext ctx) {


    }

    public void exitClassIdentifier(ExprezeeneParser.ClassIdentifierContext ctx) {

        currentLine = ctx.start.getLine();
        currentRow = ctx.start.getCharPositionInLine();
        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
        {
            location += "." + ctx.getText();
            scopeStack.add(new Scope(location, ScopeType.CLASS_SCOPE));
        }
    }

    public void enterInClassStatement(ExprezeeneParser.InClassStatementContext ctx) {

    }

    public void exitInClassStatement(ExprezeeneParser.InClassStatementContext ctx) {

    }

    public void enterMethodDefStatement(ExprezeeneParser.MethodDefStatementContext ctx) {

        currentLine = ctx.start.getLine();
        currentRow = ctx.start.getCharPositionInLine();
        if (ScriptEvaluator2.canRun)
        {
            inMethodScope = true;
        }
    }

    public void exitMethodDefStatement(ExprezeeneParser.MethodDefStatementContext ctx) {

        currentLine = ctx.start.getLine();
        currentRow = ctx.start.getCharPositionInLine();
        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
        {
            popScope();
            inMethodScope = false;
        }

    }

    public void enterFuncIdentifier(ExprezeeneParser.FuncIdentifierContext ctx) {

    }

    public void exitFuncIdentifier(ExprezeeneParser.FuncIdentifierContext ctx) {
        currentLine = ctx.start.getLine();
        currentRow = ctx.start.getCharPositionInLine();
        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
        {

            /*
            check if this method is main method, if so then do nothing, because current run stage is SCANNING_NON_PREPROCESSOR_STATEMENT
            */
            location += "." + ctx.getText();
            scopeStack.add(new Scope(location, ScopeType.METHOD_SCOPE));
        }


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

        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
        {



        }
    }

    public void enterElseIfStatement(ExprezeeneParser.ElseIfStatementContext ctx) {

    }

    public void exitElseIfStatement(ExprezeeneParser.ElseIfStatementContext ctx) {

    }

    public void enterElseStatement(ExprezeeneParser.ElseStatementContext ctx) {

    }

    public void exitElseStatement(ExprezeeneParser.ElseStatementContext ctx) {

    }

    public void enterIfExpr(ExprezeeneParser.IfExprContext ctx) {

    }

    public void exitIfExpr(ExprezeeneParser.IfExprContext ctx) {

        if (ScriptEvaluator2.canRun && runStage.equals(RunStage.SCANNING_NON_PREPROCESSOR_STATEMENT))
        {

            System.out.println("ketemu if statement");

            /*
            * getting expression string
            * */
            int a = ctx.start.getStartIndex();
            int b = ctx.stop.getStopIndex();
            Interval interval = new Interval(a, b);
            CharStream input = ctx.start.getInputStream();

            DataHandler.getConditionalStatements().add(new ConditionalStatement(input.getText(interval), ConditionalType.IF, scopeStack.peek()));
            // format for if statement's scope name : if$refIndex
            location += ".if$" + scopeStack.peek().getOrderIndex();
            scopeStack.add(new Scope(location, ScopeType.METHOD_SCOPE));

        }
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

    public void visitTerminal(TerminalNode terminalNode) {

    }

    public void visitErrorNode(ErrorNode errorNode) {
        System.exit(1);
    }

    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}