package com.aruntech._99_programs._05_matrix;

import java.util.Scanner;

/**
 * program to multiply two matrix values, then it's rows length should match
 * with column length of other matrix else it shouldn't perform the operation.
 * i.e. same rows and column matrix also 4x3 and 3x4 or 3x4 or 4x3 also fine
 * e.g: row=3, col=3 then addition should be like below
 *  3 8 9     7 4 9    (3*7)+(8*0)+(9*4) (3*4)+(8*3)+(9*2) (3*9)+(8*3)+(9*2)    21+0+36  12+24+18 27+24+18     57 54 69
 *  8 7 3  *  0 3 3 =  (8*7)+(7*0)+(3*4) (8*4)+(7*3)+(3*2) (8*9)+(7*3)+(3*2) =  56+0+12  32+21+6  72+21+6   =  68 59 99
 *  4 6 7     4 2 2    (4*7)+(6*0)+(7*4) (4*4)+(6*3)+(7*2) (4*9)+(6*3)+(7*2)    28+0+28  16+18+14 36+18+14     56 48 68
 */
public class MatrixMultiplication {
    private static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = (int) (Math.random()*10);
            }
        }
        return matrix;
    }

    private static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            System.out.println("Cannot multiply matrices.");
            return null;
        }

        int[][] result = new int[rows1][cols2];
        for(int i=0; i<rows1; i++) {
            for(int j=0; j<cols2; j++) {
                for(int k=0; k<cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
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

            int[][] matrixMultiply = multiply(matrix1, matrix2);
            System.out.println("Matrix Multiplication:");
            printMatrix(matrixMultiply);
        }
    }
}
