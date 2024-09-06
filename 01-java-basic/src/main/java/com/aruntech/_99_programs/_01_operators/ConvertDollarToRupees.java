package com.aruntech._99_programs._01_operators;

import java.util.Scanner;

/**
 * Convert dollar to rupee
 * E.g: rs=5000 output is 71
 */
public class ConvertDollarToRupees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rupee amount:");
        int rs = sc.nextInt();
        sc.close();

        //Assume i dollar = 70 Rs
        int dl = rs / 70;
        System.out.println(rs+" Rs. = "+dl+" $.");
    }
}
