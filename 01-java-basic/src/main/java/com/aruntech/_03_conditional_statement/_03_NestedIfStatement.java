package com.aruntech._03_conditional_statement;

import java.util.Scanner;

/**
 * if else if else syntax
 * if (condition1) {
 *     // Code to be executed if condition1 is true
 * } else if (condition2) {
 *     // Code to be executed if condition2 is true
 * } else {
 *     // Code to be executed if none of the conditions are true
 * }
 */
public class _03_NestedIfStatement {
    public static void main(String[] args) {
        System.out.println("Nested If Statement:");
        Scanner sc = new Scanner(System.in);

        // if else if else statement
        System.out.println("Find the Grade:");
        System.out.print("Enter your score: ");
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // nested if statement
        System.out.println("Find the maximum of three numbers:");
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        if(a > b) {
            if(a > c) {
                System.out.printf("Max: %d", a);
            } else {
                System.out.printf("Max: %d", c);
            }
        } else {
            if(b > c) {
                System.out.printf("Max: %d", b);
            } else {
                System.out.printf("Max: %d", c);
            }
        }
    }
}
