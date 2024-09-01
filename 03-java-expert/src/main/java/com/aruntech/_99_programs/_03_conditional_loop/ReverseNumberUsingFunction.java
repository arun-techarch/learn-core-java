package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to reverse a number
 * using string: find the remainder and add to string concatenation then divide by 10
 * using int: find the reminder  added to existing reverse number multiply by 10
 * e.g: 675432 then print 234576
 */
public class ReverseNumberUsingFunction {

    public static int reverseUsingString(int num) {
        String reverseNum = "";
        while(num > 0) {
            reverseNum += num%10;
            num /= 10;
        }
        return Integer.parseInt(reverseNum);
    }

    public static int reverseUsingInt(int num) {
        int reverseNum = 0;
        while (num > 0) {
            int digit = num%10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        return reverseNum;
    }

    public static void main(String[] args) {
        System.out.println("Reverse a number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();

        if(num <= 0){
            System.out.println("Invalid number!!");
        } else if(num < 10) {
            System.out.printf("Reverse number of(%d) is:%d\n", num, num);
        } else {
            System.out.printf("Using String: Reverse number of(%d) is: %d\n", num, reverseUsingString(num));
            System.out.printf("Using Int: Reverse number of(%d) is: %d\n", num, reverseUsingInt(num));
        }
    }
}
