package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find the even number of given digits
 * odd number are from 2, 4, 6, 8 if number >= 10 then start from 2...8
 * e.g: n=4 then 2468, n=5 then 24682, n=7 then 2468246
 */
public class FindEvenNumberOfNDigits {
    public static int getEvenNumber(int digits) {
        String str = "";
        int i = 1;
        int count = 1;
        while(count <= digits) {
            if(i%2 == 0) {
                str += i;
                count++;
            }
            i++;
            if(i >= 10) {
                i = 1;
            }
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.println("Find Even Number of N Digit");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int digits = sc.nextInt();
        sc.close();

        System.out.printf("Even number of %d digits: %d", digits, getEvenNumber(digits));
    }
}
