package codingblocks.sorting;

public class Partition {

    public static void main(String[] args) {

        int[] arr = {12, 3, 14, 5, 7, 2, 1, 4};
        int partition = partition(arr, 0, arr.length - 1);
        System.out.println(partition);

    }

     public static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int pivotIdx = start;

        for(int i = start ; i < end ; i++) {
            if(arr[i] <= pivot) { // swap the element with pivot and incr pivotIdx

                int temp = arr[i];
                arr[i] = arr[pivotIdx];
                arr[pivotIdx] = temp;

                pivotIdx++;
            }
        }

        int temp = arr[end];
        arr[end] = arr[pivotIdx];
        arr[pivotIdx] = temp;

        return pivotIdx;
    }

}
