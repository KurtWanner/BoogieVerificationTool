// Generated from src/main/java/org/VerificationTool/Boogie/Boogie.g4 by ANTLR 4.13.2
package org.VerificationTool.Boogie;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BoogieParser}.
 */
public interface BoogieListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BoogieParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSpec(BoogieParser.SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoogieParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSpec(BoogieParser.SpecContext ctx);
}