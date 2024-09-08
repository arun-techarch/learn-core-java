package com.aruntech._99_programs._02_conditional_statement;

import java.util.Scanner;

/**
 * program to check given char is vowels
 * vowels: a, e, i, o, u or A, E, I, O, U
 * E.g: e output is vowel
 *      f output is not vowel
 */
public class CheckVowelOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
            System.out.println(ch+" is a vowel");
        } else {
            System.out.println(ch+" is not a vowel");
        }
    }
}
