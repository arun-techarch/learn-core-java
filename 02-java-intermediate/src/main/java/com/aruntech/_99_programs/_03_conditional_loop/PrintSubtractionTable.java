package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Print subtraction table from 1 ... 10
 * E.g: 4, and the output is
 * 1 - 4 = -3
 * 2 - 4 = -2
 * 3 - 4 = -1
 * 4 - 4 = 0
 * 5 - 4 = 1
 * 6 - 4 = 2
 * 7 - 4 = 3
 * 8 - 4 = 4
 * 9 - 4 = 5
 * 10 - 4 = 6
 */
public class PrintSubtractionTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subtraction table to print:");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(i + " - " + n + " = " +(i-n));
        }
        sc.close();
    }
}
