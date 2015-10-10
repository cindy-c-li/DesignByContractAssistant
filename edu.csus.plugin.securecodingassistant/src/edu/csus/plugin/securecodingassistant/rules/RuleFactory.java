package edu.csus.plugin.securecodingassistant.rules;

import java.util.ArrayList;

/**
 * Creates a set of rules that implement the <code>IRule</code> interface
 * @author Ben White
 * @see IRule
 */
public final class RuleFactory {
	/**
	 * Cannot instantiate
	 */
	private RuleFactory() {
		
	}
	
	/**
	 * Creates a collection of all possible rules to test
	 * @return A collection of all possible rules to test
	 */
	public static ArrayList<IRule> getAllRules() {
		ArrayList<IRule> rules = new ArrayList<IRule>();
		
		// 00. Input Validation and Data Sanitization
		rules.add(new IDS00J_PreventSQLInjection());
		rules.add(new IDS01J_NormalizeStringsBeforeValidating());
		rules.add(new IDS07J_RuntimeExecMethod());
		rules.add(new IDS11J_ModyStringsBeforeValidation());
		
		// 01. Declarations and Initialization
		rules.add(new DCL02J_DoNotModifyElements());
		
		// 02. Expressions
		rules.add(new EXP00J_DoNotIgnoreValuesReturnedByMethods());
		rules.add(new EXP02J_DoNotUseObjectEquaslToCompareArrays());
		
		// 03. Numeric Types and Operations
		rules.add(new NUM07J_DoNotAttemptComparisonsWithNaN());
		rules.add(new NUM09J_DoNotUseFloatingPointAsLoopCounters());
		
		// 04. Characters and Strings
		rules.add(new STR00J_PartialCharFromVarWidthEnc());
		
		// 07. Exceptional Behavior
		rules.add(new ERR08J_DoNotCatchNullPointerException());
		
		// 13. Input Output
		rules.add(new FIO08J_DistinguishBetweenCharactersOrBytes());
		
		// 16. Runtime Environment
		rules.add(new ENV02J_DoNotTurstTheValuesOfEnvironmentVariables());
		
		// 49. Miscellaneous
		rules.add(new MSC02J_GenerateStrongRandomNumbers());
		
		return rules;
	}
}
