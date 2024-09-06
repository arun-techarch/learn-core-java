package com.aruntech._99_programs._05_matrix;

import java.util.Scanner;

/**
 * program to rotate the matrix i.e. column to rows and vice versa
 * e.g: row=3, column=3 and matrix is 2 4 1  then  2 7 2
 *                                    7 3 5        4 3 4
 *                                    2 4 1        1 5 1
 */
public class RotateMatrix {

    private static void rotateMatrix(int[][] matrix) {
        if(matrix.length == 0 || matrix.length != matrix[0].length)
            return;

        int n = matrix.length;
        for(int i=0; i<n/2; i++) {
            int last = n - 1 - i;
            for(int j = i; j<last; j++) {
                int offset = j- i;
                int top = matrix[i][j];
                matrix[i][j] = matrix[last-offset][i];
                matrix[last-offset][i] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[j][last];
                matrix[j][last] = top;
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
        System.out.println("Rotate the Matrix");
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
            rotateMatrix(matrix);
            System.out.println("Rotate Matrix:");
            printMatrix(matrix);
        }
    }

}
