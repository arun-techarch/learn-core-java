package com.aruntech._02_operators;

/**
 * comparison operator is used to compare the values and return boolean value to tell 
 * whether condition was satisfied or not.
 * operators: ==, >, >=, <, <=, !=
 */
public class _03_ComparisionOperator {

	public static void main(String[] args) {
		System.out.println("Comparision Operator");
		int a = 5;
		int b = 8;
		// comparison operator on numeric will check the value directly from the memory
		System.out.printf("%d == %d: %b\n", a, b, (a == b)); // a and b are equal
		System.out.printf("%d > %d: %b\n", a, b, (a > b));   // a is greater than b
		System.out.printf("%d >= %d: %b\n", a, b, (a >= b)); // a is greater than or equal to b
		System.out.printf("%d < %d: %b\n", a, b, (a < b)); // a is less than b
		System.out.printf("%d <= %d: %b\n", a, b, (a <= b)); // a is lesser than or equal to b
		System.out.printf("%d != %d: %b\n", a, b, (a != b)); // a is not equal to b
	}
}
