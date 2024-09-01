package com.aruntech._04_conditional_loop;

/**
 * conditional loops are programming constructs that allow you to repeatedly
 * execute a block of code as long as a specified condition remains true
 *   - for loop
 *   - while loop
 *   - do while loop
 *
 *  use a for loop when you are sure how many iterations you want
 *  use while loops if you are unsure how many iterations are required
 *  use a do-while loop if you always want to execute the block and only
 *  then check if another iteration is needed.
 *
 *  use continue or break statement depends upon the need
 */
public class _01_ConditionalLoop {
    public static void main(String[] args) {
        // basic for loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }
        System.out.println();

        // basic while loop
        System.out.println("While Loop:");
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }
        System.out.println();

        //basic do-while loop
        System.out.println("Do-While Loop:");
        int num = 5;
        do {
            System.out.println("Number: " + num);
            num--;
        } while (num > 0);
    }
}
