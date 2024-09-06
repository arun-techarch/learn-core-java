package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to sum or product the numbers based on choice
 * If choice is 1 means sum and 2 means product
 * e.g: n=10, choice=1 then 55 (1+2+....+10)
 *      n=5, choice=2 then 120 (1*2*...*5)
 */
public class PrintSumOrProductOfNumbers {
    private static int sumNums(int n) {
        int sum = 0;
        for(int i=1; i<=n;i++) {
            sum += i;
        }
        return sum;
    }

    private static int productNum(int n) {
        int sum = 1;
        for(int i=1; i<=n;i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Print Sum or Product of Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the choice(1 or 2): ");
        int choice = Integer.parseInt(sc.nextLine());
        sc.close();

        switch (choice) {
            case 1:
                System.out.printf("Sum of %d numbers: %d", num, sumNums(num));
                break;
            case 2:
                System.out.printf("Product of %d numbers: %d", num, productNum(num));
                break;
            default:
                System.out.println("Invalid choice!!");
        }
    }
}
