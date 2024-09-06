package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print half diamond pattern like below
 * e.g: size=3 then   *
 *                    *1*
 *                    *121*
 *                    *12321*
 *                    *121*
 *                    *1*
 *                    *
 */
public class PrintHalfDiamondPattern {
    public static void printPattern(int n) {
        System.out.println("*");
        int i = 1;
        int p = 1;

        while(i <= n+(n-1)) {
            System.out.print("*");

            if(i > n) {
                p = p -1;
            }else {
                p = i;
            }

            int j = 1;
            while(j <= p) {
                System.out.print(j);
                j = j+1;
            }

            int desc = p-1;
            while(desc >= 1) {
                System.out.print(desc);
                desc -= 1;
            }
            System.out.print("*");
            i = i+1;
            System.out.println();
        }
        System.out.println("*");
    }

    public static void main(String[] args) {
        System.out.println("Print Half Diamond Pattern");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        if(size <= 0) {
            System.out.println("invalid input!!");
        } else {
            printPattern(size);
        }
    }
}
