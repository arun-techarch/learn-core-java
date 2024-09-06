package com.aruntech._99_programs._05_matrix;

import java.util.Scanner;

/**
 * program to create the zero matrix
 * the all values in a matrix is 1 is called zero matrix
 * e.g: size=3 then  0 0 0
 *                   0 0 0
 *                   0 0 0
 */
public class CreateZeroMatrix {

    private static int[][] createZero(int size) {
        int[][] result = new int[size][size];
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                result[i][j] = 0;
            }
        }
        return result;
    }

    private static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Create Zero Matrix");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size = sc.nextInt();
        sc.close();

        if(size <= 0) {
            System.out.println("Invalid input!!");
        } else {
            int[][] zeroMatrix = createZero(size);
            System.out.println("Zero Matrix:");
            printMatrix(zeroMatrix);
        }
    }
}
