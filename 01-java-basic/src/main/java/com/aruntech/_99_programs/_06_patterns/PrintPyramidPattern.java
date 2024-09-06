package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print pyramid pattern like below
 * e.g: n=5 then        *
 *                    * * *
 *                  * * * * *
 *                 * * * * * * *
 *               * * * * * * * * *
 */
public class PrintPyramidPattern {
    public static void printPyramid(int size) {
        int i, sp, k=0;

        for(i=1;i<=size;i++){
            for(sp=1; sp <= (size-i); sp++){
                System.out.print("  ");
            }

            while(k != (2*i-1)){
                System.out.print("* ");
                k++;
            }
            k=0;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Pyramid Pattern");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int size = sc.nextInt();
        sc.close();

        if(size <= 0) {
            System.out.println("invalid input!!");
        } else {
            printPyramid(size);
        }
    }
}
