package edu.csus.plugin.securecodingassistant.rules;

import java.util.TreeMap;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;

import edu.csus.plugin.securecodingassistant.Globals;

/**
 * Interface for a secure coding rule
 * @author Ben White
 *
 */
public interface IRule {
	
	/**
	 * Checks to see if the rule has been violated in a given node
	 * @param node The node to be evaluated
	 * @return true if the rule was violated, false otherwise
	 */
	public boolean violated(ASTNode node);
	
	/**
	 * The description of the rule that was violated
	 * @return The description of the rule that was violated
	 */
	public String getRuleText();
	
	/**
	 * The name of the rule violated
	 * @return The name of the rule violated
	 */
	public String getRuleName();
	
	/**
	 * The ID of the rule violated
	 * @return The name of the rule violated
	 */
	public String getRuleID();
	
	/**
	 * The recommended action that will satisfy the rule
	 * @return The recommended action that will satisfy the rule
	 */
	public String getRuleRecommendation();
	
	/**
	 * The security level of the violated rule}
	 * @return A {@link Globals.Markers} security level
	 * @see Globals.Markers
	 */
	public int securityLevel();
	
	public TreeMap<String, ASTRewrite> getSolutions(ASTNode node);
	
	public ICompilationUnit getICompilationUnit();
	
}
