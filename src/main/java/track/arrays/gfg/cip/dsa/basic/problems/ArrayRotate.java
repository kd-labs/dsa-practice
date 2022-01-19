package track.arrays.gfg.cip.dsa.basic.problems;

public class ArrayRotate {

    private static void rotateArr(int arr[], int d, int n)
    {
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        rotateArr(arr1, 2, 5);
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d ", arr1[i]);
        }

        System.out.println();

        int arr2[] = {2,4,6,8,10,12,14,16,18,20};
        rotateArr(arr2, 3, 10);
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%d ", arr2[i]);
        }
    }
}
