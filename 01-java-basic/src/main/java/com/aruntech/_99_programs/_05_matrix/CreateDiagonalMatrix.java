package com.aruntech._99_programs._05_matrix;

import java.util.Scanner;

/**
 * program to create the diagonal matrix
 * the all values of a diagonal > 0 other values are 0
 * e.g: size=3, diagonal value=2 then  2 0 0
 *                                     0 2 0
 *                                     0 0 2
 */
public class CreateDiagonalMatrix {

    private static int[][] createDiagonal(int size, int value) {
        int[][] result = new int[size][size];
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                result[i][i] = value;
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
        System.out.println("Create Diagonal Matrix");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size = sc.nextInt();
        System.out.print("Enter diagonal value: ");
        int value = sc.nextInt();
        sc.close();

        if(size <= 0) {
            System.out.println("Invalid input!!");
        } else {
            int[][] diagonalMatrix = createDiagonal(size, value);
            System.out.println("Diagonal Matrix:");
            printMatrix(diagonalMatrix);
        }
    }
}
