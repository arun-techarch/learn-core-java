package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to search substring from string.
 * e.g: str1=hello world, str2=world then found(7 position)
 *      str1=hello world, str2=western then not found
 */
public class SubstringSearchFromString {

    public static int findSubstringIndex(String str, String substring) {
        int strLength = str.length();
        int subLength = substring.length();

        if (subLength > strLength) {
            return -1;
        }

        for (int i = 0; i <= strLength - subLength; i++) {
            if (str.substring(i, i + subLength).equals(substring)) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Search Substring from String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the search string: ");
        String str2 = sc.nextLine();
        sc.close();

        if(str1.isBlank() || str1.trim().isEmpty() || str2.isBlank() || str2.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            int index = findSubstringIndex(str1, str2);
            if(index >= 0) {
                System.out.printf("%s found in %s at %d position%n", str1, str2, index);
            } else {
                System.out.printf("%s not found in %s%n", str1, str2);
            }
        }
    }
}
