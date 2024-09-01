package com.aruntech._04_conditional_loop;

/**
 * for loop contains another for loop is called nested for loop
 */
public class _04_NestedForLoop {
    public static void main(String[] args) {
        System.out.println("Nested For Loop");

        // mostly used for 2D Matrix
        System.out.println("Print 3x4 Matrix");
        for(int i=1; i <=3; i++) {
            for(int j=1; j<=4; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Print 3x4 Matrix Addition");
        for(int i=1; i <=3; i++) {
            for(int j=4; j>0; j--) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // mostly used for 3D Matrix
        System.out.println("Print 3x4x3 Matrix");
        for(int i=1; i <=3; i++) {
            for(int j=1; j<=4; j++) {
                for(int k=1; k<=3; k++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Print 3x4x3 Matrix Addition");
        for(int i=1; i <=3; i++) {
            for(int j=1; j<=4; j++) {
                for(int k=1; k<=3; k++) {
                    System.out.print(i+j+k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
