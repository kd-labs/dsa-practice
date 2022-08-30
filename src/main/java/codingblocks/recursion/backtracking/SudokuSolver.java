package codingblocks.recursion.backtracking;

public class SudokuSolver {

    public static void main(String[] args) {

        String[][] grid = {
                {"5", "3", "0", "0", "7", "0", "0", "0", "0"},
                {"6", "0", "0", "1", "9", "5", "0", "0", "0"},
                {"0", "9", "8", "0", "0", "0", "0", "6", "0"},
                {"8", "0", "0", "0", "6", "0", "0", "0", "3"},
                {"4", "0", "0", "8", "0", "3", "0", "0", "1"},
                {"7", "0", "0", "0", "2", "0", "0", "0", "6"},
                {"0", "6", "0", "0", "0", "0", "2", "8", "0"},
                {"0", "0", "0", "4", "1", "9", "0", "0", "5"},
                {"0", "0", "0", "0", "8", "0", "0", "7", "9"}
        };

        solveSudoku(grid, 0, 0);

    }

    private static void solveSudoku(String[][] grid, int row, int col) {

        // Base Case to switch to new row and reset col when col == last col
        if(col == grid.length) {
            row = row+1;
            col = 0;
        }
        if(row == grid.length) { // solved sudoku hence print the grid

            printGrid(grid);
            return;
        }

        if(!grid[row][col].equals("0")) {
            // move to the next col
            solveSudoku(grid, row, col+1);
        } else if(grid[row][col].equals("0")) { // solve for this cell with 9 possible recursion calls
            for(int i = 1 ; i <= grid.length ; i++) {

                if(isSafe(grid, row, col, i)) {
                    grid[row][col] = i+"";

                    // Recursive call
                    solveSudoku(grid, row, col+1);

                    // Backtracking undo
                    grid[row][col] = ".";
                }

            }

        }
    }

    private static boolean isSafe(String[][] grid, int row, int col, int val) {
        // check vertically
        for(int r = 0 ; r < grid.length ; r++) {
            if(Integer.parseInt(grid[r][col]) == val) return false;
        }

        // check horizontally
        for(int c = 0 ; c < grid.length ; c++) {
           if(Integer.parseInt(grid[row][c]) == val) return false;
        }

        // check in 3x3 box
        int r = row - (row % 3); // beginning row of 3x3 block
        int c = col - (col % 3); // beginning col of 3x3 block
        for(int ro = r ; ro < 3 ; ro++) {
            for(int co = c ; co < 3 ; co++) {
                if(Integer.parseInt(grid[ro][co]) == val) return false;
            }
        }

        return true;
    }

    private static void printGrid(String[][] grid) {
        for(int i = 0 ; i < grid.length ; i++) {
            for(int j = 0 ; j < grid[0].length ; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
