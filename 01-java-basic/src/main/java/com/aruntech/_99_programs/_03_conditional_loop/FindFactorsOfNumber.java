package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find the factors of a number
 * e.g: 6 which is  divisible by 2 and 3
 */
public class FindFactorsOfNumber {
    static void findFactors(int num) {
        int div = 2;
        while(div < num) {
            if(num % div == 0) {
                System.out.print(div+" ");
            }
            div += 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        if(num <=0) {
            System.out.println("Invalid input!!");
        } else {
            findFactors(num);
        }
    }
}
