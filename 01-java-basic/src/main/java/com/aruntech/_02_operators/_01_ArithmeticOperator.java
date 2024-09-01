package com.aruntech._02_operators;

/**
 * Arithmetic operator will help to perform the all arithmetic operation on numeric datatype
 * it should have two operands and one operator to perform the operations
 * e.g: 10+20=30 means 10, 20 are operands and + is the operator which add and print 30 as result
 * operator: +, -, *, /, //, % 
 */
public class _01_ArithmeticOperator {

	public static void main(String[] args) {
		int a = 20;
		int b = 7;
		
		System.out.println("Arithmetic Operation:");
		// add two numbers
		System.out.printf("%d %s %d = %d\n", a, "+", b, (a+b));
		// subtract two numbers
		System.out.printf("%d %s %d = %d\n", a, "-", b, (a-b));
		// multiply two numbers
		System.out.printf("%d %s %d = %d\n", a, "*", b, (a*b));
		// divide two numbers and return quotient result
		System.out.printf("%d %s %d = %d\n", a, "/", b, (a/b));
		// divide the number then return the remainder value
		System.out.printf("%d %s %d = %d\n", a, "%", b, (a%b));
	}
}
