package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to shrink chars in a string
 * it will add count for each chars
 * e.g: str=abbb vvvv s rttt then a1b3 v4 s1 r1t3
 */
public class ShrinkingCharsInString {
    private static String shrinkString(String str) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            count++;

            if(!Character.isWhitespace(str.charAt(i))) {
                if((i+1) >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                    result.append(str.charAt(i)).append(count);
                    count = 0;
                }
            } else {
                result.append(str.charAt(i));
                count = 0;
            }
        }

        //return only the result is less than the given string
        return (result.length() > str.length()) ? str : result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Shrinking Chars in String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();

        if(str.isBlank() || str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("The %s of shrink chars: %s%n", str, shrinkString(str));
        }
    }
}
