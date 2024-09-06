package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find nCr value
 * nCr = n!/r!(n-r)!
 * e.g: 5C3 = 5!/3!(5-3)! = 10
 */
public class FindNcrValue {
    public static int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        System.out.print("Enter the r value: ");
        int r = sc.nextInt();
        sc.close();

        int nCr = factorial(n)/(factorial(r) * factorial(n-r));
        System.out.println(n+"C"+r+" = "+nCr);
    }
}
