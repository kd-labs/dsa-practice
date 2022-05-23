package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = searchInRotatedArray(arr, target);
        System.out.println(res);
    }

    private static int searchInRotatedArray(int[] arr, int target) {

        // find the location of minimum element in rotated sorted array
        int pivotIndex = getPivotElement(arr);

        if(arr[pivotIndex] == target) return pivotIndex;

        // search of element to left of pivot element
        int res1 = searchInArray(arr, 0, pivotIndex-1, target);

        // search element to right of pivot element
        int res2 = searchInArray(arr, pivotIndex+1, arr.length-1, target);

        return res1 == res2 ? -1 : res1 == -1 ? res2 : res1;
    }

    private static int getPivotElement(int[] arr) {
        int lo = 0, hi = arr.length-1;

        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;

            if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]) {
                return mid;
            } else if(arr[mid] < arr[hi]) {
                // right is sorted so move to left
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        return -1;
    }

    private static int searchInArray(int[] arr, int start, int end, int target) {

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

}
