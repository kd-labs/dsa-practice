package dsa_revision.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mazepath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] board = new int[rows][cols];

        List<String> paths = new ArrayList();
        mazepath(board, 0, 0, "", paths);

        for (String path : paths) {
            System.out.print(path + " ");
        }
        System.out.println();
        System.out.println(paths.size());
    }

    public static void mazepath(int[][] board, int row, int col, String moves, List<String> paths) {

        // Base Case : Positive when we reach bottom right corner
        if(row == board.length-1 && col == board[row].length-1) {
           paths.add(moves);
           return;
        }

        // Base Case : Negative
        // when we have moved outside the board
        if(row >= board.length || col >= board[row].length) {
            return;
        }

        // Mark the cell as visited
        board[row][col] = -1;

        // Recursive Case
        // vertical move
        mazepath(board, row+1, col, moves.concat("V"), paths);

        // horizontal move
        mazepath(board, row, col+1, moves.concat("H"), paths);

        // diagonal move
//        mazepath(board, row+1, col+1, moves.concat("D"), paths);

        // Backtrack to undo the operation
        board[row][col] = 0;
    }
}
