package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Print multiplication table from 1 ... 10
 * E.g: 3, and the output is
 * 1 * 3 = 3
 * 2 * 3 = 6
 * 3 * 3 = 9
 * 4 * 3 = 12
 * 5 * 3 = 15
 * 6 * 3 = 18
 * 7 * 3 = 21
 * 8 * 3 = 24
 * 9 * 3 = 27
 * 10 * 3 = 30
 */
public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter multiplication table to print:");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=10; i++) {
            System.out.println(i + " * " + n + " = " +(i*n));
        }
    }
}
