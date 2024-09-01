package com.aruntech._04_conditional_loop;

/**
 * we can branch for loop using break and continue
 */
public class _03_ForLoopWithBranch {
    public static void main(String[] args) {
        // without conditional statement
        // break will stop iteration and exit from the inner loop
        for(int i=1;;i++) {
            if(i == 10)
                break;
            System.out.print(i + " ");
        }
        System.out.println();

        // continue will stop the execution then go back to next iteration
        // for even numbers skip the execution using continue
        // so, it will print only odd numbers
        for(int i=1; i<=10; i++) {
            if(i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // for odd numbers skip the execution using continue
        // so, it will print only even numbers
        for(int i=1; i<=10; i++) {
            if(i % 2 == 1)
                continue;
            System.out.print(i + " ");
        }
    }
}
