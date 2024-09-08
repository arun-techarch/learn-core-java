package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to get only chars from the string
 * e.g: str=ab576fex241hi then abfexhi
 */
public class ExtractCharFromString {
    private static String extractChars(String str) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder(String.valueOf(Integer.MAX_VALUE).length());

        for(int i=0; i<str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                temp.append(str.charAt(i));
            } else {
                if(!temp.isEmpty()) {
                    result.append(temp);
                    temp.delete(0, temp.length());
                }
            }
        }
        if(!temp.isEmpty()) {
            result.append(temp);
        }
        return result.isEmpty() ? str : result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Extract Chars From String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        sc.close();

        if(str.isBlank() || str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("%s has %s character", str, extractChars(str));
        }
    }
}
