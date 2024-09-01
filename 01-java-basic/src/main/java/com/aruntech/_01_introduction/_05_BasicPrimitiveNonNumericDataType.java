package com.aruntech._01_introduction;

/**
 * Choose the datatype depends upon the value to store otherwise
 * we unnecessarily hold more spaces which is not really required for the program
 * so choose the datatype based on your variable hold the actual value within specific range
 * Primitive datatype
 *    - Non-Numeric: char(16) and boolean(1)
 */
public class _05_BasicPrimitiveNonNumericDataType {
    public static void main(String[] args) {
        System.out.println("Non-Numeric DataTypes:");
        // character is used to store single character or unicode value
        // character should be defined within single quotes ('B')
        // e.g: sex as 'M' for male and 'F' for female otherwise
        // result as 'P' for pass and 'F' for fail
        // Char range Min: -128 Max: 127
        System.out.println("Char: " + 'A');
        System.out.println();

        // boolean can store only true or false value
        // so one bit is enough to store the flag which will indicate true or false
        System.out.println("Boolean: " + true);
        System.out.println();
    }
}
