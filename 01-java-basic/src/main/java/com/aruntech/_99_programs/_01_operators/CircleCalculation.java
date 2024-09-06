package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Find the area and surface of circle shape
 * Area: PI*R*R   PI is constant and R is radius
 * Surface: 2*PI*R   PI is constant and R is radius
 */
public class CircleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius value: ");
        int r = sc.nextInt();
        sc.close();

        double area = Math.PI * r * r;
        double surface = 2 * Math.PI * r;
        System.out.println("Area of Circle:"+area);
        System.out.println("Surface Area of Circle:"+surface);
    }
}
