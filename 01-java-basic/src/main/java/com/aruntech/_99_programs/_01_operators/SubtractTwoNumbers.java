package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Subtract two numbers a, b
 * E.g: a=10, b=5 output is 10-5 = 5
 */
public class SubtractTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Subtraction of two numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a:");
        int a = sc.nextInt();
        System.out.print("Enter number b:");
        int b = sc.nextInt();
        sc.close();

        System.out.println(a+" - "+b+" = "+(a-b));
    }
}
