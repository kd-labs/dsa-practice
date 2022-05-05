package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        int i = 0 ;
        while(i < arrSize) {
            arr[i] = sc.nextInt();
            i++;
        }
        reverseArray(arr, arrSize);
        for (int k : arr) {
            System.out.println(k);
        }
    }


    public static void reverseArray(int arr[], int n) {
        for(int idx = 0 ; idx < n/2 ; idx++) {
            arr[idx] = arr[idx] ^ arr[n-1-idx];
            arr[n-1-idx] = arr[idx] ^ arr[n-1-idx];
            arr[idx] = arr[idx] ^ arr[n-1-idx];
        }

    }

}
