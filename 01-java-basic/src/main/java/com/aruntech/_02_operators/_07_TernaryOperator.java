package com.aruntech._02_operators;

/**
 * ternary or conditional operator is shorthand operator of if and else condition
 * syntax:
 *   (exp) ? (true_exp) : (false_exp)
 *   (exp) ? (true_exp) : (exp) ? (true_exp) : (false_exp)
 */
public class _07_TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Ternary Operator:");
        boolean isUserExists = true;
        String log = isUserExists ? "User exist on the database" : "User not exist on the database";
        System.out.println(log);

        int a = 20;
        int b = 10;
        int c = 30;

        // find max of a, b
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);

        // find the number range between a, b, c
        String message = (a < b) ?  "%d is lesser than %d\n"
                : (a > c) ? "%d is greater than %d and %d\n"
                : "%d is greater than %d but less than %d\n";
        System.out.printf(message, a, b, c);
    }
}
