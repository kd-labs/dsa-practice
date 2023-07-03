package practice_july_2023;

import java.util.Arrays;

public class SudokuSolver {

    private boolean solved = false;
    public void solveSudoku(char[][] board) {

        solveSudoku(board, 0, 0);
        System.out.println(Arrays.deepToString(board));
    }

    public void solveSudoku(char[][] board, int currRow, int currCol) {


        // if currCol is at board[0].length, then reset the currCol = 0 and go the next row
        if(currCol == board[0].length) {
            currCol = 0; currRow++;
        }

        // base case : positive
        if (currRow == board.length) {
            solved = true;
            return;
        }

        // if curr cell is a #, then move to next cell by making recursive call for currCol+1
        if(board[currRow][currCol] != '.') {
            solveSudoku(board, currRow, currCol+1);
        } else {
            // if curr cell is a '.', then solve the cell by looping thru 1-9 and  finding the valid #
            for(char ch = '1' ; ch <= '9' ; ch++) {
                // check if placing 'ch' in currCell is valid
                if(isValid(board, currRow, currCol, ch)) {
                    board[currRow][currCol] = ch;

                    solveSudoku(board, currRow, currCol+1);

                    if (solved) return;

                    board[currRow][currCol] = '.';
                }
            }
        }
    }

    private void deepCopy(char[][] board, char[][] solvedSudoku) {
        for(int i = 0 ; i < board.length ; i++) {
            for(int k = 0 ; k < board[i].length ; k++) {
                solvedSudoku[i][k] = board[i][k];
            }
        }
    }

    public boolean isValid(char[][] board, int currRow, int currCol, int k) {

        // check in curr row
        for(int i = 0 ; i < 9 ; i++) {
            if(board[currRow][i] == k) return false;
        }

        // check in curr col
        for(int i = 0 ; i < 9 ; i++) {
            if(board[i][currCol] == k) return false;
        }

        // check in curr 3x3 block

        int blockRow = (currRow/3) * 3;
        int blockCol = (currCol/3) * 3;
        for(int r = 0 ; r < 3 ; r++) {
            for(int c = 0; c < 3 ; c++) {
                if(board[blockRow+r][blockCol+c] == k) return false;
            }
        }

        return true;
    }
}
