package com.aruntech._04_conditional_loop;

/**
 * basic syntax:
 * for (initialization; condition; increment/decrement) {
 *     // code to be executed
 * }
 *
 * for loop execution flow
 *   - initialization block will be executed first and only once. it can be more than one.
 *   - condition block will be executed for each iteration. if condition fails
 *     then come out of the loop. only one condition block else throw error
 *   - update block(increment or decrement the value of variable) will be executed
 *     for each iteration after statement was executed. It can be more than one.
 * e.g: for(int i=0, j=0, k=0; i>10; i++, j++, k++) is valid
 *      for(;;;); is valid but cautious of infinite loop
 *      for(inti=10, j=10;i<20;i++,j--) is valid
 */
public class _02_ForLoop {
    public static void main(String[] args) {
        System.out.println("For Loop:");

        // empty initialization
        int i = 1;
        /*
        iteration 1: i=1, check 1 <= 5 print 1, i=2 (i++)
        iteration 2: i=2, check 2 <= 5 print 2, i=3 (i++)
        iteration 3: i=3, check 3 <= 5 print 3, i=4 (i++)
        iteration 4: i=4, check 4 <= 5 print 4, i=5 (i++)
        iteration 5: i=5, check 5 <= 5 print 5, i=6 (i++)
        iteration 6: i=6, check 6 <= 5 fails so exit from the loop
         */
        for(; i<= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // classic or typical for loop
        for(int j=5; j>0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        // increment specific int value
        for(int m=5; m<=25; m=m+5) {
            System.out.print(m + " ");
        }
        System.out.println();

        // using two initialization and update block
        for(int p=1, q=10; p<=10; p=p+2, q=q-2) {
            System.out.print(p + "-" + q + " ");
        }

        // empty for loop(it won't stop)
//        for(;;) {
//            System.out.println("Hello!!");
//        }

    }
}
