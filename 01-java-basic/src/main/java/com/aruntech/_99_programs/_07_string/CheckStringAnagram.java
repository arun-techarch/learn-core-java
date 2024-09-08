package com.aruntech._99_programs._07_string;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * program to check the string is anagram
 * anagram means string should use all character from first string
 * e.g: str1=listen, str2=silent then true (all letters used for second string)
 *      str1=listen, str1=listed then false
 */
public class CheckStringAnagram {
    private static boolean isAnagrams(String str1, String str2) {
        // anagrams have the same length
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        // count characters in the first string
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // decrement character counts in the second string
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; // character not found in the first string
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c);
            }
        }

        // check if all character counts are zero
        return charCount.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Check String Anagram");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the anagram string: ");
        String str2 = sc.nextLine();
        sc.close();

        if(str1.isBlank() || str1.trim().isEmpty() || str2.isBlank() || str2.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("The %s and %s is anagram: %b%n", str1, str2, isAnagrams(str1, str2));
        }
    }
}
