package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Convert Fahrenheit value to Celsius
 * E.g: f=100 output is 37
 */
public class ConvertFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit value:");
        int f = sc.nextInt();
        sc.close();

        int c = (f-32) * 5/9;
        System.out.println("Celsius value of Fahrenheit value "+f+" is "+c);
    }
}
