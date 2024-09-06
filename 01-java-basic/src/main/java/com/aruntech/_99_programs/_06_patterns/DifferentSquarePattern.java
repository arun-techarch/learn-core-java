package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print different square pattern like below
 * ****   1111    1234   4321    4444
 * ****   2222    1234   4321    4444
 * ****   3333    1234   4321    4444
 * ****   4444    1234   4321    4444
 */
public class DifferentSquarePattern {
    public static void printPattern1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printPattern4(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }

    public static void printPattern5(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Different Square Pattern");
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
    }
}
