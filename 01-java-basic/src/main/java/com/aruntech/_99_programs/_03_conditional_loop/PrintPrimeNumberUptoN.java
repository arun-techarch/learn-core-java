package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find all prime numbers within a range (2 to n)
 * prime number means it's divisible by 1 and by itself
 * if the number also divisible by any other number then it's not prime number
 * e.g: n=10 then 2 3 5 7
 */
public class PrintPrimeNumberUptoN {
    public static void printAllPrime(int n) {
        boolean isPrime = true;
        for(int i=2; i<n; i++) {
            isPrime = true;
            for(int j=2; j<i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Find All Prime Numbers Within Range");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int num = sc.nextInt();
        sc.close();

        printAllPrime(num);
    }
}
