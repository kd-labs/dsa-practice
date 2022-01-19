package track.arrays.gfg.cip.dsa.basic;

import java.util.Arrays;

public class RotateLeft {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotateLeft(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void rotateLeft(int[] arr) {
        int tmp = arr[0], len=arr.length, idx=0;

        for(idx = 0 ; idx < len-1 ; idx++) {
            arr[idx] = arr[idx+1];
        }
        arr[idx] = tmp;
    }
}
