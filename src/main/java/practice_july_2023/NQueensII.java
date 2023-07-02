package practice_july_2023;

import java.util.Arrays;

public class NQueensII {

    private int configCount;
    public int solveNQueens(int n) {

        // prepare the data
        String[][] board = new String[n][n];

        for (int i = 0 ; i < n ; i++) {
            Arrays.fill(board[i], ".");
        }

        nQueenConfig(board, n, 0);

        return configCount;

    }

    public void nQueenConfig(String[][] board, int n, int row) {

        // Base Case : Positive
        if(row == n) {
            this.configCount++;
            return;
        }

        // Recursive Case
        for(int i = 0; i < n ; i++) {

            // check if it is safe to place the queen by passing the current cell in this iteration
            if(isQueenSafe(board, row, n, i)) {
                // mark the position of the queen in the cell and move to next row
                board[row][i] = "Q";
                nQueenConfig(board, n, row+1);
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
}
