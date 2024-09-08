package com.aruntech._99_programs._07_string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * program to check the given string is permutation of another string
 * e.g: str1=dog, str2=god then true
 *      str1=dog, str2=but then false
 */
public class CheckStringPermutation {
    // using sort method
    private static String sort(String str) {
        char[] char_array = str.toCharArray();
        Arrays.sort(char_array);
        return new String(char_array);
    }

    private static boolean isPermutationUsingSort(String str1, String str2) {
        //compare those two string has same size
        if(str1.length() != str2.length())
            return false;
        return sort(str1).equals(sort(str2));
    }

    // check the hashtable has more than one odd entry
    private static boolean checkMaxOddOne(int[] table) {
        boolean foundOdd = false;
        for(int count:table) {
            if(count %2 == 1) {
                if(foundOdd)
                    return false;
                foundOdd = true;
            }
        }
        return true;
    }

    // using array
    private static boolean isPermutationUsingArray(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        int[] char_set = new int[Character.getNumericValue('z') - Character.getNumericValue('a')+1];

        //assign the char values to array
        for(char c:str1.toCharArray()) {
            int ch = getCharNumber(c);
            char_set[ch]++;
        }

        //check if the char was found in second string then remove it from array
        for(int i=0; i<str2.length();i++) {
            int c = getCharNumber(str2.charAt(i));
            char_set[c]--;
            if(char_set[c] < 0) {
                return false;
            }
        }
        return true;
    }

    // get char number
    private static int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int value = Character.getNumericValue(c);

        if(a <= value && value <= z) {
            return value - a;
        }
        return -1;
    }

    // using StringBuilder
    private static boolean isPermutationUsingSB(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        StringBuilder sb = new StringBuilder(str2);
        return str1.contentEquals(sb.reverse());
    }

    public static void main(String[] args) {
        System.out.println("Check String Permutation");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the permutation string: ");
        String str2 = sc.nextLine();
        sc.close();

        if(str1.isBlank() || str1.trim().isEmpty() || str2.isBlank() || str2.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("The %s is permutation of %s (sort): %b%n", str1, str2, isPermutationUsingSort(str1, str2));
            System.out.printf("The %s is permutation of %s (array): %b%n", str1, str2, isPermutationUsingArray(str1, str2));
            System.out.printf("The %s is permutation of %s (sb): %b%n", str1, str2, isPermutationUsingSB(str1, str2));
        }
    }
}
