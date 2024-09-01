package com.aruntech._99_programs._02_conditional_statement;

import java.util.Scanner;

/**
 * find maximum of two numbers
 * use Math or if else
 * a > b means a has maximum else b has maximum value
 * e.g: a=10, b=20 then max=20
 */
public class FindMaxTwoNumber {
    public static void main(String[] args) {
        System.out.println("Find Max of Two Number:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a = sc.nextInt();
        System.out.print("Enter value b: ");
        int b = sc.nextInt();

        // using Math class
        System.out.println("Using Math: Max: " + Math.max(a, b));

        if(a > b) {
            System.out.println("Max: " + a);
        } else {
            System.out.println("Max: " + b);
        }
    }
}
