package com.aruntech._99_programs._05_matrix;

import java.util.Scanner;

/**
 * program to print the matrix from right to left
 * e.g: row=3, column=3 and matrix is  4 2 5   then  5 2 4
 *                                     6 8 5         5 8 6
 *                                     2 3 4         4 3 2
 */
public class PrintMatrixRightToLeft {
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

    private static void printMatrixRightToLeft(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Print Matrix Right to Left");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix row: ");
        int rows = sc.nextInt();
        System.out.print("Enter matrix column: ");
        int cols = sc.nextInt();

        if(rows <= 0 || cols <= 0) {
            System.out.println("Invalid input!!");
        } else {
            // getting value of a matrix
            int[][] matrix = new int[rows][cols];
            for(int i=0; i<rows;i++) {
                for(int j=0; j<cols; j++) {
                    System.out.printf("Enter matrix[%d][%d]: ", i, j);
                    matrix[i][j] = sc.nextInt();
                }
            }
            sc.close();

            System.out.println("Print Matrix:");
            printMatrix(matrix);
            System.out.println("Print Matrix Right to Left:");
            printMatrixRightToLeft(matrix);
        }
    }
}
