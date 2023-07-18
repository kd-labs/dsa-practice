package practice_july_2023;

public class WordSearch {

    public boolean exist(char[][] board, String word) {

        int rowLen = board.length;
        int colLen = board[0].length;

        boolean flag = false;

        for( int i = 0 ; i < rowLen && !flag ; i++) {
            for( int j = 0 ; j < colLen && !flag ; j++) {
                if(board[i][j] == word.charAt(0)) {

                    flag = exist(board, word, board.length, board[0].length, i, j);
                }
            }
        }

        return flag;
    }

    public boolean exist(char[][]board, String word, int rowSize, int colSize, int currRow, int currCol) {

        boolean flag = false;

        // Base Case
        if(word.length() == 0) return true;

        // Base Case : Negative
        if(currRow < 0 || currRow >= rowSize || currCol < 0 || currCol >= colSize || board[currRow][currCol] == '*' ) return false;

        if (board[currRow][currCol] != word.charAt(0)) return false;

        // mark the cell as visited with '*'
        board[currRow][currCol] = '*';

        // go up
        flag = flag || exist(board, word.substring(1), rowSize, colSize, currRow-1, currCol);
        // go down
        flag = flag || exist(board, word.substring(1), rowSize, colSize, currRow+1, currCol);
        // go left
        flag = flag || exist(board, word.substring(1), rowSize, colSize, currRow, currCol-1);
        // go right
        flag = flag || exist(board, word.substring(1), rowSize, colSize, currRow, currCol+1);

        // undo the changes made to the cell
        board[currRow][currCol] = word.charAt(0);

        return flag;
    }
}
