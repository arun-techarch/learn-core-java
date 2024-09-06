package com.aruntech._99_programs._05_matrix;

import java.util.Scanner;

/**
 * program to subtract two matrix values, the same index value should be added.
 * if the two matrix has different rows and cols then it shouldn't perform the operation.
 * i.e. both matrix rows and column size should be matched.
 * e.g: row=3, col=3 then addition should be like below
 *   1 0 9     3 1 9      1-3 0-1 9-9    -2 -1  0
 *   0 6 1  -  8 9 5   =  0-8 6-9 1-5  = -8 -3 -4
 *   0 9 1     9 9 7      0-9 9-9 1-7    -9  0 -6
 */
public class MatrixSubtraction {
    private static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = (int) (Math.random()*10);
            }
        }
        return matrix;
    }

    private static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
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
        System.out.println("Matrix Subtraction");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row value: ");
        int rows = sc.nextInt();
        System.out.print("Enter column value: ");
        int cols = sc.nextInt();
        sc.close();

        if(rows == 0 || cols == 0) {
            System.out.println("Invalid input!!");
        } else {
            int[][] matrix1 = createRandomMatrix(rows, cols);
            int[][] matrix2 = createRandomMatrix(rows, cols);
            System.out.println("Matrix 1:");
            printMatrix(matrix1);
            System.out.println("Matrix 2:");
            printMatrix(matrix2);

            int[][] matrixSubtract = subtract(matrix1, matrix2);
            System.out.println("Matrix Subtraction:");
            printMatrix(matrixSubtract);
        }
    }
}
