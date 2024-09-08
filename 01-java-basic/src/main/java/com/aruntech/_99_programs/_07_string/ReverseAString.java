package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to reverse a string value
 * e.g str=hello world then dlrow olleh
 */
public class ReverseAString {

    private static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] charArray = str.toCharArray();

        for(int i=charArray.length-1; i>=0; i--) {
            strBuilder.append(charArray[i]);
        }
        return strBuilder.toString();
    }

    private static String reverseRecursively(String str) {
        if(str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Reverse a String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();

        if(str.isBlank() || str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            // using string builder
            System.out.printf("The reverse string of %s is: %s%n", str, new StringBuilder(str).reverse());
            System.out.printf("The reverse string of %s using iterative is: %s%n", str, reverse(str));
            System.out.printf("The reverse string of %s using recursion is: %s%n", str, reverseRecursively(str));
        }
    }
}
