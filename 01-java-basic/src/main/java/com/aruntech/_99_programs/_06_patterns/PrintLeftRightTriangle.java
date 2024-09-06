package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print left and right triangle like below
 * e.g: n=5 then  *                    *
 *                * *                * *
 *                * * *            * * *
 *                * * * *        * * * *
 *                * * * * *    * * * * *
 */
public class PrintLeftRightTriangle {

    public static void printLeftTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printRightTriangle(int n) {
        int k = 2 * (n-1);

        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                System.out.print(" ");
            }
            k = k-2;
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Left and Right Triangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n = sc.nextInt();
        sc.close();

        if(n <= 0) {
            System.out.println("Invalid input!!");
        } else {
            printLeftTriangle(n);
            System.out.println();
            printRightTriangle(n);
        }
    }
}
