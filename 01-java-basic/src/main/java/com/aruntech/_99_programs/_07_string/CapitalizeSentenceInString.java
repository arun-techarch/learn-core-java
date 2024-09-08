package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to capitalize the sentence in string
 * e.g: str=this is a sample text. then This Is A Sample Text.
 */
public class CapitalizeSentenceInString {

    private static String capitalizeUsingCharArray(String str) {
        StringBuilder result = new StringBuilder();
        boolean isCapitalize = true;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                result.append(' ');
                isCapitalize = true;
            } else if (isCapitalize) {
                result.append(Character.toUpperCase(c));
                isCapitalize = false;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static String capitalizeUsingArray(String str) {
        StringBuilder result = new StringBuilder();
        String[] strArray = str.split(" ");

        for (String s : strArray) {
           result.append(Character.toUpperCase(s.charAt(0)))
                   .append(s.substring(1))
                   .append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Capitalize Sentence in String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();

        if(str.isBlank() || str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("Capitalized text(CharArray): %s%n", capitalizeUsingCharArray(str));
            System.out.printf("Capitalized text(Array): %s%n", capitalizeUsingArray(str));
        }
    }
}
