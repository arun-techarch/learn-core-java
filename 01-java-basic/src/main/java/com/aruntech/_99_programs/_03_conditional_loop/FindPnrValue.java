package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find Pnr value
 * e.g: Pnr = n!/(n-r)!
 *    n:5, r:3 then 5!/(5-3)! = 5!/2! = 120/2 = 60
 */
public class FindPnrValue {
    private static int fact(int num) {
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        r = sc.nextInt();
        sc.close();

        System.out.println("PNR: " + (fact(n)/fact(n-r)));
    }
}
