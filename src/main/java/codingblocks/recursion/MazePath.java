package codingblocks.recursion;

import java.util.Scanner;

public class MazePath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        move(0, 0, "", rows, cols);


    }

    private static void move(int row, int col, String path, int rows, int cols) {

        // Positive Base Case : print the path
        if(row == rows-1 && col == cols - 1) {
            System.out.println(path);
            return;
        }

        // Negative Base Base : Return from recursive call
        if(row >= rows || col >= cols) {
            return;
        }

        // Recursive Call to move horizontally
        move(row, col+1, path + "H", rows, cols);

        // Recursive Call to move vertically
        move(row+1, col, path + "V", rows, cols);
    }
}
