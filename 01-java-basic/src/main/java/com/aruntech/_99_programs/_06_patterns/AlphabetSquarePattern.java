package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print below alphabets square pattern
 * A A A A    A B C D    A B C D
 * B B B B    A B C D    B C D E
 * C C C C    A B C D    C D E F
 * D D D D    A B C D    D E F G
 */
public class AlphabetSquarePattern {
    public static void printPattern1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                char ch = (char) ('A'+i-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                char ch = (char) ('A'+j-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n) {
        int p;
        for(int i=1; i<=n; i++) {
            p = i;
            for(int j=1; j<=n; j++) {
                char ch = (char) ('A'+p-1);
                p++;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Alphabets Square Pattern");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        sc.close();

        printPattern1(n);
        System.out.println();
        printPattern2(n);
        System.out.println();
        printPattern3(n);
    }
}
