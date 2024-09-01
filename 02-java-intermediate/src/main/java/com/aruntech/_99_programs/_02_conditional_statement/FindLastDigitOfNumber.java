package com.aruntech._99_programs._02_conditional_statement;

import java.util.Scanner;

/**
 * program to find lst digit of a number
 * num < 10 means only one digit so print num
 * num > 10 then modulus by 10 will get the reminder
 */
public class FindLastDigitOfNumber {
    public static void main(String[] args) {
        System.out.println("Find Last Digit of a Number:");
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter number to find last digit: ");
        int num = sc.nextInt();

        if(num <= 0) {
            System.out.println("Invalid number!");
        } else {
            if(num < 10) {
                System.out.printf("Last digit of (%d) is : %d", num, num);
            } else {
                System.out.printf("Last digit of (%d) is : %d", num, num%10);
            }
        }
    }
}
