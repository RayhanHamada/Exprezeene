// Generated from D:/RayhanHamada/CodingStuff/Project/Exprezeene/grammar\Exprezeene.g4 by ANTLR 4.7.2
package core.listener;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprezeeneParser}.
 */
public interface ExprezeeneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ExprezeeneParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ExprezeeneParser.IdentifierContext ctx);
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
	 * Enter a parse tree produced by {@link ExprezeeneParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ExprezeeneParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ExprezeeneParser.ExpressionStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ExprezeeneParser#parameterVar}.
	 * @param ctx the parse tree
	 */
	void enterParameterVar(ExprezeeneParser.ParameterVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#parameterVar}.
	 * @param ctx the parse tree
	 */
	void exitParameterVar(ExprezeeneParser.ParameterVarContext ctx);
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
	 * Enter a parse tree produced by {@link ExprezeeneParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(ExprezeeneParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(ExprezeeneParser.DataTypeContext ctx);
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
	 * Enter a parse tree produced by {@link ExprezeeneParser#preprocessorStatement}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorStatement(ExprezeeneParser.PreprocessorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#preprocessorStatement}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorStatement(ExprezeeneParser.PreprocessorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#inPreprocessorStatement}.
	 * @param ctx the parse tree
	 */
	void enterInPreprocessorStatement(ExprezeeneParser.InPreprocessorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#inPreprocessorStatement}.
	 * @param ctx the parse tree
	 */
	void exitInPreprocessorStatement(ExprezeeneParser.InPreprocessorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#nameSpaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNameSpaceDefinition(ExprezeeneParser.NameSpaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#nameSpaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNameSpaceDefinition(ExprezeeneParser.NameSpaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#nameSpaceIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterNameSpaceIdentifier(ExprezeeneParser.NameSpaceIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#nameSpaceIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitNameSpaceIdentifier(ExprezeeneParser.NameSpaceIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#nameSpaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterNameSpaceStatement(ExprezeeneParser.NameSpaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#nameSpaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitNameSpaceStatement(ExprezeeneParser.NameSpaceStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ExprezeeneParser#scriptPath}.
	 * @param ctx the parse tree
	 */
	void enterScriptPath(ExprezeeneParser.ScriptPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#scriptPath}.
	 * @param ctx the parse tree
	 */
	void exitScriptPath(ExprezeeneParser.ScriptPathContext ctx);
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
	 * Enter a parse tree produced by {@link ExprezeeneParser#varIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVarIdentifier(ExprezeeneParser.VarIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#varIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVarIdentifier(ExprezeeneParser.VarIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#varConst}.
	 * @param ctx the parse tree
	 */
	void enterVarConst(ExprezeeneParser.VarConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#varConst}.
	 * @param ctx the parse tree
	 */
	void exitVarConst(ExprezeeneParser.VarConstContext ctx);
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
	 * Enter a parse tree produced by {@link ExprezeeneParser#classIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterClassIdentifier(ExprezeeneParser.ClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#classIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitClassIdentifier(ExprezeeneParser.ClassIdentifierContext ctx);
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
	 * Enter a parse tree produced by {@link ExprezeeneParser#funcIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFuncIdentifier(ExprezeeneParser.FuncIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#funcIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFuncIdentifier(ExprezeeneParser.FuncIdentifierContext ctx);
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
	 * Enter a parse tree produced by {@link ExprezeeneParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(ExprezeeneParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(ExprezeeneParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(ExprezeeneParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(ExprezeeneParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(ExprezeeneParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(ExprezeeneParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(ExprezeeneParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(ExprezeeneParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#foreachloop}.
	 * @param ctx the parse tree
	 */
	void enterForeachloop(ExprezeeneParser.ForeachloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#foreachloop}.
	 * @param ctx the parse tree
	 */
	void exitForeachloop(ExprezeeneParser.ForeachloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#doWhileloop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileloop(ExprezeeneParser.DoWhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#doWhileloop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileloop(ExprezeeneParser.DoWhileloopContext ctx);
}