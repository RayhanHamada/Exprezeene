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
	 * Enter a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(ExprezeeneParser.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(ExprezeeneParser.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postFixExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostFixExpr(ExprezeeneParser.PostFixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postFixExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostFixExpr(ExprezeeneParser.PostFixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orLogicExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrLogicExpr(ExprezeeneParser.OrLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orLogicExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrLogicExpr(ExprezeeneParser.OrLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orBitWiseExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrBitWiseExpr(ExprezeeneParser.OrBitWiseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orBitWiseExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrBitWiseExpr(ExprezeeneParser.OrBitWiseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andLogicExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndLogicExpr(ExprezeeneParser.AndLogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andLogicExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndLogicExpr(ExprezeeneParser.AndLogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preFixExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPreFixExpr(ExprezeeneParser.PreFixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preFixExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPreFixExpr(ExprezeeneParser.PreFixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitShiftExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftExpr(ExprezeeneParser.BitShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitShiftExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftExpr(ExprezeeneParser.BitShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(ExprezeeneParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(ExprezeeneParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(ExprezeeneParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(ExprezeeneParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(ExprezeeneParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(ExprezeeneParser.MethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objInstExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjInstExpr(ExprezeeneParser.ObjInstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objInstExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjInstExpr(ExprezeeneParser.ObjInstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccessExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpr(ExprezeeneParser.ArrayAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccessExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpr(ExprezeeneParser.ArrayAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(ExprezeeneParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(ExprezeeneParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ExprezeeneParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ExprezeeneParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorBitWiseExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterXorBitWiseExpr(ExprezeeneParser.XorBitWiseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorBitWiseExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitXorBitWiseExpr(ExprezeeneParser.XorBitWiseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccessExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpr(ExprezeeneParser.MemberAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccessExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpr(ExprezeeneParser.MemberAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andBitWiseExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndBitWiseExpr(ExprezeeneParser.AndBitWiseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andBitWiseExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndBitWiseExpr(ExprezeeneParser.AndBitWiseExprContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ExprezeeneParser#inloopStatement}.
	 * @param ctx the parse tree
	 */
	void enterInloopStatement(ExprezeeneParser.InloopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprezeeneParser#inloopStatement}.
	 * @param ctx the parse tree
	 */
	void exitInloopStatement(ExprezeeneParser.InloopStatementContext ctx);
}