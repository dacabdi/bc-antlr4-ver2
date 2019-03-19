// Generated from /home/frogmedia/repos/bc-antlr4-ver2/grammar/bc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(bcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#statement_feed_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_feed_list(bcParser.Statement_feed_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#statement_feed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_feed(bcParser.Statement_feedContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(bcParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#names_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames_list(bcParser.Names_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#auto_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_list(bcParser.Auto_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(bcParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(bcParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_item(bcParser.List_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(bcParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(bcParser.NumberContext ctx);
}