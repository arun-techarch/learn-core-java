package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Find the area and surface of triangle shape
 * Area: (b*h)/2   b is base and h is height
 * Surface: a+b+c  a is side, b is base and c is another side
 */
public class TriangleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int b = sc.nextInt();
        System.out.print("Enter height value: ");
        int h = sc.nextInt();
        System.out.print("Enter side1 value: ");
        int a = sc.nextInt();
        System.out.print("Enter side2 value: ");
        int c = sc.nextInt();
        sc.close();

        int area = (b * h)/2;
        int surface = a + b + c;
        System.out.println("Area of Rectangle:"+area);
        System.out.println("Surface Area of Rectangle:"+surface);
    }
}
