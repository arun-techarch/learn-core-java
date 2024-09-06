package com.aruntech._99_programs._05_matrix;

import java.util.Scanner;

/**
 * program to find fill the rows and column as zero if any of the index is 0
 * e.g: row=3, column=3 and matrix is  0 1 3  then  0 0 0
 *                                     6 3 0        0 0 0
 *                                     5 7 2        0 7 0
 */

public class FillColumnAndRowAsZero {

    private static void fillWithZero(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];

        //check the rows and columns
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        //check rows
        for(int i=0; i<rows.length; i++) {
            if(rows[i]) {
                for(int j=0; j<matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        //check columns
        for(int i=0; i<columns.length; i++) {
            if(columns[i]) {
                for(int j=0; j<matrix.length; j++) {
                    matrix[j][i] = 0;
                }
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
        System.out.println("Fill Column And Rows As Zero");
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
            fillWithZero(matrix);
            System.out.println("Fill With Zero Matrix:");
            printMatrix(matrix);
        }
    }
}
