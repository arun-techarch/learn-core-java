package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Sum of square of even numbers from 1 ... n
 * E.g: n=6 then output is (2*2)+(4*4)+(6*6)
 * 4+16+36 = 56
 */
public class CalculateSquareOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                sum += (i * i);
            }
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
