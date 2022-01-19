package track.arrays.gfg.cip.dsa.basic;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 30};
        removeDuplicates(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void removeDuplicates(int[] arr) {
        int len = arr.length, res = 0;

        for(int idx = 1; idx < len ; idx++) {
            if(arr[idx-1] != arr[idx]) {
                arr[++res] = arr[idx];
            } else {
                arr[idx] = Integer.MIN_VALUE;
            }
        }
        System.out.println("res = " + res);
    }
}
