package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Divison two numbers a, b
 * E.g: a=10, b=2 output is 10/2 = 5
 * a=5, b=0 output Cannot divide the number by zero
 */
public class DivisonTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Division of two numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a:");
        int a = sc.nextInt();
        System.out.print("Enter number b:");
        int b = sc.nextInt();
        sc.close();

        if(b == 0) {
            System.out.println("Cannot divide the number by zero");
        } else {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
}
