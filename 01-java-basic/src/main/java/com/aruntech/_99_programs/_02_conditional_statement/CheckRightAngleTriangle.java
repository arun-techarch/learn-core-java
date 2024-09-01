package com.aruntech._99_programs._02_conditional_statement;

import java.util.Scanner;

/**
 * program to find the given triangle is right angle triangle
 * consider it has three sides a, b, c
 * (a*a)+(b*b) = (c*c)
 * e.g: a=3, b=4, c=5 then 9+16 = 25 so, right angle triangle
 *      a=2, b=3, c=4 then 4+9=16 so, not a right angle triangle
 */
public class CheckRightAngleTriangle {
    public static void main(String[] args) {
        System.out.println("Check Right Angle Triangle:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        int a = sc.nextInt();
        System.out.print("Enter side b: ");
        int b = sc.nextInt();
        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        if((a*a+b*b) == (c*c)) {
            System.out.println("Given triangle is a right angle triangle");
        } else {
            System.out.println("Given triangle is not a right angle triangle");
        }
    }
}
