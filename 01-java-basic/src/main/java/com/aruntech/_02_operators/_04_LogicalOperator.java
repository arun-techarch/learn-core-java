package com.aruntech._02_operators;

/**
 * logical operator to evaluate the expression and return boolean value
 * logical operator
 *   - logical AND: follow AND truth table
 *   - logical OR: follow OR truth table
 *   - logical NOT: reciprocal of expression (flip the value)
 *  logical AND and OR are called as short circuit expression i.e it will be evaluated 
 *  from right to left. If the first expression is false for logical AND then there is no 
 *  need to evaluate the second expression else if first expression true then only it evaluate the second expression
 *  Similarly, logical OR first expression was true then there is not required to evaluate second expression.
 */
public class _04_LogicalOperator {

	public static void main(String[] args) {
		System.out.println("Logical Operator");
		int mark1 = 70;
		int mark2 = 32;
		
		/*
		 * AND Truth Table
		 *    a      b      a && b
		 *   TRUE   TRUE     TRUE
		 *   TRUE   FALSE    FALSE
		 *   FALSE  TRUE     FALSE
		 *   FALSE  FALSE    FALSE
		 */
		boolean isPass = (mark1 > 35) && (mark2 > 35);
		System.out.println("Mark1: " + mark1);
		System.out.println("Mark2: " + mark2);
		System.out.printf("Pass: %b\n", isPass);
		
		/*
		 * OR Truth Table
		 *    a      b      a || b
		 *   TRUE   TRUE     TRUE
		 *   TRUE   FALSE    TRUE
		 *   FALSE  TRUE     TRUE
		 *   FALSE  FALSE    FALSE
		 */
		boolean isImprovement = (mark1 > 50) || (mark2 > 50);
		System.out.printf("Improvement: %b\n", isImprovement);
		boolean isSplClass = !(isImprovement);
		System.out.printf("Special Class: %b\n", isSplClass);
	}

}
