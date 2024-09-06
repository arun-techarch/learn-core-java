package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * program to find square of a number
 * square = num * num
 * e.g: num = 3, square = 3 * 3 = 9
 *
 */
public class FindSquareOfNumber {
    public static void main(String[] args) {
        System.out.println("Find Square of Number:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find square value: ");
        int num = sc.nextInt();
        sc.close();

        int square = num * num;
        System.out.printf("Square(%d * %d): %d", num, num, square);
    }
}
