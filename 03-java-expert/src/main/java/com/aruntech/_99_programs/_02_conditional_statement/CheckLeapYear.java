package com.aruntech._99_programs._02_conditional_statement;

import java.util.Scanner;

/**
 * program to find the leap year.
 * year should be divisible by 4 then divisible by 400 - leap year
 * year should be divisible by 4 then not divisible by 100 - leap year
 * other cases the year is not leap year
 * e.g: 2000, 2024, 2028, 2032 are leap year
 *      2001, 2021 are not leap year
 */
public class CheckLeapYear {
    public static void main(String[] args) {
        System.out.println("Check Leap Year");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if(year%4 == 0) {
            if(year%400 == 0) {
                System.out.printf("%d is a Leap year", year);
            }
            else if(year%100 != 0) {
                System.out.printf("%d is a Leap year", year);
            } else {
                System.out.printf("%d is not a Leap year", year);
            }
        } else {
            System.out.printf("%d is not Leap year", year);
        }
    }
}
