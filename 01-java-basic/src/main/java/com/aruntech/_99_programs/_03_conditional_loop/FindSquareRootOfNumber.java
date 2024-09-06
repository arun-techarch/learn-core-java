package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find the square root of a number
 * e.g: square root means it's square root the base 2
 * n = 9 then square root of 3*3 = 3
 */
public class FindSquareRootOfNumber {
    public static float sqrt(int number) {
        if (number < 0)
            return -1;
        if (number == 0 || number == 1)
            return number;

        float start = 0.0f;
        float end = number;
        float prec = 0.001f;
        float middle = start;
        float diff = (float) Math.abs(Math.pow(middle, 2) - number);

        while (diff >= prec) {
            middle = (start + end) / 2.0f;

            if (Math.pow(middle, 2) > number) {
                end = middle;
            } else {
                start = middle;
            }

            diff = (float) Math.abs(Math.pow(middle, 2) - number);
        }
        return middle;
    }

    public static void main(String[] args) {
        System.out.println("Find Square Root Of Number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find sqrt: ");
        int num = sc.nextInt();
        sc.close();

        if(num <= 0) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("Sqrt of %d: %f", num, sqrt(num));
        }
    }
}
