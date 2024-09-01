package com.aruntech._01_introduction;

/**
 * Some scenario we need to convert one data type to another
 * Type casting: Implicit and Explicit type
 *   implicit(widening): small datatype into larger data type
 *   explicit(narrowing): larger datatype to smaller but maybe data will be lost
 * Below use cases cannot be support in type casting
 *   incompatible data types i.e: non-numeric to numeric data types
 *   primitive and reference data types directly
 */
public class _10_BasicTypeCasting {
    public static void main(String[] args) {
        int age = 25;
        float salary = 50000.00f;
        double average = 87.5;

        // Widening or implicit cast
        double ageAsDouble = age;
        System.out.println("Implicit: " + ageAsDouble);

        // Narrowing or explicit cast with data loss
        int averageAsInt = (int) average;
        System.out.println("Explicit: " + ageAsDouble);

        //this will get the ASCII code of a character
        int charA = (int) 'A';
        System.out.println("Explicit(A): " + charA);

        // Incompatible cast (will not compile)
        // int to float or double
        //int a = 20.0f; // Error: incompatible types
        //int a = 250000.00; // Error: incompatible types
        int a = (int) 250000.00; //correct

        // by default the precision type was double
        //float amount = 250000.50; // Error: incompatible types
        float amount = 250000.50f; // correct

        // primitive to reference type and vice versa
        //String numAsString1 = 12345; // Error: incompatible types
        //String numAsString2 = 20000.00; // Error: incompatible types

        // String.valueOf() will help to convert the numeric value to string
        String numAsString1 = String.valueOf(12345.00);
        System.out.println("NumAsString: " + numAsString1);

        // Integer.valueOf() will help to convert the string numeric value to numeric type
        //int stringAsNum1 = "12345";  // Error: incompatible types
        int stringAsNum1 = Integer.valueOf("12345");
        System.out.println("StringAsNum: " + stringAsNum1);

        // cannot convert alphanumeric value to numeric type
        //String name = "Alice";
        //int nameAsInt = (int) name; // Error: incompatible types
    }
}
