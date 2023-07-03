package practice_july_2023;

import java.util.Arrays;

public class SudokuSolver {

    private char[][] solvedSudoku;
    public void solveSudoku(char[][] board) {

        solvedSudoku = new char[board.length][board[0].length];
        solveSudoku(board, 0, 0);
        deepCopy(solvedSudoku, board);
        System.out.println(Arrays.deepToString(board));
    }

    public void solveSudoku(char[][] board, int currRow, int currCol) {

        // base case : positive
        if (currRow == board.length) {
            // print the board
//            System.out.println(Arrays.deepToString(board));
            deepCopy(board, solvedSudoku);
            return;
        }

        // if you encounter a pre-filled number, then move ahead to find the next '.'
        while(board[currRow][currCol] != '.') {
            currCol++;
            if(currCol == board[0].length) {
                currCol = 0; currRow++;
            }
            if(currRow == board.length) {
//                System.out.println(Arrays.deepToString(board));
                deepCopy(board, solvedSudoku);
                return;
            }
        }
        for(int k = 1 ; k < 10 ; k++) {
            // check if placing 'k' in currCell is valid
            char ch = Character.forDigit(k, 10);
            if(isValid(board, currRow, currCol, ch)) {
                board[currRow][currCol] = ch;

                // recursive call to next cell
                if(currCol == board[currRow].length-1) {
                    solveSudoku(board, currRow+1, 0);
                } else {
                    solveSudoku(board, currRow, currCol+1);
                }

                board[currRow][currCol] = '.';
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
