package com.aruntech._99_programs._06_patterns;

import java.util.Scanner;

/**
 * program to print different isosceles pattern like below
 * from the below pattern space(n-i) and towards increment then decrement the value.
 *      *          1            1
 *     ***        121          232
 *    *****      12321        34543
 *   *******    1234321      4567654
 */
public class DifferentIsoscelesPattern {
    public static void printPattern1(int n) {
        for(int i=1; i<=n; i++) {
            int space = 1;
            while(space <= n-i) {
                System.out.print(" ");
                space++;
            }
            for(int j=1; j<=(i+i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n) {
        for(int i=1; i<=n; i++) {
            int space = 1;
            while(space <= n-i) {
                System.out.print(" ");
                space++;
            }

            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            int decr = i-1;
            while(decr >= 1) {
                System.out.print(decr);
                decr -= 1;
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n) {
        for(int i=1; i<=n; i++) {
            int space = 1;
            while(space <= n-i) {
                System.out.print(" ");
                space++;
            }
            int j = 1;
            int p = i;
            boolean decr = false;
            while(j<= (i+i-1)) {
                System.out.print(p);
                j = j+1;

                if(j > i) {
                    decr = true;
                }
                if(decr){
                    p = p - 1;
                }else{
                    p = p+1;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Different Isosceles Pattern");
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
