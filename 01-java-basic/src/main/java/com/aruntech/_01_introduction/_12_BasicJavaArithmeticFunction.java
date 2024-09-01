package com.aruntech._01_introduction;

/**
 * Function or method should declare before calling the method
 * JVM will look for the method with the no. parameters, and it's type
 * If it matches then call the actual method directly else it will do implicit
 * type casting then try to match the respective method and execute it
 * If not found any match then throw an error
 */
public class _12_BasicJavaArithmeticFunction {

    // add method declaration
    public static int add(int a, int b) {
        return a + b;
    }

    // subtract method declaration
    public static int subtract(int a, int b) {
        return a - b;
    }

    // multiply method declaration
    public static int multiply(int a, int b) {
        return a * b;
    }

    // divide method declaration
    public static int divide(int a, int b) {
        return a / b;
    }

    // all static, final variable, function can be accessed from main
    // we can directly call the method which will be executed directly
    public static void main(String[] args) {
        int a = 20;
        int b = 5;

        // format is used for display readable output to the user
        // so user know which operation perform with parameters
        // format can be %d(decimal) %s(string) %f(float) also make sure to
        // pass all required formatted value else it will throw an error
        // format will replace the value to the respective position before display to console
        System.out.printf("%d+%d = %d\n", a, b, add(a,b)); // add method call
        System.out.printf("%d-%d = %d\n", a, b, subtract(a,b)); // subtract method call
        System.out.printf("%d*%d = %d\n", a, b, multiply(a,b)); // multiply method call
        System.out.printf("%d/%d = %d\n", a, b, divide(a,b)); // divide method call
    }
}
