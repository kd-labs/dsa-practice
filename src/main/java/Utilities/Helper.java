package Utilities;

public class Helper {

    public static void printMatrix(int[][] matrix) {
        int matrixSize = matrix.length;
        for(int i = 0 ; i < matrixSize ; i++) {
            for(int j = 0 ; j < matrixSize ; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
