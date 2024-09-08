package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to find the given string has unique chars
 * e.g: str=mature then true or str=hello then false
 */
public class CheckUniqueCharacter {
    // using ASCII code array to set the flag for each char.
    // if it already set means it's a duplicate char
    private static boolean isUniqueCharByArray(String input) {
        if(input.length() > 128)
            return false;
        boolean[] char_set = new boolean[128];
        for(int i=0;i<input.length();i++) {
            int val = input.charAt(i);
            if(char_set[val])
                return false;
            char_set[val] = true;
        }
        return true;
    }

    // using bit vector
    private static boolean isUniqueCharByBitVector(String input) {
        int checker = 0;
        for(int i=0;i<input.length();i++) {
            int val = input.charAt(i) - 'a';
            if((checker & (1 << val)) > 0)
                return false;
            checker |= (1 << val);
        }
        return true;
    }

    // compare by first char with next to end of the array
    private static boolean isUniqueCharByComparision(String input) {
        char ch;
        for(int i=0;i<input.length();i++) {
            ch = input.charAt(i);
            for(int j=i+1; j<input.length(); j++) {
                if(ch == input.charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Check Unique Character");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the characters to encode: ");
        String str = sc.next();
        sc.close();

        if(str.isBlank() || str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("%s is unique(CharArray): %b%n", str, isUniqueCharByArray(str));
            System.out.printf("%s is unique(BitVector): %b%n", str, isUniqueCharByBitVector(str));
            System.out.printf("%s is unique(Comparison): %b%n", str, isUniqueCharByComparision(str));
        }
    }
}
