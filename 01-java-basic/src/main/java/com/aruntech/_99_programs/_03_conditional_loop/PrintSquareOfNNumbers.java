package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to print square of n numbers
 * square of a = a*a
 * e.g: range=5 then print 1 4 9 16 25
 */
public class PrintSquareOfNNumbers {
    public static void main(String[] args) {
        System.out.println("Square of N-Numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of print square numbers: ");
        int range = sc.nextInt();
        sc.close();

        if(range <= 0) {
            System.out.println("Invalid input!");
        } else {
            for(int i=1; i<=range; i++) {
                System.out.print((i*i) +" ");
            }
        }
    }
}
