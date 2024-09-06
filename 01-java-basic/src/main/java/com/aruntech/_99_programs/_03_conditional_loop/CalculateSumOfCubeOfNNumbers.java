package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to print sum of cube of n numbers
 * cube of a = a*a*a
 * e.g: range=4 means (1*1*1)+(2*2*2)+(3*3*3)+(4*4*4) = 1+8+27+64 = 100
 */
public class CalculateSumOfCubeOfNNumbers {
    public static void main(String[] args) {
        System.out.println("Sum of Cube of N-Numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of print cube numbers: ");
        int range = sc.nextInt();
        sc.close();

        if(range <= 0) {
            System.out.println("Invalid input!");
        } else {
            int sum = 0;
            for(int i=1; i<=range; i++) {
                sum += (i*i*i);
            }
            System.out.print("Sum of cube value: " + sum);
        }
    }
}
