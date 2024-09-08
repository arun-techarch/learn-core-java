package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to get only numbers from the string
 * e.g: str=ab23cd41 then 2341
 */
public class ExtractNumberFromString {

    private static int extractNumbers(String str) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder(String.valueOf(Integer.MAX_VALUE).length());

        for(int i=0; i<str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                temp.append(str.charAt(i));
            } else {
                if(!temp.isEmpty()) {
                    result.append(temp);
                    temp.delete(0, temp.length());
                }
            }
        }
        if(!temp.isEmpty()) {
            result.append(temp);
        }
        return result.isEmpty() ? 0 : Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        System.out.println("Extract Number From String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        sc.close();

        if(str.isBlank() || str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("%s has %d number", str, extractNumbers(str));
        }
    }
}
