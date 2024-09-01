package com.aruntech._01_introduction;

import java.math.BigDecimal;

/**
 * Cannot use double or float for financial or accurate calculation
 * which may create in-accurate result so, better we can use
 * BigDecimal instead of double or float datatypes
 * Note: we cannot directly add integer value to BigDecimal instead
 * we need to cast the value and perform the operation
 */
public class _07_BasicPrimitivePrecisionIssue {
    public static void main(String[] args) {
        // financial calculation using double
        System.out.println("Financial Calculation using Double");
        System.out.println("Add: " + (44.56789876 + 34.2234));
        System.out.println("Subtract: " + (44.56789876 - 34.2234));
        System.out.println("Multiply: " + (44.56789876 * 34.2234));
        System.out.println("Divide: " + (44.56789876 / 34.2234));
        System.out.println();

        // financial calculation using BigDecimal
        // BigDecimal allow to pass string value instead of double
        // by default it provides all arithmetic operations
        System.out.println("Financial Calculation using BigDecimal");
        BigDecimal num1 = new BigDecimal("44.56789876");
        BigDecimal num2 = new BigDecimal("34.2234");
        System.out.println("Add: " + num1.add(num2));
        System.out.println("Subtract: " + num1.subtract(num2));
        System.out.println("Multiply: " + num1.multiply(num2));
        System.out.println("Divide: " + num1.divide(num2, 5));
    }
}
