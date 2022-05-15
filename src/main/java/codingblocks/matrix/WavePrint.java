package codingblocks.matrix;

public class WavePrint {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100},
                {2,4,6,8,10},
                {3,5,7,9,11}
        };

        wavePrint(arr);
    }

    private static void wavePrint(int[][] arr) {

        int rows = arr.length, cols = arr[0].length;

        for(int col = 0 ; col < cols ; col++ ) {
            if((col & 1) == 0) {
                // col is even, start row from 0 and increment
                for(int row = 0 ; row < rows ; row++) {
                    System.out.print(arr[row][col]+ " ");
                }
            } else {
                // col is odd, start row from rows-1 and decrement
                for(int row = rows-1; row >= 0 ; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}
