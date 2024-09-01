package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Calculate compound interest
 * Formula: CI = (principal * (1 + (rate /100)) ^ time) - principal
 * E.g: p=5000, r=4, t=5 output is 1083.2645
 */
public class CalculateCompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time period in years: ");
        double time = scanner.nextDouble();

        // Calculate compound interest
        double amount = principal * Math.pow(1 + (rate / 100), time);
        double compoundInterest = amount - principal;
        System.out.println("Compound Interest: " + compoundInterest);
        scanner.close();
    }
}
