package com.aruntech._99_programs._05_matrix;

import java.util.Scanner;

/**
 * program to sum all the values in a diagonal matrix
 * e.g: row=3, col=3, and it's value 2 0 0 = 2+4+8 = 14
 *                                   0 4 0
 *                                   0 0 8
 */
public class SumOfDiagonalMatrix {

    private static int sumOfDiagonalMatrix(int[][] matrix) {
        int sum = 0, rows = matrix.length, cols = matrix[0].length;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(i == j) {
                    sum += matrix[i][i];
                }
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
        System.out.println("Sum of Diagonal Matrix Values");
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
            System.out.println("Sum of Diagonal Matrix: " + sumOfDiagonalMatrix(matrix));
        }
    }
}
