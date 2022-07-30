package codingblocks.recursion.backtracking;

public class WordSearch {

    public static void main(String[] args) {

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";

        boolean ans = false;
        for(int i = 0 ; i < board.length ; i++) {
            for(int j = 0 ; j < board[0].length ; j++) {
                if(word.charAt(0) == board[i][j]) {
                    ans = wordSearch(board, i, j, word, 0);
                    if(ans) {
                        System.out.println(ans);
                        break;
                    }
                }
            }
        }
        System.out.println(false);
    }

    private static boolean wordSearch(char[][] board, int i, int j, String word, int idx) {

        // Positive Base Case
        if(idx == word.length()) return true;

        // Boundary Base Case
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || word.charAt(idx) != board[i][j] // to check if character at word matches with character on board
        ) {
            return false;
        }

        board[i][j] = '*';

        // Direction Matrix
        int[] rowMovement = {-1, 1, 0, 0};
        int[] colMovement = {0, 0, -1, 1};

        for(int k = 0 ; k < rowMovement.length ; k++) {
            boolean ans = wordSearch(board, i + rowMovement[k], j + colMovement[k], word, idx + 1);
            if(ans) return true;
        }

        // Backtracking undo
        board[i][j] = word.charAt(idx);

        return false;

    }
}
