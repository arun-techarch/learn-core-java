package com.aruntech._99_programs._07_string;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 * program to find each char count in a string
 * e.g: str=carrot then a(1), r(2), c(1), t(1), o(1)
 */
public class EachCharCountInString {
    private static void getEachCharCount(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        printValues(charCount);
    }

    private static void printValues(Map<Character, Integer> mapValues) {
        for(char ch:mapValues.keySet()) {
            System.out.printf("%s: (%d)%n", ch, mapValues.get(ch));
        }
    }

    public static void main(String[] args) {
        System.out.println("Each Char Count in String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();

        if(str.isBlank() || str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            getEachCharCount(str);
        }
    }
}
