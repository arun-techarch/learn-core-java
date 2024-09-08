package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to find string and reverse of string is same
 * palindrome e.g: radar, level, rotor, madam, repaper, tattarrattat
 * e.g: str=level then true
 *      str=test then false
 */
public class StringPalindrome {
    private static boolean isPalindromeUsingIndex(String str) {
        // iterate through the string from both ends
        int leftIndex = 0;
        int rightIndex = str.length() - 1;

        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false; // if characters don't match, it's not a palindrome
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    private static boolean isPalindromeUsingReverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] charArray = str.toCharArray();

        for(int i=charArray.length-1; i>=0; i--) {
            strBuilder.append(charArray[i]);
        }
        return str.contentEquals(strBuilder);
    }

    private static boolean isPalindromeUsingSB(String str) {
        return str.contentEquals(new StringBuilder(str).reverse());
    }

    public static void main(String[] args) {
        System.out.println("String Palindrome");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        sc.close();

        if(str.isBlank() && str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("The %s is palindrome (index): %b%n", str, isPalindromeUsingIndex(str));
            System.out.printf("The %s is palindrome (reverse): %b%n", str, isPalindromeUsingReverse(str));
            System.out.printf("The %s is palindrome (sb): %b%n", str, isPalindromeUsingSB(str));
        }
    }
}
