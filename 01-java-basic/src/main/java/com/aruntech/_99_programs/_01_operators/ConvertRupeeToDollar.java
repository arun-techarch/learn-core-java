package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Convert rupee to dollar
 * E.g: dl=30 output is 2100
 */
public class ConvertRupeeToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dollar amount:");
        int dl = sc.nextInt();
        sc.close();

        //Assume i dollar = 70 Rs
        int rs = dl * 70;
        System.out.println(dl+" $ = "+rs+" Rs.");
    }
}
