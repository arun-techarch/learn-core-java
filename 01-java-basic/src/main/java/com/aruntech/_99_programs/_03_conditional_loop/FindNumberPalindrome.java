package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find the number is palindrome
 * palindrome means the given number, and it's reverse is same
 * e.g: n=12321 then palindrome otherwise n=12345 is not palindrome
 */
public class FindNumberPalindrome {

    private static boolean isPalindrome(int num) {
        int rev=0, rem, temp = num;

        while(temp > 0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }

        return num == rev;
    }

    public static void main(String[] args) {
        System.out.println("Find Number Palindrome");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        if(num <= 0) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("%d is palindrome: %b", num, isPalindrome(num));
        }
    }
}
