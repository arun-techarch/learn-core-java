package com.aruntech._04_conditional_loop;

/**
 * syntax:
 * do {
 *     // code to be executed at least once
 * } while (condition);
 *
 * control the variable correctly else infinite loop will happen
 */
public class _08_DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Do-While Loop:");

        /*
        iteration 1: i=1, check 1 <= 5 print 1, i=2 (i++)
        iteration 2: i=2, check 2 <= 5 print 2, i=3 (i++)
        iteration 3: i=3, check 3 <= 5 print 3, i=4 (i++)
        iteration 4: i=4, check 4 <= 5 print 4, i=5 (i++)
        iteration 5: i=5, check 5 <= 5 print 5, i=6 (i++)
        iteration 6: i=6, check 6 <= 5 fails so exit from the loop
         */
        int i = 1;
        do {
            System.out.print(i + " ");
            i++; // if this statement was missing which will fall infinite loop
        } while(i<= 5);
        System.out.println();

        // print reverse order
        int j = 5;
         do {
            System.out.print(j + " ");
            j--;
        } while(j>= 1);
        System.out.println();

        // increment specific int value
        int m = 5;
        do {
            System.out.print(m + " ");
            m += 5;
        } while(m <=25);
        System.out.println();

        // infinite do-while loop
//        do {
//            System.out.println("Hello!");
//        } while(true);

    }
}
