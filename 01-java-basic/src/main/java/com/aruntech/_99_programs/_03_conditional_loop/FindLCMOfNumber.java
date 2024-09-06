package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * find the least common multiple (LCM) of a number
 * we have to divide both num1 and num2 with the least divisor and continue till 1, 1
 * e.g: 6, 8
 *      2 | 6, 8
 *      2 | 3, 4
 *      3 | 3, 2
 *      2 | 1, 2
 *      1 | 1, 1
 *
 * multiply the divisor = 2*2*3*2*1 = 24
 * LCM: 24
 */
public class FindLCMOfNumber {
    public static int findLCM(int num1, int num2) {
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        int lcm = max;

        while (true) {
            if(lcm % min == 0) {
                return lcm;
            }
            lcm += max;
        }
    }

    public static void main(String[] args) {
        System.out.println("Find LCM of a Number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        sc.close();

        if(num1 <= 0 || num2 <= 0) {
            System.out.println("Enter value greater than equal to 0");
        } else {
            System.out.printf("LCM(%d, %d): %d", num1, num2, findLCM(num1, num2));
        }
    }
}
