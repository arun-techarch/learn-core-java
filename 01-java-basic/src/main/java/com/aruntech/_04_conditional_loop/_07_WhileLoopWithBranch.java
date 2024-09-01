package com.aruntech._04_conditional_loop;
/**
 * we can branch while loop using break and continue
 */
public class _07_WhileLoopWithBranch {
    public static void main(String[] args) {
        System.out.println("While Loop with Branch:");

        // break will stop iteration and exit from the inner loop
        int i = 1;
        while(true) {
            if(i == 10)
                break;
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // continue will stop the execution then go back to next iteration
        // for even numbers skip the execution using continue
        // so, it will print only odd numbers
        i = 0;
        while(i<10) {
            i++;
            if(i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // for odd numbers skip the execution using continue
        // so, it will print only even numbers
        i = 0;
        while(i<10) {
            i++;
            if(i % 2 == 1)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
