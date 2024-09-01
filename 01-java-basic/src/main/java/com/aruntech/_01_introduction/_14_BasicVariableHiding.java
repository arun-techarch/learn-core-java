package com.aruntech._01_introduction;

/**
 * Variable hiding or shadowing will happen when we are using the same variable
 * in different or within the scope. so this will hide the actual value and use
 * the value defined in the local scope then we can access the actual value outside
 * the local scope.
 */
public class _14_BasicVariableHiding {
    static int outerVariable = 5;

    // basically java method using the parameter as reference type(copy and use it as new variable)
    // so, any modification happened on this variable won't affect the actual value of the variable
    static void addAndPrintValue(int value) {
        value = value + 10;
        System.out.println("Inside addAndPrintValue value is: " + value);
    }

    // it will return the method reference value and assigned to the variable will affect
    // the actual value of the variable
    static int addAndReturn(int value) {
        value = value + 10;
        System.out.println("Inside addAndReturn value is: " + value);
        return value;
    }

    public static void main(String[] args) {
        int innerVariable = 10;
        System.out.println("Outer variable: " + outerVariable);

        System.out.println("Inner variable (method): " + innerVariable);
        addAndPrintValue(innerVariable);
        System.out.println("Inner variable (method): " + innerVariable);
        System.out.println();

        System.out.println("Inner variable (method): " + innerVariable);
        innerVariable = addAndReturn(innerVariable);
        System.out.println("Inner variable (method): " + innerVariable);
    }
}
