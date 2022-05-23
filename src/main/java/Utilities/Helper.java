package Utilities;

public class Helper {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static void printMatrix(int[][] matrix) {
        int matrixSize = matrix.length;
        for(int i = 0 ; i < matrixSize ; i++) {
            for(int j = 0 ; j < matrixSize ; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static long factorial(int n) {

        if(n == 1 || n == 0) return 1;
        return n * factorial(n-1);
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    public static void reverse(int[] arr, int left, int right) {
        while(left < right) {
            Helper.swap(arr, left, right);
            left++;
            right--;
        }
    }
}
