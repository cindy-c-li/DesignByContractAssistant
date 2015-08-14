package edu.csus.plugin.securecodingassistant.rules;

import org.eclipse.jdt.core.dom.ASTNode;

/**
 * Interface for a secure coding rule
 * @author Ben White
 *
 */
public interface IRule {
	
	/**
	 * Checks to see if the rule has been violated in a given expression
	 * @param node The node to be evaluated
	 * @return true if the rule was violated, false otherwise
	 */
	public boolean violated(ASTNode node);
	
	/**
	 * The description of the rule being violated
	 * @return Text string describing the rule violated
	 */
	public String getRuleDescription();
	
	/**
	 * The recommendation for resolving the rule violation
	 * @return Text string with recommendation for resolving the
	 * 		rule violation
	 */
	public String getRuleRecommendation();
}
