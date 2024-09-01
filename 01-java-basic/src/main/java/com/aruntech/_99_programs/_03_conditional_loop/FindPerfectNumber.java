package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program for find perfect number
 * perfect number is sum of all divisor is equal to given number
 * e.g: num=6 which is divisible by 1, 2, 3
 *      so, sum of divisor is 1+2+3 = 6
 */
public class FindPerfectNumber {
    public static void main(String[] args) {
        System.out.println("Find Perfect Number:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check perfect number: ");
        int num = sc.nextInt();

        if(num <= 0) {
            System.out.printf("%d is not a perfect number", num);
        } else {
            // all number divisible by 1
            int sumOfDivisor = 1;
            for(int i=2; i<=num/2; i++) {
                if(num%i == 0) {
                    sumOfDivisor += i;
                }
            }

            if(num == sumOfDivisor) {
                System.out.printf("%d is a perfect number", num);
            } else {
                System.out.printf("%d is not a perfect number", num);
            }
        }
    }
}
