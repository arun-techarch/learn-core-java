package com.aruntech._99_programs._05_matrix;

import java.util.Scanner;

/**
 * program to identify the given matrix is zero matrix.
 * if all the values in a matrix is 0 then true else false
 */
public class CheckZeroMatrix {

    private static boolean isZeroMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
               if(matrix[i][j] != 0) {
                   return false;
               }
            }
        }
        return true;
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
        System.out.println("Check Zero Matrix");
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
            System.out.println("Zero Matrix: " + isZeroMatrix(matrix));
        }
    }
}
