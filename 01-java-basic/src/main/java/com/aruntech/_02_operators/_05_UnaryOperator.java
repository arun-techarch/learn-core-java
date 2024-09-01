package com.aruntech._02_operators;

/**
 * unary operator perform the operation on one operand. it may be used to
 * perform increment, decrement and invert the value.
 */
public class _05_UnaryOperator {
	
	public static void main(String[] args) {
		System.out.println("Unary Operators");

		// negate the actual value use - operator
		int x = -5;
		int y = -x;
		System.out.println(y);

		// convert to numeric type use + operator
		y = +x;
		System.out.println(x);
		System.out.println();

		x = 10;
		// pre-increment for increment the value by 1 then assign
		System.out.println("pre-increment of ++");
		System.out.println("Initial Value: " + x);
		System.out.println("After pre-increment: " + ++x); // print 11
		System.out.println("After pre-increment: " + ++x); // print 12
		System.out.println();

		x = 10;
		//post-increment will assign the value then increment by 1
		System.out.println("post-increment of ++");
		System.out.println("Initial Value: " + x);
		System.out.println("After post-increment: " + x++);  // print 10
		System.out.println("After post-increment: " + x++);  // print 11
		System.out.println();

		x = 10;
		// pre-decrement for decrement the value by 1 then assign
		System.out.println("pre-decrement of --");
		System.out.println("Initial Value: " + x);
		System.out.println("After pre-decrement: " + --x); // print 9
		System.out.println("After pre-decrement: " + --x); // print 8
		System.out.println();

		x = 10;
		//post-decrement will assign the value then decrement by 1
		System.out.println("post-decrement of --");
		System.out.println("Initial Value: " + x);
		System.out.println("After post-decrement: " + x--);  // print 10
		System.out.println("After post-decrement: " + x--);  // print 9
		System.out.println();

		// logical compliment operator
		System.out.println("logical compliment operator");
		boolean isGreaterThan12 = x > 12;
		System.out.println(!isGreaterThan12);
	}

}
