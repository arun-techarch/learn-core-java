package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find the fibonacci of nth position
 * fibonacci series: F(1)=1, F(2)=1, F(3)=F(1)+F(2), ....
 * e.g: n=6 then F(n)=1, 1, 2, 3, 5, 8, 13, 21 it should print 8
 */
public class FindNthFibonacciNumber {
    public static void printNFibonacci(int n) {
        if(n == 1 || n == 2) {
            System.out.print("1");
            return;
        }
        int num1 = 1;
        int num2 = 1;
        int sum = 1;
        for(int i=3; i<=n; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        sc.close();

        printNFibonacci(n);
    }
}
