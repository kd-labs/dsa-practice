package dsa_revision.recursion;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for(int i = 0; i < arrSize ; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(lastIndex(arr, target, arr.length-1));
    }

    public static int lastIndex(int[] arr, int target, int idx) {

        // Base Case : Negative
        if(idx < 0) return -1;

        // Base Case : Positive
        if(arr[idx] == target) return idx;

        // Recursive Case
        return lastIndex(arr, target, idx-1);
    }
}
