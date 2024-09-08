package com.aruntech._99_programs._07_string;

import java.util.Scanner;

/**
 * program to find the words in a sentence
 * we can split the sentence by space to find the word count
 * e.g: str=hello how are you? then 4
 */
public class WordCountInString {
    private static int getWordCount(String str) {
        int count = 1;
        for(char c:str.toCharArray()) {
            if(c == ' ') {
                count++;
            }
        }
        return count;
    }

    private static int getWordCountUsingArray(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println("Word Count in String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();

        if(str.isBlank() || str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("The %s word count: %d%n", str, getWordCount(str));
            System.out.printf("The %s word count(array): %d%n", str, getWordCountUsingArray(str));
        }
    }
}
