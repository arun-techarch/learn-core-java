package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Convert char to lowercase
 * E.g: T output is t
 */
public class PrintCharToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch = sc.next().toLowerCase().charAt(0);
        System.out.println("Lowercase is: "+ch);
        sc.close();
    }
}
