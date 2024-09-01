package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to sum of digit of a number
 * e.g: num=37421 then add all digit 3+7+4+2+1 and print 17
 */
public class FindSumOfDigit {
    public static void main(String[] args) {
        System.out.println("Find Sum of Digit");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find sum of digit: ");
        int num = sc.nextInt();

        if(num <= 0) {
            System.out.println("Sum of Digit: 0");
        } else {
            int sum = 0;
            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("Sum of Digit: " + sum);
        }
    }
}
