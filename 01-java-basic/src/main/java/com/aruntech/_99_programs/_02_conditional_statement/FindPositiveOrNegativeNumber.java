package com.aruntech._99_programs._02_conditional_statement;

/**
 * program to find positive or negative number
 * if number < 0 then negative number else positive number
 */
public class FindPositiveOrNegativeNumber {
    public static void checkPositiveOrNegative(int num) {
        if(num >= 0) {
            System.out.println(num+" is a positive number");
        } else {
            System.out.println(num+" is a negative number");
        }
    }

    public static void main(String[] args) {
        checkPositiveOrNegative(20);
        checkPositiveOrNegative(-4);
        checkPositiveOrNegative(11);
        checkPositiveOrNegative(-21);
    }
}
