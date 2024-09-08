package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to search a char from string. It will find the first found location
 * e.g: str1=hello, ch=l then found(3 position)
 *      str1=hello, ch=d then not found
 */
public class SearchCharFromString {
    private static int findCharIndex(String str, char ch) {
        char[] charArray = str.toCharArray();
        for(int i=0; i<charArray.length; i++) {
            if(charArray[i] == ch) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Search Char from String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("Enter the search char: ");
        char ch = sc.next().charAt(0);
        sc.close();

        if(str.isBlank() || str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            int index = findCharIndex(str, ch);
            if(index >= 0) {
                System.out.printf("%s found in %s at %d position%n", ch, str, index);
            } else {
                System.out.printf("%s not found in %s%n", ch, str);
            }
        }
    }
}
