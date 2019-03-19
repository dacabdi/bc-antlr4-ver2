// Generated from grammar/bc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bcParser}.
 */
public interface bcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(bcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(bcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(bcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(bcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#names_list}.
	 * @param ctx the parse tree
	 */
	void enterNames_list(bcParser.Names_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#names_list}.
	 * @param ctx the parse tree
	 */
	void exitNames_list(bcParser.Names_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#auto_list}.
	 * @param ctx the parse tree
	 */
	void enterAuto_list(bcParser.Auto_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#auto_list}.
	 * @param ctx the parse tree
	 */
	void exitAuto_list(bcParser.Auto_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(bcParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(bcParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(bcParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(bcParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#list_item}.
	 * @param ctx the parse tree
	 */
	void enterList_item(bcParser.List_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#list_item}.
	 * @param ctx the parse tree
	 */
	void exitList_item(bcParser.List_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(bcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(bcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(bcParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(bcParser.NumberContext ctx);
}