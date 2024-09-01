package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find factorial of a number
 * e.g: 4! = 4 * 3 * 2 * 1 = 24
 */
public class FindFactorialOfNumber {
    public static void main(String[] args) {
        System.out.println("Find Factorial of Number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial: ");
        int num = sc.nextInt();

        // this code is used only once so, better we can move this code
        // into a function and reuse the same in multiple places.
        if(num < 0) {
            System.out.println("Invalid number!");
        } else {
            int factorial = 1;
            for(int i=1; i<=num; i++) {
                factorial *= i;
            }
            System.out.printf("Factorial of (%d): %d", num, factorial);
        }
    }
}
