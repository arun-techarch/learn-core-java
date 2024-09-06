package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print different triangle pattern like below
 *  *         1          1         1          1          1
 *  * *       1 2        2 2       2 1        2 3        2 3
 *  * * *     1 2 3      3 3 3     3 2 1      3 4 5      4 5 6
 *  * * * *   1 2 3 4    4 4 4 4   4 3 2 1    4 5 6 7    7 8 9 10
 */
public class DifferentTrianglePattern {
    public static void printPattern1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern4(int n) {
        int p;
        for(int i=1; i<=n; i++) {
            p = i;
            for(int j=1; j<=i; j++) {
                System.out.print(p+" ");
                p--;
            }
            System.out.println();
        }
    }

    public static void printPattern5(int n) {
        int p;
        for(int i=1; i<=n; i++) {
            p = i;
            for(int j=1; j<=i; j++) {
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }

    public static void printPattern6(int n) {
        int p=1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(p + " ");
                p++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Different Triangle Pattern");
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
