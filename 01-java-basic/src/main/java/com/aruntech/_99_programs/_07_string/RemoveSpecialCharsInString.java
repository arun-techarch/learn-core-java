package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to remove the special char from string
 * special chars are: @#$%^&*()
 * e.g: str=he%2Ce)*ll@ then he2Cell
 */
public class RemoveSpecialCharsInString {
    private static String removeSpecialCharUsingCharArr(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c: str.toCharArray()) {
            if(c == '@' || c == '#' || c == '$' || c == '%' ||
            c == '^' || c == '&' || c == '*' || c == '(' || c == ')') {
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    // @#$%^&*()
    private static String removeSpecialCharUsingRegex(String str) {
        String regex = "[^a-zA-Z0-9\\s]";
        // replace all special characters with an empty string
        return str.replaceAll(regex, "");
    }

    public static void main(String[] args) {
        System.out.println("Remove Special Chars in String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();

        if(str.isBlank() || str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("After removing special char from %s (CharArray): %s%n", str, removeSpecialCharUsingCharArr(str));
            System.out.printf("After removing special char from %s (RegEx): %s%n", str, removeSpecialCharUsingRegex(str));
        }
    }
}
