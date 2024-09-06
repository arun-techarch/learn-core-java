package com.aruntech._99_programs._05_matrix;

import java.util.Scanner;

/**
 * program to transpose the matrix values
 * e.g: row=3, column=3 and matrix is  4 6 1  then  1 5 8
 *                                     2 4 5        6 4 6
 *                                     3 6 8        4 2 3
 */
public class Matrix90DegreeRotate {
    private static void transposeMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=i; j<matrix[0].length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    private static void rotateWith90Degree(int[][] matrix) {
        transposeMatrix(matrix);

        for(int i=0; i<matrix[0].length; i++) {
            for(int j=0, k=matrix[0].length-1; j<k; j++, k--) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[k][i];
                matrix[k][i] = temp;
            }
        }
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
        System.out.println("Matrix Rotate to 90 Degree");
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
            rotateWith90Degree(matrix);
            System.out.println("After 90 Degree Rotate:");
            printMatrix(matrix);
        }
    }
}
