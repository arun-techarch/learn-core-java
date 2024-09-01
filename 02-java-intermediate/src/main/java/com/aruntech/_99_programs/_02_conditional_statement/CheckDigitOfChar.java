package com.aruntech._99_programs._02_conditional_statement;

import java.util.Scanner;

/**
 * Check the given char is digit
 * digit: any numeric values
 * E.g: 85 output is digit
 * c output is not digit
 */
public class CheckDigitOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        String ch = sc.next();
        if(Character.isDigit(ch.charAt(0))) {
            System.out.println(ch+" is a digit");
        } else {
            System.out.println(ch+" is not a digit");
        }
        sc.close();
    }
}
