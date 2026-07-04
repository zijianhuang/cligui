// Generated from c:/VsProjects/OpenSource/cligui/Fonlow.AntlrParser/Arguments.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArgumentsParser}.
 */
public interface ArgumentsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArgumentsParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(ArgumentsParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgumentsParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(ArgumentsParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArgumentsParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(ArgumentsParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgumentsParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(ArgumentsParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArgumentsParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ArgumentsParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgumentsParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ArgumentsParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArgumentsParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void enterParameterName(ArgumentsParser.ParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgumentsParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void exitParameterName(ArgumentsParser.ParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArgumentsParser#fixedParameter}.
	 * @param ctx the parse tree
	 */
	void enterFixedParameter(ArgumentsParser.FixedParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgumentsParser#fixedParameter}.
	 * @param ctx the parse tree
	 */
	void exitFixedParameter(ArgumentsParser.FixedParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArgumentsParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ArgumentsParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgumentsParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ArgumentsParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArgumentsParser#quotedString}.
	 * @param ctx the parse tree
	 */
	void enterQuotedString(ArgumentsParser.QuotedStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgumentsParser#quotedString}.
	 * @param ctx the parse tree
	 */
	void exitQuotedString(ArgumentsParser.QuotedStringContext ctx);
}