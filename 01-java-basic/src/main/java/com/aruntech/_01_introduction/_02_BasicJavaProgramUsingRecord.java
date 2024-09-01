package com.aruntech._01_introduction;

/**
 * By using the record which is supported from Java16+
 * will allow to create the class by shorthand which
 * internally create the class for us with all default configuration
 */
public record _02_BasicJavaProgramUsingRecord() {
    // this is main method or function which tell JVM
    // this is the starting point of the program execution
    public static void main(String[] args) {
        // below statement will print Hello, World in the console
        System.out.println("Hello, World using Record");
    }
}