package track.arrays.gfg.cip.dsa.basic.problems;

import java.util.Arrays;

public class ArrayInsertAtIndex {

    public static void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        for(int idx = sizeOfArray-1; idx > index ; idx--) {
            arr[idx] = arr[idx-1];
        }
        arr[index] = element;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9};
        insertAtIndex(arr, 6, 2, 90);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
