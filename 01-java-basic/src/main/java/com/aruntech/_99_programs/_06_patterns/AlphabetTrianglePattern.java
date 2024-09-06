package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print below alphabets triangle pattern
 * A          A          D           D
 * B B        B C        C C         C D
 * C C C      C D E      B B B       B C D
 * D D D D    D E F G    A A A A     A B C D
 */
public class AlphabetTrianglePattern {
    public static void printPattern1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                char ch = (char) ('A'+i-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n) {
        int p;
        for(int i=1; i<=n; i++) {
            p = i;
            for(int j=1; j<=i; j++) {
                char ch = (char) ('A'+p-1);
                p++;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                char ch = (char) ('A'+n-i);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern4(int n) {
        char p;
        for(int i=1; i<=n; i++) {
            p = (char) ('A'+n-i);
            for(int j=1; j<=i; j++) {
                System.out.print(p+" ");
                p = (char) (p+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Alphabets Triangle Pattern");
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
    }
}
