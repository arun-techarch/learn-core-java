package com.aruntech._01_introduction;

import java.util.Arrays;

/**
 * Datatypes used define the size of the data going to store in the memory
 * so, we carefully select the datatype based on the operation we are going to perform
 * Basically datatypes are below types
 * 1. Primitive datatype
 *    - Numeric: byte, short, int, long, float, double
 *    - Non-Numeric: char and boolean
 * 2. Reference datatype - string, array, class, interface etc.
 */
public class _03_BasicPrimitiveDataType {
    public static void main(String[] args) {
        // all primitive datatypes are stored in a stack memory
        // once the program execution completed then it will be removed from the stack
        System.out.println("Primitive DataTypes:");
        System.out.println("Numeric DataTypes:");
        System.out.println("Byte: " + 8);
        System.out.println("Short: " + 128);
        System.out.println("Integer: " + 12560);
        System.out.println("Long: " + 1500000L);

        // if you want to store the value with precision then you may choose float or double
        System.out.println("Float: " + 20.35f);
        System.out.println("Double: " + 500000.00);

        // Non-numeric datatypes used to store non-numeric values like char and boolean
        System.out.println("Non-Numeric DataTypes:");
        System.out.println("Char: " + 'A');
        System.out.println("Boolean: " + true);
        System.out.println();

        // all reference objects are stored in heap memory
        // once the scope of execution completed then it will remove from the memory
        System.out.println("Reference Types:");
        // string should be defined within double quotes ("Hello")
        System.out.println("String: " + "Apple");
        // we will cover array later in details so, just understand how it looks like
        String[] fruits = { "Apple", "Orange", "Grapes", "Pomegranate", "Kiwi"};
        System.out.println("Array: " + Arrays.toString(fruits));
    }
}
