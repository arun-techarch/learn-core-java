package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * program to find cube of a number
 * cube = num * num * num
 * e.g: num = 3, cube = 3 * 3 * 3 = 27
 *
 */
public class FindCubeOfNumber {
    public static void main(String[] args) {
        System.out.println("Find Cube of Number:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find cube value: ");
        int num = sc.nextInt();
        int cube = num * num * num;
        System.out.printf("Cube(%d * %d * %d): %d", num, num, num, cube);
    }
}
