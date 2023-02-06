package codingblocks.recursion.backtracking;

public class RatChasesCheese {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] board = new String[rows][cols];

        for(int row = 0 ; row < rows ; row++) {
            String rowData = scanner.next();
            String[] split = rowData.split("");
            for(int col = 0 ; col < cols ; col++) {
                board[row][col] = split[col];
            }
        }

        if(!ratChase(board, 0, 0)) {
            System.out.println("NO PATH FOUND");
        }
    }

    private static boolean ratChase(String[][] board, int row, int col) {

        // Base Case
        // when board[row][col] is outside board or board[row][col] is already visited i.e. == 1 or board[row][col] is at cell with 'X'
        // then return false;
        if(row < 0 || row >= board.length || col < 0 || col >= board[row].length || board[row][col].equalsIgnoreCase("1") || board[row][col].equalsIgnoreCase("X")) {
            return false;
        }

        // Base Case : Positive
        if(row == board.length-1 && col == board[row].length-1) {
            board[row][col] = "1";
            printBoard(board);
            board[row][col] = "0";
            return true;
        }

        // Otherwise we are currently at a cell which is within board and not blocked and not 1
        // then mark the cell as 1

        board[row][col] = "1";

        boolean flag = false;

        // Now move up, down, left, right from the current position by making the respective recursive calls for each movement

        // Up movement
        flag = flag || ratChase(board, row-1, col);

        // Down movement
        flag = flag || ratChase(board, row+1, col);

        // Left movemenet
        flag = flag || ratChase(board, row, col-1);

        // Right movement
        flag = flag || ratChase(board, row, col+1);

        // BackTrack to undo the setting of one
        board[row][col] = "0";

        return flag;
    }

    private static void printBoard(String[][] board) {

        for(int i = 0 ; i < board.length ; i++) {
            for(int k = 0 ; k < board[i].length ; k++) {
                System.out.print(board[i][k] + " ");
            }
            System.out.println();
        }
    }
}
