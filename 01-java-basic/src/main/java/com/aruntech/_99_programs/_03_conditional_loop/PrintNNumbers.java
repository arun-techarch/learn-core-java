package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Print numbers from 1 ... n
 * E.g: n=5 then output is 1,2,3,4,5
 */
public class PrintNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            if(i == n) {
                System.out.print(i);
            } else {
                System.out.print(i+",");
            }
        }
        sc.close();
    }
}
