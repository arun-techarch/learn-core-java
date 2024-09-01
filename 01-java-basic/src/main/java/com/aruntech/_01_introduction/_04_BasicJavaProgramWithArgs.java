package com.aruntech._01_introduction;

/**
 * Java program will also allow to send the parameters to run the program
 * you can pass the parameters while running the java program and separated by space
 * e.g: java <Java class> arg1 arg2 arg3 ....
 */
public class _04_BasicJavaProgramWithArgs {
    // all java programs parameters can be accessed through args variable
    // all argument is considered as string type, or you need to convert to
    // respective data type before perform any operation
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Please provide at least one argument.");
            //System.exit() will stop the execution of JVM
            System.exit(1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}