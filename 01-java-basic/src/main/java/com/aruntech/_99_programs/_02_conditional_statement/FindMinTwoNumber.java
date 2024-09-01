package com.aruntech._99_programs._02_conditional_statement;

import java.util.Scanner;

/**
 * find minimum of two numbers
 * use Math or if else
 * a < b means a has minimum else b has minimum value
 * e.g: a=10, b=20 then min=10
 */
public class FindMinTwoNumber {
    public static void main(String[] args) {
        System.out.println("Find Min of Two Number:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a = sc.nextInt();
        System.out.print("Enter value b: ");
        int b = sc.nextInt();

        // using Math class
        System.out.println("Using Math: Min: " + Math.min(a, b));

        if(a < b) {
            System.out.println("Min: " + a);
        } else {
            System.out.println("Min: " + b);
        }
    }
}
