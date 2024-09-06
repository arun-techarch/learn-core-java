package com.aruntech._99_programs._05_matrix;

import java.util.Scanner;

/**
 * program to add two matrix values, the same index value should be added.
 * if the two matrix has different rows and cols then it shouldn't perform the operation.
 * i.e. both matrix rows and column size should be matched.
 * e.g: row=3, col=3 then addition should be like below
 *   9 5 5     3 3 1      9+3 5+3 5+1    12  8  6
 *   6 3 4  +  8 0 8   =  6+8 3+0 4+8  = 14  3  12
 *   2 7 1     9 2 8      2+9 7+2 1+8    11  9  9
 */
public class MatrixAddition {

    private static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = (int) (Math.random()*10);
            }
        }
        return matrix;
    }

    private static int[][] add(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
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
        System.out.println("Matrix Addition");
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

            int[][] matrixSum = add(matrix1, matrix2);
            System.out.println("Matrix Addition:");
            printMatrix(matrixSum);
        }
    }
}
