package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Convert the hexadecimal into other bases of binary(2), octal(8) and decimal(10)
 * E.g: h=9b output is binary=10011011, octal=233, hexadecimal=155
 * consider hexadecimal 9b = 9*(16^1)+11*(16^0) = 9*16+11*1 = 144+11 = 155
 */
public class HexadecimalToOtherBases {

    //multiply each value with base it's position
    //then add the same to find the decimal value
    public static int hexadecimalToDecimal(String h) {
        int d = 0, base = 1;
        int length = h.length();
        for (int i = length - 1; i >= 0; i--) {
            int digit;
            if (Character.isDigit(h.charAt(i))) {
                digit = h.charAt(i) - '0';
            } else {
                digit = Character.toLowerCase(h.charAt(i)) - 'a' + 10;
            }
            d += digit * base;
            base *= 16;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hexadecimal value:");
        String h = sc.next();
        sc.close();

        int d = hexadecimalToDecimal(h);
        System.out.println("Hexadecimal:"+h);
        System.out.println("Decimal:"+d);
        System.out.println("Binary:"+decimalToBinary(d));
        System.out.println("Octal:"+decimalToOctal(d));
    }
}
