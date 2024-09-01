package com.aruntech._99_programs._01_operators;

/**
 * program for interchange the value of two variable
 * without using the third variable
 *
 * Bitwise XOR operator will help to implement this logic
 */
public class InterchangeValue {
    public static void main(String[] args) {
        System.out.println("Interchange the values:");
        // initialize the value
        int a = 20;
        int b = 10;
        System.out.println("Initial value(a, b): " + a + ", " + b);

        a ^= b; // combined value of a and b in a
        b ^= a; // replace a value on b
        a ^= b; // replace b value on a
        System.out.println("Final value(a, b): " + a + ", " + b);
    }
}
