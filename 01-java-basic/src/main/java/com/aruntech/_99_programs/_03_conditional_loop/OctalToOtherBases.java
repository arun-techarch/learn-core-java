package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Convert the octal into other bases of binary(2), decimal(10) and hexadecimal(16)
 * E.g: o=72 output is decimal=58, binary=111010, hexadecimal=3A
 * consider octal 72 = 7*(8^1)+2*(8^0) = 7*8+2*1 = 56+2 = 58
 */
public class OctalToOtherBases {

    //multiply each value with base it's position
    //then add the same to find the decimal value
    public static int octalToDecimal(String o) {
        int d = 0, base = 1;
        int length = o.length();
        for (int i = length - 1; i >= 0; i--) {
            int digit = o.charAt(i) - '0';
            d += digit * base;
            base *= 8;
        }
        return d;
    }

    //binary means base 2 so divide the number by it's base
    //append to it's 0 index position
    public static String decimalToBinary(int d) {
        StringBuilder binary = new StringBuilder();
        while (d > 0) {
            binary.insert(0, d % 2);
            d /= 2;
        }
        return binary.toString();
    }

    //hexadecimal means base 0-9 and A-F so divide the number by it's base
    //append to it's 0 index position
    public static String decimalToHexadecimal(int d) {
        StringBuilder hex = new StringBuilder();
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (d > 0) {
            int remainder = d % 16;
            hex.insert(0, hexDigits[remainder]);
            d /= 16;
        }
        return hex.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal value:");
        int o = sc.nextInt();
        int d = octalToDecimal(String.valueOf(o));
        System.out.println("Octal:"+o);
        System.out.println("Decimal:"+d);
        System.out.println("Binary:"+decimalToBinary(d));
        System.out.println("Hexadecimal:"+decimalToHexadecimal(d));
        sc.close();
    }
}
