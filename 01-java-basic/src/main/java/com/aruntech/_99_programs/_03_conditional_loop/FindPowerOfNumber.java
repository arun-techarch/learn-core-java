package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find the power of two numbers
 * e.g: m=2, n=3 then (m ^ n) = m * n times
 *     (2 ^ 3) = 2 * 2 * 2 = 8
 */
public class FindPowerOfNumber {
    public static int power(int m, int n) {
        int result = 1;
        for(int i =0; i<n; i++) {
            result *= m;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int m = sc.nextInt();
        System.out.print("Enter the power: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(m+"^"+n+" = " + power(m, n));
    }
}
