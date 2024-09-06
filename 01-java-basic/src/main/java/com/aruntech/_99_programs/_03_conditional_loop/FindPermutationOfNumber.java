package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find the permutation of given number
 * permutation like shift first digit to the last
 * e.g: n=52134, no.of p=4 then 52134 21345 13452 34521
 */
public class FindPermutationOfNumber {

    public static void findPermutationOfNumber(int num, int times) {
        int i = 0, digits = 0, temp = num;
        while(temp > 0) {
            digits++;
            temp /= 10;
        }

        System.out.println(num);
        while(i < times-1) {
            //take the left number
            int left_no = num/(int)(Math.pow(10, digits-1));
            //remove the first digit
            num = num % (int)(Math.pow(10, digits-1));
            //append the left_no to the right
            num = (num * (int)(Math.pow(10, 1)))+left_no;
            System.out.println(num);
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Find Permutation of Number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter no.of permutation: ");
        int times = sc.nextInt();
        sc.close();

        findPermutationOfNumber(num, times);
    }
}
