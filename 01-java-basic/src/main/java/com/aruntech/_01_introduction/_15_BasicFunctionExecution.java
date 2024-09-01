package com.aruntech._01_introduction;

/**
 * Function parameter can be of either below types
 *   actual parameters
 *     - the values that are passed to a method when it is called
 *     - supplied within the parentheses of the method call
 *     - number and types of actual parameters must match the formal parameters declared
 *       in the method's signature
 *   formal parameters
 *     - variables declared within the parentheses of a method's signature
 *     - represent the value expect for the method to execute
 *     - required to pass values to all formal parameters may be optional for default parameter
 */
public class _15_BasicFunctionExecution {

	// this method has formal parameters of a,b and c
	// program counter will keep track of line of execution statement
	// for every method execution has it's own stack to maintained the variables
	// once the execution was done and it return any value then pass the value 
	// return back to reference variable and remove from the heap space
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
    	// these values are maintained in the main stack
    	int a = 10;
    	int b = 20;
    	int c = 30;
    	
    	// method will be executed in the heap memory and reference 
    	// will maintained in stack of main method of application
    	// function return value stored to sum in stack then reference the value of sum.
        int sum = add(a, b, c);
        System.out.println("Sum: " + sum);
    }

}
