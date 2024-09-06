package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to print sum of square of n numbers
 * square of a = a*a
 * e.g: range=4 means (1*1)+(2*2)+(3*3)+(4*4) = 1+4+9+16 = 30
 */
public class CalculateSumOfSquareOfNNumbers {
    public static void main(String[] args) {
        System.out.println("Sum of Square of N-Numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of print square numbers: ");
        int range = sc.nextInt();
        sc.close();

        if(range <= 0) {
            System.out.println("Invalid input!");
        } else {
            int sum = 0;
            for(int i=1; i<=range; i++) {
                sum += (i*i);
            }
            System.out.print("Sum of square value: " + sum);
        }
    }
}
