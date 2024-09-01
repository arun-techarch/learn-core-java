package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Convert the binary into other bases of decimal(10), octal(8) and hexadecimal(16)
 * E.g: b=1101 output is decimal=13, octal=15, hexadecimal=D
 * consider binary 1101 = 1*(2^3)+1*(2^2)+0*(2^1)+1*(2^0) = 8+4+0+1 = 13
 */
public class BinaryToOtherBases {

    //multiply each value with base and it's position
    //then add the same to find the decimal value
    public static int binaryToDecimal(String b) {
        int d = 0, base = 1;
        int length = b.length();
        for (int i = length - 1; i >= 0; i--) {
            int digit = b.charAt(i) - '0';
            d += digit * base;
            base *= 2;
        }
        return d;
    }

    //octal means base 8 so divide the number by it's base
    //append to it's 0 index position
    public static String decimalToOctal(int d) {
        StringBuilder octal = new StringBuilder();
        while (d > 0) {
            octal.insert(0, d % 8);
            d /= 8;
        }
        return octal.toString();
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
        System.out.print("Enter binary value:");
        int b = sc.nextInt();
        int d = binaryToDecimal(String.valueOf(b));
        System.out.println("Binary:"+b);
        System.out.println("Decimal:"+d);
        System.out.println("Octal:"+decimalToOctal(d));
        System.out.println("Hexadecimal:"+decimalToHexadecimal(d));
        sc.close();
    }
}
