package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to print the fahrenheit table with incremental steps
 * f = ((celsius × 9)/5) + 32
 */
public class PrintFahrenheitTable {
    public static void printFahrenheit(int start, int end, int step) {
        for(int i=start; i<=end; i+=step) {
            int fahrenheit = ((i * 9)/5)+32;
            System.out.printf("%d %d%n", i, fahrenheit);
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Fahrenheit Table");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start: ");
        int start = sc.nextInt();
        System.out.print("Enter the end: ");
        int end = sc.nextInt();
        System.out.print("Enter the step: ");
        int step = sc.nextInt();
        sc.close();

        printFahrenheit(start, end, step);
    }
}
