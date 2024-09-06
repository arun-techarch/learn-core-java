package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Divide a number and find quotient and remainder
 * E.g: dividend=21, divisor=5 output is quotient=4, remainder=1
 */
public class FindDivideValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend:");
        int dividend = sc.nextInt();
        System.out.print("Enter the divisor:");
        int divisor = sc.nextInt();
        sc.close();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.print("Quotient: "+quotient+" Remainder: "+remainder);
    }
}
