package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Convert the decimal into other bases of binary(2), octal(8) and hexadecimal(16)
 * E.g: d=50 output is binary=110010, octal=62, hexadecimal=32
 * consider octal 62 = 6*(8^1)+2*(8^0) = 6*8+2*1 = 48+2 = 50
 * hexadecimal 32 = 3*(16^1)+2*(16^0) = 3*16+2*1 = 48+2 = 50
 */
public class DecimalToOtherBases {

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
        System.out.print("Enter decimal value:");
        int d = sc.nextInt();
        sc.close();

        System.out.println("Decimal:"+d);
        System.out.println("Binary:"+decimalToBinary(d));
        System.out.println("Octal:"+decimalToOctal(d));
        System.out.println("Hexadecimal:"+decimalToHexadecimal(d));
    }
}
