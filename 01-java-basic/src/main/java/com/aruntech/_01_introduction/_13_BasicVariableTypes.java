package com.aruntech._01_introduction;

/**
 * Variable types and scopes are as follows
 *   Class variable -- shared by all instances of a class
 *   Instance variable -- are specific to each instance of a class
 *   Local variable -- specific to the block where they're declared
 *   Final variable -- a way to share values across different scopes
 */
public class _13_BasicVariableTypes {

    // declared within a class but outside any method and constructor
    // accessible anywhere including static, instance method and constructor
    // can be accessible by class name followed by .
    // not assign any value to this variable then JVM will provide default values
    // to the class variable e.g: int for 0 and string for null
    static int classVariable = 10;
    static String name;

    // final variable allow to assign value only once
    // final variables should be assigned by value before use
    // If we try assigned value again or using without assign any value will throw an error
    static final String TYPE = "Variable Types";

    // declared within a class but outside any method and constructor
    // accessible within the class's methods, constructors, and instances.
    // cannot be accessed directly from static methods.
    // not assign any value to this variable then JVM will provide default values
    // to the class variable e.g: int for 0 and string for null
    int instanceVariable;
    String instanceName = "Hello";

    public void instanceMethod() {
        System.out.println("Inside Instance Method");
        System.out.println("Class Variable: " + classVariable);
        System.out.println("Final Variable: " + TYPE);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Instance Name: " + instanceName);
    }

    // declared within a method, constructor, or block (e.g., if, for, while)
    // accessible only within the block where they're declared
    // cannot be accessed outside their scope
    // all local variable should be initialized with value otherwise it will throw an error.
    public void localMethod() {
        int localVar = 10;
        System.out.println("Inside Local Method");
        System.out.println("Local Variable: " + localVar);

        if (true) {
            int blockVar = 40;
            System.out.println("Block Variable: " + blockVar);
        }
    }

    // main method is basically a static method
    public static void main(String[] args) {
        System.out.println("Inside Main Method");
        System.out.println("Class Variable: " + classVariable);
        System.out.println("Class Variable: " + name);
        System.out.println("Final Variable: " + TYPE);
        //System.out.println(instanceVariable);  //throw an error
        //System.out.println(localVar); //throw an error
        System.out.println();

        _13_BasicVariableTypes cls = new _13_BasicVariableTypes();
        cls.instanceMethod();
        System.out.println();
        cls.localMethod(); //instance and local method are similar
    }
}
