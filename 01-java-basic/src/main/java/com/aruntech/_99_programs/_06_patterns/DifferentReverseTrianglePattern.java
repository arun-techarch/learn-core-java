package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print different reverse triangle pattern like below
 *   * * * *    4 4 4 4     1 2 3 4        *         1        1
 *   * * *      3 3 3       1 2 3         **        12       22
 *   * *        2 2         1 2          ***       123      333
 *   *          1           1           ****      1234     4444
 */
public class DifferentReverseTrianglePattern {
    public static void printPattern1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(n-i+1+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern4(int n) {
        for(int i=1; i<=n; i++) {
            int space = 1;
            while(space <= n-i) {
                System.out.print(" ");
                space++;
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern5(int n) {
        for(int i=1; i<=n; i++) {
            int space = 1;
            while(space <= n-i) {
                System.out.print(" ");
                space++;
            }
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printPattern6(int n) {
        for(int i=1; i<=n; i++) {
            int space = 1;
            while(space <= n-i) {
                System.out.print(" ");
                space++;
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Different Reverse Triangle Pattern");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        sc.close();

        printPattern1(n);
        System.out.println();
        printPattern2(n);
        System.out.println();
        printPattern3(n);
        System.out.println();
        printPattern4(n);
        System.out.println();
        printPattern5(n);
        System.out.println();
        printPattern6(n);
    }
}
