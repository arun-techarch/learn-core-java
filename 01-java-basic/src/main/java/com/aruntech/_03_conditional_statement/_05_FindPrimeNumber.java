package com.aruntech._03_conditional_statement;

import java.util.Scanner;

/**
 * program to find the number is prime
 * e.g: 7 is prime and 12 is not prime
 * prime means divisible by 1 and by itself
 */
public class _05_FindPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Find Prime Number:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find prime: ");
        int num = sc.nextInt();

        // check number is greater than 1 and not divisible by 2 or 3.
        if(num > 1 && (num % 2) != 0 && (num % 3) != 0) {
            System.out.printf("%d is prime number", num);
        } else {
            System.out.printf("%d is not prime number", num);
        }
    }
}
