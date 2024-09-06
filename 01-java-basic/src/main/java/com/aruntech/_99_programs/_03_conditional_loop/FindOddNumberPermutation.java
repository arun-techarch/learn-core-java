package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find the odd number permutation of given digits
 * permutation by using shift the 1st digit to the last digit
 * odd numbers are 1, 3, 5, 7, 9 if it is >10 then start from 1.
 * e.g: n=4 then permutations are 1357 3571 5713 7135
 *      n=6 then permutations are 135791 357911 579113 791135 911357 113579
 */
public class FindOddNumberPermutation {
    public static int getOddNumber(int n) {
        String str = "";
        int i = 1;
        int count = 1;
        while(count <= n) {
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

    public static void findPermutationOfOddNumber(int n) {
        int num = getOddNumber(n);
        System.out.println(num);
        int i = 1;
        while(i < n) {
            //take the left number
            int left_no = num/(int)(Math.pow(10, n-1));
            //remove the first digit
            num = num % (int)(Math.pow(10, n-1));
            //append the left_no to the right
            num = (num * (int)(Math.pow(10, 1)))+left_no;
            System.out.println(num);
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Find Odd Number Permutation");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        sc.close();

        findPermutationOfOddNumber(n);
    }
}
