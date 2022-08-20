package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[arrSize];

        for(int i = 0 ; i < arrSize ; i++) {
            arr[i] = sc.nextInt();
        }

        int alex = findFirst(arr, target);
        if(alex == -1) {
            System.out.println("-1 -1");
        } else {
            int novo = findLast(arr, target);
            System.out.println(String.format("%d %d", alex, novo));
        }
    }

    private static int findFirst(int[] arr, int target) {
        int alex = -1;

        int lo = 0, hi = arr.length-1, mid;
        while(lo <= hi) {
            mid = lo + (hi-lo)/2;

            // if mid == target, then probable alex's postion is mid,
            // but look further left for first position i.e. hi = mid-1
            if(arr[mid] == target) {
                alex = mid;
                hi = mid-1;
            } else if(arr[mid] < target) { // target might be after arr[mid] so look for it by making lo = mid+1
                lo = mid+1;
            } else { // target might be before arr[mid] so look for it by making hi = mid-1
                hi = mid-1;
            }
        }

        return alex;
    }

    private static int findLast(int[] arr, int target) {
        int novo = -1;

        int lo = 0, hi = arr.length-1, mid;
        while(lo <= hi) {
            mid = lo + (hi-lo)/2;

            // if mid == target, then probable novo's postion is mid,
            // but look further right for last position i.e. lo = mid + 1
            if(arr[mid] == target) {
                novo = mid;
                lo = mid + 1;
            } else if(arr[mid] < target) { // target might be after arr[mid] so look for it by making lo = mid+1
                lo = mid+1;
            } else { // target might be before arr[mid] so look for it by making hi = mid-1
                hi = mid-1;
            }
        }

        return novo;
    }

}
