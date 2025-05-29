package com.basic;

public class MatrixOperation 
{

	public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] b = {
            {7, 8, 9},
            {1, 2, 3}
        };

        int rows = a.length;
        int cols = a[0].length;

        int[][] sum = new int[rows][cols];
        int[][] diff = new int[rows][cols];

        System.out.println("Matrix Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix Subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diff[i][j] = a[i][j] - b[i][j];
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
    }
}

