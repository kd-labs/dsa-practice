package track.search.binary.adityaverma;

import javafx.util.Pair;
import track.search.binary.searchonanswer.adityaverma.PeakElement;

public class SearchInSortedMatrix {

    public static void main(String[] args) {

        int[][] matrix = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        int target = 29;

        Pair<Integer, Integer> res = searchInSortedMatrix(matrix, target);

        System.out.printf("Target %d is present at index (%d, %d).\n", target, res.getKey(), res.getValue());

    }

    private static Pair<Integer, Integer> searchInSortedMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length-1;

        Pair<Integer, Integer> res;

        while(i < matrix.length && j > 0) {

            if(matrix[i][j] == target) {
                return new Pair<>(i, j);
            } else if(target < matrix[i][j]) j--;
            else i++;
        }
        return null;
    }
}
