package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Multiply two numbers a, b
 * E.g: a=10, b=3 output is 10*3 = 30
 */
public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Multiply two numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a:");
        int a = sc.nextInt();
        System.out.print("Enter number b:");
        int b = sc.nextInt();
        System.out.println(a+" * "+b+" = "+(a*b));
        sc.close();
    }
}
