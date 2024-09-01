package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Print addition table from 1 ... 10
 * E.g: 3, and the output is
 * 1 + 3 = 4
 * 2 + 3 = 5
 * 3 + 3 = 6
 * 4 + 3 = 7
 * 5 + 3 = 8
 * 6 + 3 = 9
 * 7 + 3 = 10
 * 8 + 3 = 11
 * 9 + 3 = 12
 * 10 + 3 = 13
 */
public class PrintAdditionTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter addition table to print:");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(i + " + " + n + " = " +(i+n));
        }
        sc.close();
    }
}
