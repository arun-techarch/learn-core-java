package com.aruntech._03_conditional_statement;

import java.util.Scanner;

/**
 * If syntax:
 * if (condition) {
 *     // code to be executed if the condition is true
 * } else {
 *     // code to be executed if the condition is false
 * }
 *
 * conditions in Java are typically evaluated to boolean values (true or false)
 * boolean expressions are using comparison operators (==, !=, <, >, <=, >=) and
 * logical operators (&&, ||, !)
 */
public class _02_IfStatement {
    public static void main(String[] args) {
        System.out.println("If Statement:");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18 && age <= 40) {
            System.out.println("You are eligible for college");
        } else {
            System.out.println("You are not eligible for college");
        }
        System.out.println();

        System.out.print("Enter number to check odd or even: ");
        int num = sc.nextInt();
        if(num %2 == 0) {
            //true statement
            System.out.printf("%d is even number", num);
        } else {
            //false statement
            System.out.printf("%d is odd number", num);
        }

    }
}
