package com.aruntech._01_introduction;

/**
 * Java program for adding two numbers so, you need to pass the parameter through terminal
 * or run parameters while running the program else it won't run.
 * e.g: java _09_BasicJavaProgramWithArgs 1 2 (run successfully)
 * e.g: java _09_BasicJavaProgramWithArgs 1 Add (throw java.lang.NumberFormatException)
 */
public class _09_BasicJavaProgramWithArgs {
    // all java programs parameters can be accessed through args variable
    // all argument is considered as string type, or you need to convert to
    // respective data type before perform any operation
    public static void main(String[] args) {
        // using if loop to verify expected params
        if (args.length < 2) {
            System.err.println("Please provide at least two argument.");
            //System.exit() will stop the execution of JVM
            System.exit(1);
        }

        // using for loop to iterate values from args array
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }

        // adding args without casting will perform string concatenation
        // it yields for wrong result
        System.out.println("Add: " + args[0]+args[1]);

        // Integer.parseInt() will help to convert string value to integer
        // If we try to convert non-numeric value then it will throw java.lang.NumberFormatException
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Add: " + (num1 + num2 ));
    }
}