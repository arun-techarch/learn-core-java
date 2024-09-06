package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print pascal triangle like below
 * e.g: n=5 then  1
 *               1 1
 *              1 2 1
 *             1 3 3 1
 *            1 4 6 4 1
 */
public class PrintPascalTriangle {
    public static void printPascal(int row) {
        int num, i, j;
        for(i=0; i<row; i++){
            for(j=row; j>i;j--){
                System.out.print(" ");
            }

            num = 1;
            for(j=0; j<=i;j++){
                System.out.print(num + " ");
                num = num * (i-j) / (j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Pascal Triangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int row = sc.nextInt();
        sc.close();

        if(row <= 0) {
            System.out.println("Invalid input!!");
        } else {
            printPascal(row);
        }
    }
}
