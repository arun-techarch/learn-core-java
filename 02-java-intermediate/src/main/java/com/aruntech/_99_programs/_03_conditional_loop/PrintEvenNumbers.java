package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Print Even numbers from 1 ... n
 * E.g: n=10 then output is 2,4,6,8,10
 */
public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
