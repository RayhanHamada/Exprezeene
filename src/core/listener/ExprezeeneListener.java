// Generated from E:/Rayhan Hamada/Kodingan/Latihan/Java/IJProj/Exprezeene/grammar\Exprezeene.g4 by ANTLR 4.7
package core.listener;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprezeeneParser}.
 */
public interface ExprezeeneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(ExprezeeneParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(ExprezeeneParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(ExprezeeneParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(ExprezeeneParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ExprezeeneParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ExprezeeneParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(ExprezeeneParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(ExprezeeneParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprezeeneParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprezeeneParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ExprezeeneParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ExprezeeneParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ExprezeeneParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ExprezeeneParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#defaultValueParameter}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValueParameter(ExprezeeneParser.DefaultValueParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#defaultValueParameter}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValueParameter(ExprezeeneParser.DefaultValueParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ExprezeeneParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ExprezeeneParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#accmod}.
	 * @param ctx the parse tree
	 */
	void enterAccmod(ExprezeeneParser.AccmodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#accmod}.
	 * @param ctx the parse tree
	 */
	void exitAccmod(ExprezeeneParser.AccmodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(ExprezeeneParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(ExprezeeneParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExprezeeneParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExprezeeneParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ExprezeeneParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ExprezeeneParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(ExprezeeneParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(ExprezeeneParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#userDefinedType}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedType(ExprezeeneParser.UserDefinedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#userDefinedType}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedType(ExprezeeneParser.UserDefinedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprezeeneParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprezeeneParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#globalScopeStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalScopeStatement(ExprezeeneParser.GlobalScopeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#globalScopeStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalScopeStatement(ExprezeeneParser.GlobalScopeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#entryPoint}.
	 * @param ctx the parse tree
	 */
	void enterEntryPoint(ExprezeeneParser.EntryPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#entryPoint}.
	 * @param ctx the parse tree
	 */
	void exitEntryPoint(ExprezeeneParser.EntryPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#allowedEntryPointStatement}.
	 * @param ctx the parse tree
	 */
	void enterAllowedEntryPointStatement(ExprezeeneParser.AllowedEntryPointStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#allowedEntryPointStatement}.
	 * @param ctx the parse tree
	 */
	void exitAllowedEntryPointStatement(ExprezeeneParser.AllowedEntryPointStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(ExprezeeneParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(ExprezeeneParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#varDeclStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStatement(ExprezeeneParser.VarDeclStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#varDeclStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStatement(ExprezeeneParser.VarDeclStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#varInitStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarInitStatement(ExprezeeneParser.VarInitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#varInitStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarInitStatement(ExprezeeneParser.VarInitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#varAssignStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignStatement(ExprezeeneParser.VarAssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#varAssignStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignStatement(ExprezeeneParser.VarAssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#objInstStatement}.
	 * @param ctx the parse tree
	 */
	void enterObjInstStatement(ExprezeeneParser.ObjInstStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#objInstStatement}.
	 * @param ctx the parse tree
	 */
	void exitObjInstStatement(ExprezeeneParser.ObjInstStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#classDefStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassDefStatement(ExprezeeneParser.ClassDefStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#classDefStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassDefStatement(ExprezeeneParser.ClassDefStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#inClassStatement}.
	 * @param ctx the parse tree
	 */
	void enterInClassStatement(ExprezeeneParser.InClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#inClassStatement}.
	 * @param ctx the parse tree
	 */
	void exitInClassStatement(ExprezeeneParser.InClassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#methodDefStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefStatement(ExprezeeneParser.MethodDefStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#methodDefStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefStatement(ExprezeeneParser.MethodDefStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#inMethodStatement}.
	 * @param ctx the parse tree
	 */
	void enterInMethodStatement(ExprezeeneParser.InMethodStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#inMethodStatement}.
	 * @param ctx the parse tree
	 */
	void exitInMethodStatement(ExprezeeneParser.InMethodStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#condStatement}.
	 * @param ctx the parse tree
	 */
	void enterCondStatement(ExprezeeneParser.CondStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#condStatement}.
	 * @param ctx the parse tree
	 */
	void exitCondStatement(ExprezeeneParser.CondStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExprezeeneParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExprezeeneParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(ExprezeeneParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(ExprezeeneParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(ExprezeeneParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(ExprezeeneParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#inIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterInIfStatement(ExprezeeneParser.InIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#inIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitInIfStatement(ExprezeeneParser.InIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#looperatorStatement}.
	 * @param ctx the parse tree
	 */
	void enterLooperatorStatement(ExprezeeneParser.LooperatorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#looperatorStatement}.
	 * @param ctx the parse tree
	 */
	void exitLooperatorStatement(ExprezeeneParser.LooperatorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#whileLooperator}.
	 * @param ctx the parse tree
	 */
	void enterWhileLooperator(ExprezeeneParser.WhileLooperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#whileLooperator}.
	 * @param ctx the parse tree
	 */
	void exitWhileLooperator(ExprezeeneParser.WhileLooperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#forLooperator}.
	 * @param ctx the parse tree
	 */
	void enterForLooperator(ExprezeeneParser.ForLooperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#forLooperator}.
	 * @param ctx the parse tree
	 */
	void exitForLooperator(ExprezeeneParser.ForLooperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#foreachLooperator}.
	 * @param ctx the parse tree
	 */
	void enterForeachLooperator(ExprezeeneParser.ForeachLooperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#foreachLooperator}.
	 * @param ctx the parse tree
	 */
	void exitForeachLooperator(ExprezeeneParser.ForeachLooperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#doWhileLooperator}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLooperator(ExprezeeneParser.DoWhileLooperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#doWhileLooperator}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLooperator(ExprezeeneParser.DoWhileLooperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#inLooperatorStatement}.
	 * @param ctx the parse tree
	 */
	void enterInLooperatorStatement(ExprezeeneParser.InLooperatorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#inLooperatorStatement}.
	 * @param ctx the parse tree
	 */
	void exitInLooperatorStatement(ExprezeeneParser.InLooperatorStatementContext ctx);
}