package com.aruntech._02_operators;

import java.util.Scanner;

public class _12_FindHypotenuseProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side A: ");
        double a = sc.nextDouble();
        System.out.print("Enter side B: ");
        double b = sc.nextDouble();
        // h = sqrt(a^2+b^2)
        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse: " + h);
    }
}
