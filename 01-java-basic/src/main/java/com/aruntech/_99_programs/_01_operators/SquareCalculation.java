package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Find the area and surface of square shape
 * Area: a*a  a is side
 * Surface: 4*a  a is side
 * Diagonal: Math.sqrt(2)*a
 */
public class SquareCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side value: ");
        int a = sc.nextInt();
        sc.close();

        double area = a * a;
        double surface = 4 * a;
        double diagonal = Math.sqrt(2) * 4;
        System.out.println("Area of Rectangle:"+area);
        System.out.println("Surface Area of Rectangle:"+surface);
        System.out.println("Diagonal of Rectangle:"+diagonal);
    }
}
