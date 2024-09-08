package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to find the string modification from actual string
 * it will find one edit else return false.
 * e.g: str=apple, modstr=aplle then true
 *      str=apple, modstr=aplee then false
 */
public class FindStringModification {
    private static boolean checkEditChanges(String input1, String input2) {
        if(input1.length() == input2.length())
            return checkEditReplace(input1, input2);
        else if(input1.length()+1 == input2.length())
            return checkInsertChanges(input1, input2);
        else if(input1.length()-1 == input2.length())
            return checkInsertChanges(input2, input1);
        return false;
    }

    private static boolean checkEditReplace(String input1, String input2) {
        boolean foundDiff = false;
        for(int i=0; i<input1.length();i++) {
            if(input1.charAt(i) != input2.charAt(i)) {
                if(foundDiff)
                    return false;
                foundDiff = true;
            }
        }
        return true;
    }

    private static boolean checkInsertChanges(String input1, String input2) {
        int index1 = 0;
        int index2 = 0;

        while(index2 < input2.length() && index1 < input1.length()) {
            if(input1.charAt(index1) != input2.charAt(index2)) {
                if(index1 != index2)
                    return false;
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Find String Modification");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("Enter the modify string: ");
        String modstr = sc.next();
        sc.close();

        if(str.isBlank() ||str.trim().isEmpty() || modstr.isBlank() || modstr.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("%s has one edit: %b", str, checkEditChanges(str, modstr));
        }
    }
}
