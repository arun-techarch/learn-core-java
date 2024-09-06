package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program for arithmetic progression
 * e.g: 3n+2 when n=1 to 5 and skip 3n+2 divided by 4
 * we need to print values as (3*1)+2 = 5, (3*2)+2 = 8(ignore), (3*3)+2=11, (3*4)+2=14.....
 * which will print 5 11 14 17 23
 */
public class FindArithmeticProgression {
    public static void printArithmeticProgression(int n) {
        for(int i=1; i<=n; i++) {
            if((3*i+2)%4 == 0) {
                n++;
                continue;
            }
            System.out.print((3*i+2)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        sc.close();

        printArithmeticProgression(n);
    }
}
