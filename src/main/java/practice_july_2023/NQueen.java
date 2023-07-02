package practice_july_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {

    public List<List<String>> solveNQueens(int n) {

        // prepare the data
        String[][] board = new String[n][n];

        for (int i = 0 ; i < n ; i++) {
            Arrays.fill(board[i], ".");
        }

        List<List<String>> nQueenConfig = new ArrayList<>();
        nQueenConfig(board, n, 0, nQueenConfig);

        return nQueenConfig;
    }

    public void nQueenConfig(String[][] board, int n, int row, List<List<String>> nQueenConfig) {

        // Base Case : Negative
//        if(row < 0 || row >= n || col < 0 || col >= n) return;

        // Base Case : Positive
        if(row == n) {
            // copy the board config into nQueenConfig var
            copyBoard(board, nQueenConfig, n);
        }

        // Recursive Case
        for(int i = 0; i < n ; i++) {

            // check if it is safe to place the queen by passing the current cell in this iteration
            if(isQueenSafe(board, row, n, i)) {
                // mark the position of the queen in the cell and move to next row
                board[row][i] = "Q";
                nQueenConfig(board, n, row+1, nQueenConfig);
                board[row][i] = ".";
            }

        }
    }

    public boolean isQueenSafe(String[][] board, int row, int n, int currCol) {

        // check in left upper diagonal
        int x = row-1, y = currCol-1;
        while(x >= 0 && y >= 0) {
            if(board[x][y].equalsIgnoreCase("Q")) {
                return false;
            }
            x--;y--;
        }

        // check in same col above curr row
        x = row-1;
        y = currCol;
        while(x >= 0) {
            if(board[x][y].equalsIgnoreCase("Q")) {
                return false;
            }
            x--;
        }

        // check in right upper diagonal
        x = row-1; y = currCol+1;
        while(x >= 0 && y < n) {
            if(board[x][y].equalsIgnoreCase("Q")) {
                return false;
            }
            x--; y++;
        }

        return true;
    }

    public void copyBoard(String[][] board, List<List<String>> nQueenConfig, int boardSize) {
        List<String> boardConfig = new ArrayList<>();
        for(int i = 0 ; i < boardSize; i++) {
            boardConfig.add(String.join("", board[i]));
        }
        nQueenConfig.add(boardConfig);
    }
}
