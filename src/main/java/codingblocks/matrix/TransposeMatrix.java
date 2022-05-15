package codingblocks.matrix;

import Utilities.Helper;

import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {

        /*
            Build the square matrix
         */
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];

        for(int i = 0 ; i < matrixSize ; i++) {
            for(int j = 0 ; j < matrixSize ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        /*
            Transpose the matrix in-place
         */

        transpose(matrix);
        Helper.printMatrix(matrix);
    }

    private static void transpose(int[][] matrix) {
        int matrixSize = matrix.length;

        for(int i = 0 ; i < matrixSize ; i++) {
            for(int j = i+1 ; j < matrixSize ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
