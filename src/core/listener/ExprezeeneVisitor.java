// Generated from E:/Rayhan Hamada/Kodingan/Latihan/Java/IJProj/Exprezeene/grammar\Exprezeene.g4 by ANTLR 4.7
package core.listener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprezeeneParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprezeeneVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(ExprezeeneParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(ExprezeeneParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ExprezeeneParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ExprezeeneParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(ExprezeeneParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postFixExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostFixExpr(ExprezeeneParser.PostFixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orLogicExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrLogicExpr(ExprezeeneParser.OrLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orBitWiseExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrBitWiseExpr(ExprezeeneParser.OrBitWiseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andLogicExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndLogicExpr(ExprezeeneParser.AndLogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preFixExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreFixExpr(ExprezeeneParser.PreFixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitShiftExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitShiftExpr(ExprezeeneParser.BitShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(ExprezeeneParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(ExprezeeneParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpr(ExprezeeneParser.MethodCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objInstExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjInstExpr(ExprezeeneParser.ObjInstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccessExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpr(ExprezeeneParser.ArrayAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(ExprezeeneParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(ExprezeeneParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xorBitWiseExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorBitWiseExpr(ExprezeeneParser.XorBitWiseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberAccessExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessExpr(ExprezeeneParser.MemberAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andBitWiseExpr}
	 * labeled alternative in {@link ExprezeeneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndBitWiseExpr(ExprezeeneParser.AndBitWiseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ExprezeeneParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ExprezeeneParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#parameterVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterVar(ExprezeeneParser.ParameterVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#defaultValueParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValueParameter(ExprezeeneParser.DefaultValueParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ExprezeeneParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#accmod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccmod(ExprezeeneParser.AccmodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(ExprezeeneParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ExprezeeneParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ExprezeeneParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(ExprezeeneParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#userDefinedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserDefinedType(ExprezeeneParser.UserDefinedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprezeeneParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#globalScopeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalScopeStatement(ExprezeeneParser.GlobalScopeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#entryPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryPoint(ExprezeeneParser.EntryPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#allowedEntryPointStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllowedEntryPointStatement(ExprezeeneParser.AllowedEntryPointStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(ExprezeeneParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#varDeclStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStatement(ExprezeeneParser.VarDeclStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#varInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInitStatement(ExprezeeneParser.VarInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#varConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarConst(ExprezeeneParser.VarConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#varAssignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignStatement(ExprezeeneParser.VarAssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#objInstStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjInstStatement(ExprezeeneParser.ObjInstStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#classDefStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefStatement(ExprezeeneParser.ClassDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#inClassStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInClassStatement(ExprezeeneParser.InClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#methodDefStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefStatement(ExprezeeneParser.MethodDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#inMethodStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInMethodStatement(ExprezeeneParser.InMethodStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#condStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondStatement(ExprezeeneParser.CondStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ExprezeeneParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(ExprezeeneParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(ExprezeeneParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#inIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInIfStatement(ExprezeeneParser.InIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(ExprezeeneParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(ExprezeeneParser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(ExprezeeneParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#foreachloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachloop(ExprezeeneParser.ForeachloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#doWhileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileloop(ExprezeeneParser.DoWhileloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprezeeneParser#inloopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInloopStatement(ExprezeeneParser.InloopStatementContext ctx);
}