package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find the digit count of a number
 * e.g: 4352 -> 4 or 90 -> 2
 */
public class FindNumberOfDigit {
    public static void main(String[] args) {
        System.out.println("Find Number Of Digits:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find digits: ");
        int num = sc.nextInt();

        if(num < 0) {
            System.out.println("Invalid number!!");
        } else {
            int digit = 1;
            while(num >= 10) {
                num /= 10;
                digit++;
            }
            System.out.printf("No of digits: %d", digit);
        }
    }
}
