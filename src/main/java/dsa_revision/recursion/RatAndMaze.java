package dsa_revision.recursion;

import java.util.Scanner;

public class RatAndMaze {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        char[][] maze = new char[rows][cols];

        for(int row = 0 ; row < rows ; row++) {
            String line = scanner.next();
            for(int col = 0 ; col < cols ; col++) {
                maze[row][col] = line.charAt(col);
            }
        }

        mazeWalk(maze, 0, 0);
    }

    private static boolean mazeWalk(char[][] maze, int row, int col) {

        // Base Case : when rat reaches the bottom right corner cell
        if(row == maze.length-1 && col == maze[row].length-1) {
            maze[row][col] = '1';
            printMaze(maze);
            maze[row][col] = '0';
            return true;
        }

        // Base Case : Negative
        // when rat reaches a cell which is outside the maze or reaches a cell which is blocked or reaches a cell which is already visited
        if(row < 0 || row >=maze.length || col < 0 || col >= maze[row].length || maze[row][col] == 'X' || maze[row][col] == '1') {
            return false;
        }

        // mark the cell as visited
        maze[row][col] = '1';

        // Recursive Case
        int[] moveX = {1, 0}; // first priority is to move right
        int[] moveY = {0, 1}; // second priority is to move left

        for(int i = 0 ; i < moveX.length ; i++) {
            if(mazeWalk(maze, row + moveY[i], col + moveX[i])){
                return true;
            }
        }

        // unmark the cell
        maze[row][col] = 'O';

        return false;
    }

    private static void printMaze(char[][] maze) {
        for(int row = 0 ; row < maze.length ; row++) {
            for(int col = 0 ; col < maze[row].length ; col++) {
                if(maze[row][col] == 'O' || maze[row][col] == 'X') {
                    System.out.print('0' + " ");
                } else {
                    System.out.print(maze[row][col] + " ");
                }
            }
            System.out.println();
        }
//        System.out.println("*********************************************************");
    }
}
