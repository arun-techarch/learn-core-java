package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find factorial of a number using recursion
 * recursion means function calling by itself
 * it will store the value in same function reference
 * e.g: 4! = 4 * 3 * 2 * 1 = 24
 */
public class FindFactorialOfNumberUsingRecursion {

    public static int fact(int num) {
        if(num==1)
            return 1;
        else
            return num * fact(num-1);
    }

    public static void main(String[] args) {
        System.out.println("Find Factorial of Number");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find factorial: ");
        int num = sc.nextInt();
        sc.close();

        System.out.printf("Factorial of (%d): %d\n", num, fact(num));
    }
}
