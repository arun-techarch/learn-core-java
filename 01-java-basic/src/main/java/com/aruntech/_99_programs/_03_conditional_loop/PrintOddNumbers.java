package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Print Odd numbers from 1 ... n
 * E.g: n=10 then output is 1,3,5,7,9
 */
public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number:");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            if(i%2 == 1) {
                System.out.println(i);
            }
        }
    }
}
