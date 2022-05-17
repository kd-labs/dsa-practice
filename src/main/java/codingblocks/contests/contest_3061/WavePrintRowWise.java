package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class WavePrintRowWise {

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

        rowWiseWavePrint(matrix);
    }

    private static void rowWiseWavePrint(int[][] matrix) {
        for(int i = 0 ; i < matrix.length ; i++) {
            if((i & 1) == 0) {
                for(int j = 0 ; j < matrix[i].length ; j++) {
                    System.out.print(matrix[i][j] + ", ");
                }
            } else {
                for(int j = matrix[i].length-1 ; j >= 0; j--) {
                    System.out.print(matrix[i][j] + ", ");
                }
            }
        }
        System.out.println("END");
    }
}
