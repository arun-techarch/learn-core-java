package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to find the character in a sentence by ignoring space
 * e.g: str=hello world then 10
 */
public class CharCountInString {
    private static int getCharCount(String str) {
        int count = 0;
        for(char c:str.toCharArray()) {
            if(c != ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Char Count in String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();

        if(str.isBlank() || str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("The %s char count: %d%n", str, getCharCount(str));
        }
    }
}
