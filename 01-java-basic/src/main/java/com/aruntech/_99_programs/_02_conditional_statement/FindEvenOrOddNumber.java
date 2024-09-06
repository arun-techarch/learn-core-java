package com.aruntech._99_programs._02_conditional_statement;

import java.util.Scanner;

/**
 * program for given number is odd or even
 * e.g: num=21 then odd number
 * num=20 then even number
 */
public class FindEvenOrOddNumber {
    public static void main(String[] args) {
        System.out.println("Find Even or Odd Number:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find even or odd: ");
        int num = sc.nextInt();
        sc.close();

        // using if condition
        // checking the number is divisible by 2 and reminder is 0
        // then even number else odd number
        if(num > 0 && num %2 == 0) {
            System.out.printf("Using If: %d is even number", num);
        } else {
            System.out.printf("Using If: %d is odd number", num);
        }
        System.out.println();

        // using bitwise operator
        if((num & 2) == 0) {
            System.out.printf("Using Bitwise AND: %d is even number", num);
        } else {
            System.out.printf("Using Bitwise AND: %d is odd number", num);
        }
    }
}
