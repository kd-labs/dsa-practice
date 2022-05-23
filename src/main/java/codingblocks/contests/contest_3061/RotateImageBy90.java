package codingblocks.contests.contest_3061;

import Utilities.Helper;

import java.util.Scanner;

import static Utilities.Helper.swap;

public class RotateImageBy90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];

        for(int i = 0 ; i < matrixSize ; i++) {
            for(int j = 0 ; j < matrixSize; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotateArray(matrix);
        Helper.printMatrix(matrix);
    }

    private static void rotateArray(int[][] matrix) {
        /**
         * 1. Reverse each row
         */

        for(int i = 0 ; i < matrix.length ; i++) {
            reverse1DArray(matrix[i]);
        }

        /**
         *  2. Transpose the whole matrix
         */

        for(int i = 0 ; i < matrix.length; i++) {
            for(int j = i+1 ; j < matrix[i].length ; j++) {
                swap(matrix, i, j);
            }
        }

    }

    private static void reverse1DArray(int[] matrix) {
        int start = 0, end = matrix.length-1;
        while(start < end) {

            int temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;

            start++;
            end--;

        }

    }
}