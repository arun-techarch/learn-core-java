package com.aruntech._01_introduction;

/**
 * comments are useful to understand the code and what the program does.
 * there are 3 types of comments in Java
 *   - single-line comment: tells what this line will do
 *   - multi-line comment: tells what this function or specific block will do
 *   - java doc comment: tells about the input and output of the method
 * 
 * all comments are removed while byte code generation this is only for developer understanding
 * not all the code required comments, only specific or complex logic which may required some tips 
 * or input to understand the code
 *   
 */
public class _17_BasicJavaComments {
	// declare the const PI (single-line)
	static final double PI = 3.14;
	
	 /** (java doc)
     * This is a Javadoc comment for the calcAreaOfCircle method.
     * It provides documentation for the method.
     *
     * @param r The first parameter.
     * @return The area of circle PI * r * r
     */
    public static double calcAreaOfCircle(int r) {
        return PI * r * r;
    }

    public static void main(String[] args) {
    	int r = 10;
    	
    	/* calcuate the area of circle
    	 * then print to the console
    	 */
    	System.out.println("Area of circle = " + calcAreaOfCircle(r));
    }

}
