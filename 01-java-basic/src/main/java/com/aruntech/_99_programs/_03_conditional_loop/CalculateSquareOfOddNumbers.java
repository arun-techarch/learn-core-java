package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Sum of square of odd numbers from 1 ... n
 * E.g: n=5 then output is (1*1)+(3*3)+(5*5)
 * 1+9+25 = 35
 */
public class CalculateSquareOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number:");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i%2 == 1) {
                sum += (i * i);
            }
        }
        System.out.println("Sum = "+sum);
    }
}
