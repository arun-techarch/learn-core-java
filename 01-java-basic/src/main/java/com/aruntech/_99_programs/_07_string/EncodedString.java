package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to encode the space with encoded string
 * i.e. replace with whitespace with %20 character
 * e.g: str=Hello World then Hello%20World
 */
public class EncodedString {
    private static char[] encodedString(char[] str) {
        int countOfWhitespaces = 0;

        for(int i=0; i<str.length;i++) {
            if(Character.isWhitespace(str[i])) {
                countOfWhitespaces++;
            }
        }

        if(countOfWhitespaces > 0) {
            //create the new array size
            int size = str.length + (countOfWhitespaces * 2);
            char[] encodedString = new char[size];

            //populate the values
            int index = 0;
            for(int i=0; i< str.length; i++) {
                if(Character.isWhitespace(str[i])) {
                    encodedString[index] = '%';
                    encodedString[index+1] = '2';
                    encodedString[index+2] = '0';
                    index = index + 3;
                } else {
                    encodedString[index] = str[i];
                    index++;
                }
            }
            return encodedString;
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println("Encoded String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the characters to encode: ");
        char[] input = sc.nextLine().toCharArray();
        sc.close();

        char[] encodeString = encodedString(input);
        System.out.printf("The encoded string is: %s", String.valueOf(encodeString));
    }
}
