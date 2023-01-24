package dsa_revision.recursion;

import java.util.Scanner;

public class CheckArraySorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for(int i = 0; i < arrSize ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isArraySorted(arr, 0));
    }

    public static boolean isArraySorted(int[] arr, int idx) {

        // Base Case : Positive
        if(idx == arr.length-1) return true;

        // Base Case : Negative
        if(arr[idx] > arr[idx+1]) return false;

        return isArraySorted(arr, idx+1);
    }
}
