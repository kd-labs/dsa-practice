package codingblocks.contests.contest_3061;

import Utilities.Helper;

import java.util.Scanner;

public class NextPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i = 0 ; i < size ; i++) {
                arr[i] = sc.nextInt();
            }
            
            nextPermutation(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     *                           6
     *                         3   5
     * decreasing from top   1      4  (incresing from bottom)
     *      Algo:
     *         1. Find the first number which is smaller than it's successor i.e. ptr1 =  arr[i] < arr[i+1]
     *         2. Find the smallest number greater than number arr[ptr1] i.e. ptr2.
     *         3. Swap arr[ptr1] and arr[ptr2]
     *         4. reverse all elements following ptr1
     *
     *         Edge Case : When number is monotically decreasing i.e. 321, then print 123
     *             a. check if idx == -1,
     *                  true -> then reverse arr
     *
     */

    private static void nextPermutation(int[] arr) {
        int idx1 = -1, idx2 = -1;
        int ptr = arr.length-2;
        while(ptr >= 0) {
            if(arr[ptr] < arr[ptr+1]) {
                idx1 = ptr;
                break;
            }
            ptr--;
        }
        if(idx1 == -1) {
            Helper.reverse(arr, 0, arr.length-1);
            return;
        }
        ptr = arr.length-1;
        while(ptr > idx1) {
            if(arr[ptr] > arr[idx1] && (idx2 == -1 || arr[ptr] < arr[idx2])) {
                idx2 = ptr;
            }
            ptr--;
        }
        Helper.swap(arr, idx1, idx2);
        Helper.reverse(arr, idx1+1, arr.length-1);
    }
}
