package com.aruntech._01_introduction;

import java.util.Scanner;

/**
 * Scanner class will help to interact with user to get the input for 
 * the program so the program is generic and get the input and print 
 * the output to the console.
 *  
 */
public class _16_BasicUserInteraction {

    public static void main(String[] args) {
    	// create the read stream to get the input from the user
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter your name: ");
    	String name = sc.next();
    	System.out.print("Enter your age: ");
    	int age = sc.nextInt();
    	System.out.println("Enter your contact: ");
    	int phone = sc.nextInt();
    	System.out.print("Enter your state: ");
    	String state = sc.next();
    	System.out.println();
    	
    	//display the values to the console
    	System.out.println("Personal Information");
    	System.out.println("Name: " + name);
    	System.out.println("Age: " + age);
    	System.out.println("Contact: " + phone);
    	System.out.println("State: " + state);
    	sc.close();
    }

}
