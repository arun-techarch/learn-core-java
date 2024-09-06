package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print numbers in matrix format
 * e.g: size=3 then 1 2 3
 *                  4 5 6
 *                  7 8 9
 */
public class PrintNumbersInRowAndColumn {

    public static void printNumberMatrix(int size) {
        int n = 1, i, j;
        for(i=0; i<size; i++) {
            for(j=0; j<size; j++) {
                System.out.print(n+ " ");
                n++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print numbers in rows and columns");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size = sc.nextInt();
        sc.close();

        if(size <= 0) {
            System.out.println("invalid input!!");
        } else {
            printNumberMatrix(size);
        }
    }
}
