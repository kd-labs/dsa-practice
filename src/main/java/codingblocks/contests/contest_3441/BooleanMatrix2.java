package codingblocks.contests.contest_3441;

import java.util.Scanner;

public class BooleanMatrix2 {

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
        convert(matrix);

        // print matrix
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void convert(int[][] mat)
    {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }

        // `M × N` matrix
        int M = mat.length;
        int N = mat[0].length;

        // traverse the matrix
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (mat[i][j] == 1)
                {
                    // change each non-zero element in row `i` and column `j` to -1
                    changeRowColumn(mat, M, N, i, j);
                }
            }
        }

        // traverse the matrix once again and replace cells having
        // value -1 with 0
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (mat[i][j] == -1) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    public static void changeRowColumn(int[][] mat, int M, int N, int x, int y)
    {
        for (int j = 0; j < N; j++)
        {
            if (mat[x][j] != 1) {
                mat[x][j] = -1;
            }
        }

        for (int i = 0; i < M; i++)
        {
            if (mat[i][y] != 1) {
                mat[i][y] = -1;
            }
        }
    }

}
