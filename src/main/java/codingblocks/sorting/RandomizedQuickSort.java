package codingblocks.sorting;

import java.util.Random;

public class RandomizedQuickSort {

    public static void main(String[] args) {

    }

    private static void quickSort(int[] arr, int start, int end) {

        if(start > end) return;

        int partition = Partition.partition(arr, start, end);
        quickSort(arr, start, partition-1);
        quickSort(arr, partition+1, end);

    }

}
