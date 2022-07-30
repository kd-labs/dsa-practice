package codingblocks.recursion.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class NQueens {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for(int i = 0 ; i < board.length ; i++) {
            Arrays.fill(board[i], '.');
        }

        nQueens(board, 0, n);

    }

    private static void nQueens(char[][] board, int rowNum, int n) {

        // Base Condition
        if(n == 0) {
            // print board config
            printBoard(board);
            return;
        }

        // Looping over columns
        for(int i = 0 ; i < board.length ; i++) {
           if(isSafe(board, rowNum, i)) {

               board[rowNum][i] = 'Q';
               nQueens(board, rowNum+1, n-1);

               // Backtracking undo
               board[rowNum][i] = '.';
           }
        }

    }

    private static boolean isSafe(char[][] board, int rowNum, int col) {

        // check in vertical column if queen is present in upper rows
        int r = rowNum;
        int c = col;
        while(r >= 0) {
            if(board[r][c] == 'Q') return false;
            r--;
        }

        // check in right diagonal if queen is present in upper right diagonal
        r = rowNum;
        c = col;
        while(r >= 0 && c < board.length) {
            if(board[r][c] == 'Q') return false;
            r--;
            c++;
        }

        // check in left diagonal if queen is present in upper left diagonal
        r = rowNum;
        c = col;
        while(r >= 0 && c >= 0) {
            if(board[r][c] == 'Q') return false;
            r--;
            c--;
        }

        return true;
    }

    private static void printBoard(char[][] board) {
        for(int i = 0 ; i < board.length ; i++) {
            for(int k = 0 ; k < board[0].length ; k++) {
                System.out.print(Character.valueOf(board[i][k]) + "\t");
            }
            System.out.println();
        }
        System.out.println("***************************************************");
    }
}
