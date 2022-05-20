package codingblocks.contests.contest_3061;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalTraversal2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        List<List<Integer>> diagonal = getDiagonals(matrix);

        /*
            if the inner list is odd then print in order
            if the inner list is even then print in reverse
         */

        for (int j = 0; j < diagonal.size(); j++) {
            List<Integer> integers = diagonal.get(j);
            if(j % 2 == 0) {
                // print the list in order
                for (int i = 0; i < integers.size(); i++) {
                    System.out.print(integers.get(i) + " ");
                }
            } else {
                // print the list in reverse
                for(int i = integers.size()-1; i >= 0 ; i--) {
                    System.out.print(integers.get(i) + " ");
                }
            }
        }
    }

    private static List<List<Integer>> getDiagonals(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();
        for(int row = 0 ; row < matrix.length ; row++) {
            int ro = row;
            int co = 0;
            List<Integer> diagonal = new ArrayList<>();
            while(ro >= 0 && co < matrix[row].length) {
                diagonal.add(matrix[ro][co]);
                ro--;
                co++;
            }
            res.add(diagonal);
        }

        for(int col = 1 ; col < matrix[matrix.length-1].length; col++) {
            int ro = matrix.length-1;
            int co = col;
            List<Integer> diagonal = new ArrayList<>();
            while(co < matrix[matrix.length-1].length && ro >= 0) {
                diagonal.add(matrix[ro][co]);
                co++;
                ro--;
            }
            res.add(diagonal);
        }
        return res;
    }
}
