package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Convert char to uppercase
 * E.g: s output is S
 */
public class PrintCharToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch = sc.next().toUpperCase().charAt(0);
        System.out.println("Uppercase is: "+ch);
        sc.close();
    }
}
