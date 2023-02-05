package dsa_revision.recursion;

import java.util.Scanner;

public class Mazepath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] board = new int[rows][cols];

        int paths = mazepath(board, 0, 0);

        System.out.println(paths);

    }

    public static int mazepath(int[][] board, int row, int col) {

        // Base Case : Positive when we reach bottom right corner
        if(row == board.length-1 && col == board[row].length-1) {
           return 1;
        }

        // Base Case : Negative
        // when we have moved outside the board
        if(row >= board.length || col >= board[row].length) {
            return 0;
        }

        // Mark the cell as visited
        board[row][col] = -1;

        // Recursive Case
        // vertical move
        int a = mazepath(board, row+1, col);

        // horizontal move
        int b = mazepath(board, row, col+1);

        // diagonal move
//        mazepath(board, row+1, col+1, moves.concat("D"), paths);

        // Backtrack to undo the operation
        board[row][col] = 0;

        return a+b;
    }
}
