package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Convert Celsius value to Fahrenheit
 * E.g: c=28 output is 82
 */
public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius value:");
        int c = sc.nextInt();
        sc.close();

        int f = (c * 9/5) + 32;
        System.out.println("Fahrenheit value of Celsius value "+c+" is "+f);
    }
}
