package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Sum of n numbers from 1 ... n
 * E.g: n=7 then output is 1+2+3+4+5+6+7 = 28
 */
public class CalculateSumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number:");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println("Sum = "+sum);
    }
}
