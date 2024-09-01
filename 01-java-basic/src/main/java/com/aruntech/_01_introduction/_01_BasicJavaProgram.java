package com.aruntech._01_introduction;

/**
 * The simple java class should be defined like below
 * compiler will check or verify the program syntax and code to make it runnable (bytecode)
 * when executing the program, JVM will find the main method which is staring point
 * of the program execution then execute line by line ad print the output
 */
public class _01_BasicJavaProgram {
    // this is main method or function which tell JVM
    // this is the starting point of the program execution
    public static void main(String[] args) {
        // below statement will print Hello, World in the console
        System.out.println("Hello, World");
    }

    // var used for type inference which will automatically define
    // the type based on value assign with them.
    // the below main method is also valid but may throw error in IDE.
    /*public static void main(var args) {
        var count = 10;
    }*/
}