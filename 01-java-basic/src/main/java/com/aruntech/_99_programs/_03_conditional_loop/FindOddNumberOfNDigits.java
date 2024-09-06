package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find the odd number of given digits
 * odd number are from 1, 3, 5, 7, 9 if number > 10 then start from 1...9
 * e.g: n=4 then 1357, n=5 then 13579, n=7 then 1357913
 */
public class FindOddNumberOfNDigits {
    public static int getOddNumber(int digits) {
        String str = "";
        int i = 1;
        int count = 1;
        while(count <= digits) {
            if(i%2 == 1) {
                str += i;
                count++;
            }
            i++;
            if(i > 10) {
                i = 1;
            }
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.println("Find Odd Number of N Digit");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int digits = sc.nextInt();
        sc.close();

        System.out.printf("Odd number of %d digits: %d", digits, getOddNumber(digits));
    }
}
