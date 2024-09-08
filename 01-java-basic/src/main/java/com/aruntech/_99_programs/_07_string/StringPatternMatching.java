package com.aruntech._99_programs._07_string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * program to match the pattern from the string
 * e.g:str1=The quick brown fox jumps over the lazy dog., str2=fox then found in 16th index
 *     str1=The quick brown fox jumps over the lazy dog., str2=fox then not found
 */
public class StringPatternMatching {

    private static void findPatternMatch(String str1, String str2) {
        // compile the regular expression pattern
        Pattern pattern = Pattern.compile(str2);

        // create a Matcher object to find matches in the text
        Matcher matcher = pattern.matcher(str1);

        // check if the pattern matches the entire text
        if (matcher.matches()) {
            System.out.println("The pattern \"" + str2 + "\" matches the entire text.");
        } else {
            // check if the pattern occurs within the text
            while (matcher.find()) {
                System.out.println("Pattern found at index " + matcher.start());
                System.out.println("Matched text: " + matcher.group());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("String Pattern Matching");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the pattern string: ");
        String str2 = sc.nextLine();
        sc.close();

        if(str1.isBlank() || str1.trim().isEmpty() || str2.isBlank() || str2.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            findPatternMatch(str1, str2);
        }
    }
}
