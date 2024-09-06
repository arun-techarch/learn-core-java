package com.aruntech._99_programs._05_matrix;

import java.util.Scanner;

/**
 * program to sum all the values in a matrix
 * e.g: row=3, col=3, and it's value 3 5 2 = 3+5+2+7+1+5+2+4+6 = 35
 *                                   7 1 5
 *                                   2 4 6
 */
public class SumOfMatrixValues {

    private static int sumOfMatrix(int[][] matrix) {
        int sum = 0, rows = matrix.length, cols = matrix[0].length;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
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
        System.out.println("Sum of Matrix Values");
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
            System.out.println("Sum of Matrix: " + sumOfMatrix(matrix));
        }
    }
}
