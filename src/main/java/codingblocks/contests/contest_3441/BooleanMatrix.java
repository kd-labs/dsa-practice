package codingblocks.contests.contest_3441;

import java.util.Scanner;

public class BooleanMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // modify row and column of matrix of cell = 1
        modifyMatrix(matrix);

        // print matrix
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void modifyMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowFlagSet = false, firstColFlagSet = false;

        // check if first row contains 1
        for(int col = 0 ; col < cols ; col++ ) {
            if(matrix[0][col] == 1) {
                firstRowFlagSet = true;
                break;
            }
        }

        // check if first column contains 1
        for(int row = 0 ; row < rows ; row++) {
            if(matrix[row][0] == 1) {
                firstColFlagSet = true;
                break;
            }
        }

        // Iterate from row = 1 and col = 1 and check if cell == 1
        // If true, then mark corresponding cell of first row and first col = 1
        for(int row = 1 ; row < rows ; row++) {
            for (int col = 1 ; col < cols ; col++) {
                if(matrix[row][col] == 1) {
                    matrix[0][col] = 1;
                    matrix[row][0] = 1;
                }
            }
        }

        // Iterate from row = 1 and col = 1 and check correspoding cell in first row and first col = 1
        // If true, then set matrix cell = 1;
        for(int row = 1 ; row < rows ; row++) {
            for(int col = 1 ; col < cols ; col++) {
                if(matrix[row][0] == 1 && matrix[0][col] == 1) {
                    matrix[row][col] = 1;
                }
            }
        }

        // set first row to 1 if firstRowFlag is true
        if(firstRowFlagSet) {
            for(int col = 0 ; col < cols ; col++) {
                matrix[0][col] = 1;
            }
        }

        // set first column to 1 if firstColumnFlag is true
        if(firstColFlagSet) {
            for(int row = 0 ; row < rows ; row++) {
                matrix[row][0] = 1;
            }
        }
    }


}
