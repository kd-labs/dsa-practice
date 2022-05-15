package leetcode;

public class SearchIn2D {

    public static void main(String[] args) {

        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        int target = 5;
        int target = 20;

        System.out.println(searchIn2D(matrix, target) ? true : false);

    }

    /*
        Hints : matrix is row-wise and column-wise sorted
        Idea : Binary Search in 2D Matrix
        Story :
            1. Start from the top-right element, i = 0, j = matrix[0].length-1
            2. If matrix[i][j] > target, then go left
                                                    meaning decrement j
            3. if matrix[i][j] < target, then go down
                                                    meaning increment i
            4. Repeat steps 2 and 3 until i < rowsMax or j < colsMin
     */
    private static boolean searchIn2D(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length-1;

        while(i < matrix.length && j >= 0) {

            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}
