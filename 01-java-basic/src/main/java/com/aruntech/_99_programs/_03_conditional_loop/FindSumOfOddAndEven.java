package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to input an integer N and print the sum of all its even digits
 * and sum of all its odd digits separately.
 * e.g: the given integer is "13245",
 * even digits are 2 & 4 and odd digits are 1, 3 & 5.
 * sum of even = 2+4(6), sum of odd = 1+3+5(9)
 */
public class FindSumOfOddAndEven {
    public static void sumOfOddAndEvenDigits(int num) {
        int sumOfOdd = 0;
        int sumOfEven = 0;

        while(num > 0) {
            int rem = num % 10;
            if(rem%2 == 0) {
                sumOfEven += rem;
            } else {
                sumOfOdd += rem;
            }
            num = num/10;
        }
        System.out.println("Sum(even): " + sumOfEven);
        System.out.println("Sum(even): " + sumOfOdd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        if(num <= 0) {
            System.out.println("Invalid input");
        } else {
            sumOfOddAndEvenDigits(num);
        }
    }
}
