package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print parallelogram pattern like below
 * e.g: n=3 then  ***     n=5 then  *****
 *                 ***               *****
 *                  ***               *****
 *                                     *****
 *                                      *****
 */
public class PrintParallelogramPattern {
    public static void printPattern(int n) {
        int i = 1;
        while(i <= n) {
            int spacer = 0;
            while(spacer < i-1) {
                System.out.print(" ");
                spacer += 1;
            }
            int j = 1;
            while(j <= n) {
                System.out.print("*");
                j = j+1;
            }

            System.out.println();
            i = i+1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Parallelogram Pattern");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        sc.close();

        if(n <= 0) {
            System.out.println("Invalid input!!");
        } else {
            printPattern(n);
        }
    }
}
