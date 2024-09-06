package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print the floyd triangle
 * e.g: size=3 then 1
 *                  2 3
 *                  4 5 6
 */
public class PrintFloydTrianglePattern {
    public static void printFloydTriangle(int size) {
        int i,j, k=1;
        for(i=0; i<size; i++){
            for(j=0; j<=i; j++, k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Floyd Triangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int size = sc.nextInt();
        sc.close();

        if(size <= 0) {
            System.out.println("invalid input!!");
        } else {
            printFloydTriangle(size);
        }
    }
}
