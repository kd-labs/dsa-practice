package track.arrays.gfg.cip.dsa.basic;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 30};
        reverseArr(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void reverseArr(int[] arr) {
        int len = arr.length;
        for(int idx = 0 ; idx < (len/2) ; idx++) {
            arr[idx] = arr[idx] ^ arr[len-1-idx];
            arr[len-1-idx] = arr[len-1-idx] ^ arr[idx];
            arr[idx] = arr[idx] ^ arr[len-1-idx];
        }
    }
}
