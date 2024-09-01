package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * Print numbers from n ... 1
 * E.g: n=5 then output is 5,4,3,2,1
 */
public class PrintReverseNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number:");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--) {
            if(i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i+",");
            }
        }
        sc.close();
    }
}
