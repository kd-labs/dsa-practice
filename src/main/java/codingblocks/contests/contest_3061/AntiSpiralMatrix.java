package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class AntiSpiralMatrix {

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

        antiSprintSpiralMatrix(matrix);
    }

    private static void antiSprintSpiralMatrix(int[][] matrix) {
        int firstRow = 0, lastRow = matrix.length-1;
        int firstCol = 0, lastCol = matrix[0].length-1;

        while(firstRow <= lastRow && firstCol <= lastCol) {

            // print left boundary
            for(int i = firstRow; i<= lastRow; i++) {
                System.out.print(matrix[i][firstCol] + ", ");
            }
            firstCol++;

            // print bottom boundary
            for(int i = firstCol ; i <= lastCol ; i++) {
                System.out.print(matrix[lastRow][i] + ", ");
            }
            lastRow--;

            // print right boundary
            if(firstRow <= lastRow) {
                for(int i = lastRow ; i >= firstRow ; i--) {
                    System.out.print(matrix[i][lastCol] + ", ");
                }
                lastCol--;
            }

            // print top boundary
            if(firstRow <= lastRow) {
                for(int i = lastCol ; i >= firstCol ; i--) {
                    System.out.print(matrix[firstRow][i] + ", ");
                }
                firstRow++;
            }
        }
        System.out.println("END");
    }

    private static void printSpiralMatrix(int[][] matrix) {
        int firstRow = 0, lastRow = matrix.length-1;
        int firstCol = 0, lastCol = matrix[0].length-1;

        while(firstRow <= lastRow && firstCol <= lastCol) {

            // print the top boundary
            for(int i = firstCol ; i <= lastCol ; i++) {
                System.out.print(matrix[firstRow][i] + ", ");
            }
            firstRow++;

            // print the right boundary
            for(int i = firstRow ; i <= lastRow ; i++) {
                System.out.print(matrix[i][lastCol] + ", ");
            }
            lastCol--;

            // print the bottom boundary
            if(firstRow <= lastRow) {
                for(int i = lastCol ; i >= firstCol ; i--) {
                    System.out.print(matrix[lastRow][i] + ", ");
                }
                lastRow--;
            }

            // print the left boundary
            if(firstCol <= lastCol) {
                for(int i = lastRow ; i >= firstRow ; i--) {
                    System.out.print(matrix[i][firstCol] + ", ");
                }
                firstCol++;
            }
        }
        System.out.println("END");
    }
}
