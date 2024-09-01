package com.aruntech._01_introduction;

/**
 * Java is a high level, imperative and case-sensitive program
 * variable is a name, label or identifier to store and retrieve the value from the memory
 * variable declaration by
 *   dataType variableName;
 * variable assignment by using = operator
 *   variableName = value
 * we can define declaration and assignment in the single line itself (preferred way)
 *   dataType variableName = value;
 *
 * Variable Name Conversion
 *  Case-sensitive: myVariable and myvariable are different.
 *  Start with: A letter (a-z, A-Z), underscore (_), or dollar sign ($). However, it's recommended to avoid starting with underscore or dollar sign for readability.
 *  Subsequent characters: Can be letters, digits, underscores, or dollar signs.
 *  No keywords: Cannot use reserved words like int, if, else, etc.
 *  Length: No strict limit, but generally keep it reasonable for readability.
 */
public class _08_BasicVariableDeclaration {
    public static void main(String[] args) {
        // Inside main method all declared variable should be assigned with initial value
        // variable assignment statement will be executed from right to left
        // first execute the expression then assign the value to the memory with identifier
        // if we access the identifier then we can access the value from the memory
        int i;
        i = 10;
        boolean isTrue = false;
        float salary = 5000.00f;
        char c = 'A';

        // string will be stored in string pool
        String name = "Joe";

        System.out.println("Int: " + i);
        System.out.println("Boolean: " + isTrue);
        System.out.println("Float: " + salary);
        System.out.println("Char: " + c);
        System.out.println("String: " + name);
        System.out.println();

        // understanding variable store and retrieve from the memory
        int a = 10;  // the value 10 stored in memory with identifier a
        int b = 20;  // the value 20 stored in memory with identifier b
        int sum;     // allocate int datatype size for sum without any value
        sum = a + b; // take value of a and b then add it save it to sum identifier in memory
        System.out.println("Sum = " + sum); // retrieve the value from sum identifier and display as output
    }
}
