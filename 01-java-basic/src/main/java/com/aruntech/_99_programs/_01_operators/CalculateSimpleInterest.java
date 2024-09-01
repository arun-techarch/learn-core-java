package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Calculate simple interest
 * Formula: SI = (principal * rate * time) /100
 * E.g: p=5000, r=5, t=3 output is 750.0
 */
public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time period in years: ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
        scanner.close();
    }
}
