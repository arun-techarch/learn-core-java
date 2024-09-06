package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Find the area and surface of rectangle shape
 * Area: l*w   l is length and w is width
 * Surface: 2*(l+b)  l is length and w is width
 * Diagonal: Math.sqrt(l*l+w*w)
 */
public class RectangleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length value: ");
        int l = sc.nextInt();
        System.out.print("Enter width value: ");
        int w = sc.nextInt();
        sc.close();

        double area = l * w;
        double surface = 2 * (l+w);
        double diagonal = Math.sqrt(l*l+w * w);
        System.out.println("Area of Rectangle:"+area);
        System.out.println("Surface Area of Rectangle:"+surface);
        System.out.println("Diagonal of Rectangle:"+diagonal);
    }
}
