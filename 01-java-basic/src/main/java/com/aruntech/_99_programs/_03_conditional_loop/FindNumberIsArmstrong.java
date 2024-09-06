package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find the number is armstrong
 * e.g: n=153, no.of digits=3 then 1^3+5^3+3^3=1+125+27 = 153 so it's armstrong
 *      n=125, no.of digits=3 then 1^3+2^3+5^3=1+8+125 = 134 so, it's not armstrong
 *      n=1634 no.of digits=4 then 1^4+6^4+3^4+4^4=1+1296+81+256 = 1634 so, it's armstrong
 */
public class FindNumberIsArmstrong {

    //find the power of n power m
    public static int power(int n, int m) {
        int result = 1;
        for(int i=0; i<m; i++) {
            result *= n;
        }
        return result;
    }

    public static void checkArmstrong(int num) {
        int orig = num, temp = num, sum=0, digit = 0, rem;

        // find the total no.of digits
        while(temp > 0) {
            digit++;
            temp /= 10;
        }

        while(num != 0){
            rem = num%10;
            sum = sum + power(rem, digit);
            num = num/10;
        }

        if(sum == orig) {
            System.out.printf("%d is Armstrong", orig);
        } else {
            System.out.printf("%d is not Armstrong", orig);
        }
    }

    public static void main(String[] args) {
        System.out.println("Find Number is Armstrong");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        if(num <= 0) {
            System.out.println("Invalid input!!");
        } else {
            checkArmstrong(num);
        }
    }
}
