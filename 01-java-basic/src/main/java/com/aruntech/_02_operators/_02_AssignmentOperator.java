package com.aruntech._02_operators;

/**
 * Assignment operator will assign the value to the variable after performing the operation
 * there are two types
 *   - simple: =
 *   - compound: +=, -=, *=, /=, %=
 */
public class _02_AssignmentOperator {

	public static void main(String[] args) {
		System.out.println("Assignment Operators");
		// simple assignment operator
		int a = 10;
		
		System.out.println("Initial value: " + a);
		a+=5; //shorthand of a = a + 5
		System.out.println("After + 5: " + a);
		a -= 3; //shorthand of a = a - 3
		System.out.println("After - 3: " + a);
		a *= 2; //shorthand of a = a * 2
		System.out.println("After * 2: " + a);
		a /= 6; //shorthand of a = a / 6
		System.out.println("After / 6: " + a);
		a %= 3; //shorthand of a = a % 3
		System.out.println("After % 3: " + a);
	}

}
