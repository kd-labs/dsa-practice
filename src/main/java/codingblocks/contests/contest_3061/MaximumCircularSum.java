package codingblocks.contests.contest_3061;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            int i = 0;
            while(i < size) {
                arr[i++] = sc.nextInt();
            }

            int res = maxCircularSum(arr);
            System.out.println(res);
        }
    }

    /**
     *      Hint : Variation of Kadane's Algorithm
     *      Idea :
     *          Max sum in circular arr can span linearly within arr or span across to beginning
     *          Idea is to find the total sum of array and subtract the min part of arr which will
     *          give the max subarray in circular array.
     *
     *          To find the minimum subarry, we invert by multiplying -1 and apply kadane's algo to
     *          find the max sum subarray in inverterd array which will minimum subarray in origianl
     *          array.
     */
    private static int maxCircularSum(int[] arr) {
        int[] invertedArr = Arrays.stream(arr).map(x -> -x).toArray();
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            totalSum += invertedArr[i];
            sum += invertedArr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0) sum = 0;
        }

        return -totalSum - (-maxSum);
    }
}
