package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to print the celsius table with incremental steps
 * c = (fahrenheit - 32) * 5/9
 */
public class PrintCelsiusTable {
    public static void printCelsius(int start, int end, int step) {
        for(int i=start; i<=end; i+=step) {
            int celsius = (i-32) * 5/9;
            System.out.printf("%d %d%n", i, celsius);
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Celsius Table");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start: ");
        int start = sc.nextInt();
        System.out.print("Enter the end: ");
        int end = sc.nextInt();
        System.out.print("Enter the step: ");
        int step = sc.nextInt();
        sc.close();

        printCelsius(start, end, step);
    }
}
