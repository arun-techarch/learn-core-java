package com.aruntech._04_conditional_loop;
/**
 * we can branch do-while loop using break and continue
 */
public class _09_DoWhileLoopWithBranch {
    public static void main(String[] args) {
        System.out.println("Do-While Loop with Branch:");

        // break will stop iteration and exit from the inner loop
        int i = 1;
        do {
            if(i == 10)
                break;
            System.out.print(i + " ");
            i++;
        } while(true);
        System.out.println();

        // continue will stop the execution then go back to next iteration
        // for even numbers skip the execution using continue
        // so, it will print only odd numbers
        i = 0;
        do {
            i++;
            if(i % 2 == 0)
                continue;
            System.out.print(i + " ");
        } while(i<10);
        System.out.println();

        // for odd numbers skip the execution using continue
        // so, it will print only even numbers
        i = 0;
        do {
            i++;
            if(i % 2 == 1)
                continue;
            System.out.print(i + " ");
        } while(i<10);
        System.out.println();
    }
}
