package com.aruntech._99_programs._02_conditional_statement;

import java.util.Scanner;

/**
 * Check the char is vowel
 * vowels: a, e, i, o and u
 * consonant: other than vowels
 * E.g: a output is vowel, c out is consonant
 * 5 output not a character
 */
public class CheckTypeOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch = sc.next().toLowerCase().charAt(0);
        if(Character.isLetter(ch)) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch+" is a vowel");
            } else {
                System.out.println(ch+" is a consonant");
            }
        } else {
            System.out.println(ch+" is not a character");
        }
        sc.close();
    }
}
