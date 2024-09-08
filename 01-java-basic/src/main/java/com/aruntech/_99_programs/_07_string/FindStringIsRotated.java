package com.aruntech._99_programs._07_string;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * program to find the given rotation of another string
 * e.g: str=helloworld, revStr=orldhellow then true
 *      str=helloworld, revStr=horldhellow then false
 */
public class FindStringIsRotated {

    // using reverse string logic
    private static boolean isRotateString(String str, String reverseStr) {
        String temp = (reverseStr + reverseStr);
        int index = temp.indexOf(str.charAt(0));
        int count = 0;
        for(int i=index; i<index+str.length(); i++) {
            if(temp.charAt(i) != str.charAt(count)) {
                return false;
            }
            count++;
        }
        return true;
    }

    // using contains function
    private static boolean isRotateUsingContains(String str, String reverseStr) {
        return (str + str).contains(reverseStr);
    }

    // using regex expression
    private static boolean isRotateUsingRegEx(String str, String reverseStr) {
        return (str + str).matches("(?i).*" + Pattern.quote(reverseStr)+".*");
    }

    public static void main(String[] args) {
        System.out.println("Find String is Rotated");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("Enter the reverse string: ");
        String reverseStr = sc.next();
        sc.close();

        if(str.isBlank() || str.trim().isEmpty() || reverseStr.isBlank() || reverseStr.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("The %s and %s is rotated: %b%n", str, reverseStr, isRotateString(str, reverseStr));
            System.out.printf("The %s and %s is rotated using contains: %b%n", str, reverseStr, isRotateUsingContains(str, reverseStr));
            System.out.printf("The %s and %s is rotated using pattern: %b%n", str, reverseStr, isRotateUsingRegEx(str, reverseStr));
        }
    }
}
