package com.aruntech._02_operators;

/**
 * bitwise operator will perform operation on two operands or some cases
 * it will perform on only one operand.
 *   - bitwise AND (&)
 *   - bitwise OR (|)
 *   - bitwise XOR (^)
 *   - bitwise NOT (~)
 *   - left-shift (<<)
 *   - right-shift (>>)
 *   - unsigned right shift (>>>)
 */
public class _06_BitwiseOperator {

	public static void main(String[] args) {
		System.out.println("Bitwise Operator");

		// it will perform bitwise operation
		int x = 10; // 00001010
		int y = 12; // 00001100

		/*
		& is bitwise AND operation perform on every bit
		i.e. both 1 means 1 and otherwise 1
		   00001010 (10)
		   00001100 (12)
		  ----------
		   00001000
		   = 0*(2^7) + 0*(2^6) + 0*(2^5) + 0*(2^4) + 1*(2^3) + 0*(2^2) + 0*(2^1) + 0*(2^0)
		   = 1*(2*2*2)  (other values are 0)
		   = 1 * 8 = 8
		 */
		System.out.println("Bitwise AND: " + (x & y));

		/*
		| is bitwise OR operation perform on every bit
		i.e. both 0 means 0 and otherwise 1
		   00001010  (10)
		   00001100  (12)
		  ----------
		   00001110
		   = 0*(2^7) + 0*(2^6) + 0*(2^5) + 0*(2^4) + 1*(2^3) + 1*(2^2) + 1*(2^1) + 0*(2^0)
		   = 1*(2*2*2) + 1*(2*2) + 1*(2)  (other values are 0)
		   = 8 + 4 + 2 = 14
		 */
		System.out.println("Bitwise OR: " + (x | y));

		/*
		^ is bitwise XOR operation perform on every bit
		i.e. the bits are different, the resulting bit is 1. Otherwise, it's 0
		   00001010  (10)
		   00001100  (12)
		  ----------
		   00000110
		   = 0*(2^7) + 0*(2^6) + 0*(2^5) + 0*(2^4) + 0*(2^3) + 1*(2^2) + 1*(2^1) + 0*(2^0)
		   = 1*(2*2) + 1*(2)  (other values are 0)
		   = 4 + 2 = 6
		 */
		System.out.println("Bitwise XOR: " + (x ^ y));

		/*
		~ is bitwise NOT operation perform on every bit
		i.e. 1 becomes 0, and 0 becomes 1
		   00001010  (10)
		   11110101 2's complement is 00001010
		   Add 1 to the inverted value = 00001010 + 1 = 00001011
		   00001011 = 0*(2^7) + 0*(2^6) + 0*(2^5) + 0*(2^4) + 1*(2^3) + 0*(2^2) + 1*(2^1) + 1*(2^0)
		   = 1 * 8 + 1 * 2 + 1 * 1
		   = 8 + 2 + 1 = 11 and negate this value means -11
		 */
		System.out.println("Bitwise NOT: " + (~x));

		/*
		<< is left shift operator perform shifts bits to the left by a specified positions.
		zeroes are filled in from the right.
		   00001010  (10)
		   10 << 2 00101000
		   00101000 = 0*(2^7) + 0*(2^6) + 1*(2^5) + 0*(2^4) + 1*(2^3) + 0*(2^2) + 0*(2^1) + 0*(2^0)
		   = 32 + 8 = 40
		 */
		System.out.println("Left Shift << 2: " + (x << 2));

		/*
		>> is right shift operator perform shifts bits to the right by a specified positions.
		sign bit (most significant bit) is preserved in arithmetic right shifts.
		   11110110  (-10)
		   -10 >> 2 11111101 2'c compliment 00000010 + 1 = 00000011
		   00000011 = 0*(2^7) + 0*(2^6) + 0*(2^5) + 0*(2^4) + 0*(2^3) + 0*(2^2) + 1*(2^1) + 1*(2^0)
		   = 2 + 1 = -3
		 */
		x = -10;
		System.out.println("Right Shift >> 2: " + (x >> 2));
	}

}
