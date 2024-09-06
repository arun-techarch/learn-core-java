package com.aruntech._99_programs._02_conditional_statement;

import java.util.Scanner;

/**
 * program to perform arithmetic operation on two operands
 */
public class ArithmeticOperation {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operations:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second num: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator(+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        sc.close();

        switch (op) {
            case '+':
                System.out.printf("%d %s %d = %d", num1, op, num2, (num1 + num2));
                break;
            case '-':
                System.out.printf("%d %s %d = %d", num1, op, num2, (num1 - num2));
                break;
            case '*':
                System.out.printf("%d %s %d = %d", num1, op, num2, (num1 * num2));
                break;
            case '/':
                if(num2 == 0) {
                    System.out.println("It shouldn't divided by zero");
                } else {
                    System.out.printf("%d %s %d = %d", num1, op, num2, (num1 / num2));
                }
                break;
            case '%':
                System.out.printf("%d %s %d = %d", num1, op, num2, (num1 % num2));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
