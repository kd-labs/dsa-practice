package codingblocks.contests.contest_3061;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        int i = 0 ;
        while(i < arrSize) {
            arr[i++] = sc.nextInt();
        }
        int target = sc.nextInt();
        targetPair(arr, arrSize, target);
    }

    private static void targetPair(int[] arr, int arrSize, int target) {
        Arrays.sort(arr);
        int start = 0, end = arrSize-1;
        while (start < end) {
           if(arr[start] + arr[end] == target) {
               System.out.println(arr[start ]+ " and " + arr[end]);
               end--;
           } else if(arr[start] + arr[end] > target) end--;
           else start++;
        }
    }
}
