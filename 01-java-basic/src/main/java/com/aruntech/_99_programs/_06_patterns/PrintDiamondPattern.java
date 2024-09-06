package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print below diamond pattern
 * e.g: size=3 then    *
 *                    ***
 *                   *****
 *                    ***
 *                     *
 */

public class PrintDiamondPattern {
    public static void printDiamond(int size) {
        int space, i, j;
        space = size-1;

        // print first half
        for(i=1; i<=size;i++){
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            space--;
            for(j=0; j<(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // print the second half
        space = 1;
        for(i=1;i<=(size-1);i++){
            for(j=1; j<=space; j++){
                System.out.print(" ");
            }
            space++;
            for(j=0;j<(2*(size-i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Diamond Pattern");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        if(size <= 0) {
            System.out.println("invalid input!!");
        } else {
            printDiamond(size);
        }
    }
}
