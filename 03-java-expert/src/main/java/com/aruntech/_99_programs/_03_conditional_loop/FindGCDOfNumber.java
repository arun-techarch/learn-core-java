package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * find the greatest common divisor (GCD) of a number
 *
 * the divisors of 48 are: 1, 2, 3, 4, 6, 8, 12, 16, 24, 48.
 * the divisors of 18 are: 1, 2, 3, 6, 9, 18.
 * the common divisors are: 1, 2, 3, 6.
 * GCD: 6
 */
public class FindGCDOfNumber {

    public static int findGCD(int num1, int num2) {
        int min = Math.min(num1, num2);
        int gcd = 0;

        for(int i=min; i>0; i--) {
            if(num1%i == 0 && num2%i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println("Find GCD of a Number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();

        if(num1 <= 0 || num2 <= 0) {
            System.out.println("Enter value greater than equal to 0");
        } else {
            System.out.printf("GCD(%d, %d): %d", num1, num2, findGCD(num1, num2));
        }
    }
}
