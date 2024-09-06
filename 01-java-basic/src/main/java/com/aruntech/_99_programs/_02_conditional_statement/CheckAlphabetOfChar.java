package com.aruntech._99_programs._02_conditional_statement;

import java.util.Scanner;

/**
 * Check the given char is alphabets
 * alphabets: any character from a-z or A-Z
 * E.g: c output is alphabet
 * 21 output is not alphabet
 */
public class CheckAlphabetOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        String ch = sc.next();
        sc.close();

        if(!Character.isDigit(ch.charAt(0))) {
            System.out.println(ch+" is a alphabet");
        } else {
            System.out.println(ch+" is not a alphabet");
        }
    }
}
