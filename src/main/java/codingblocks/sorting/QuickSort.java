package codingblocks.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {12, 3, 14, 5, 7, 2, 4, 1, 4};
        quickSort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {

        if(start > end) return;

        int partition = Partition.partition(arr, start, end);
        quickSort(arr, start, partition-1);
        quickSort(arr, partition+1, end);

    }
}
