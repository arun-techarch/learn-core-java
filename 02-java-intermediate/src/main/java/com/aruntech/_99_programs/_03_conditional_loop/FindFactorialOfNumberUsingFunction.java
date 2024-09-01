package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find factorial of a number
 * e.g: 4! = 4 * 3 * 2 * 1 = 24
 */
public class FindFactorialOfNumberUsingFunction {

    public static int findFactorial(int num) {
        if(num < 0) {
           return -1;
        } else {
            int factorial = 1;
            for(int i=1; i<=num; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        System.out.println("Find Factorial of Number");
        Scanner sc = new Scanner(System.in);

        int count = 3;
        while(count > 0) {
            System.out.print("Enter number to find factorial: ");
            int num = sc.nextInt();
            // reuse the function with different value
            System.out.printf("Factorial of (%d): %d\n", num, findFactorial(num));
            count--;
        }
    }
}
