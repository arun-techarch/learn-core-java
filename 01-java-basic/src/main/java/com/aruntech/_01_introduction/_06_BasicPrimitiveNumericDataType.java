package com.aruntech._01_introduction;

/**
 * Choose the datatype depends upon the value to store otherwise
 * we unnecessarily hold more spaces which is not really required for the program
 * so choose the datatype based on your variable hold the actual value within specific range
 * Primitive datatype
 *    - Numeric: byte(8), short(16), int(32), long(64), float(32), double(64)
 */
public class _06_BasicPrimitiveNumericDataType {
    public static void main(String[] args) {
        // numeric datatype can store both positive and negative numbers
        // first bit usually store the parity bit which indicate whether
        // are we storing the positive or negative numbers
        System.out.println("Numeric DataTypes:");
        // Byte range Min: -128 Max: 127
        System.out.println("Byte: " + 8);
        System.out.println("Min: " + Byte.MIN_VALUE +" Max: " + Byte.MAX_VALUE);
        System.out.println();

        // Short range Min: -32768 Max: 32767
        System.out.println("Short: " + 128);
        System.out.println("Min: " + Short.MIN_VALUE +" Max: " + Short.MAX_VALUE);
        System.out.println();

        // Integer range Min: -2147483648 Max: 2147483647
        System.out.println("Integer: " + 12560);
        System.out.println("Min: " + Integer.MIN_VALUE +" Max: " + Integer.MAX_VALUE);
        System.out.println();

        // Long range Min: -9223372036854775808 Max: 9223372036854775807
        System.out.println("Long: " + 1500000L);
        System.out.println("Min: " + Long.MIN_VALUE +" Max: " + Long.MAX_VALUE);
        System.out.println();

        // if you want to store the value with two precision then we can choose float value
        // by default the value was double so, we can use `f` at last to specifically tell
        // JVM this datatype as float. this also uses first bit as parity bit
        // Float range Min: 1.4E-45 Max: 3.4028235E38
        System.out.println("Float: " + 20.35f);
        System.out.println("Min: " + Float.MIN_VALUE +" Max: " + Float.MAX_VALUE);
        System.out.println();

        // It will support to store multiple precision values by default it's double
        // Double range 4.9E-324 Max: 1.7976931348623157E308
        System.out.println("Double: " + 500000.00);
        System.out.println("Min: " + Double.MIN_VALUE +" Max: " + Double.MAX_VALUE);
        System.out.println();
    }
}
