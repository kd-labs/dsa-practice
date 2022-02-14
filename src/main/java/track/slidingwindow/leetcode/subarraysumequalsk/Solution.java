package track.slidingwindow.leetcode.subarraysumequalsk;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1, -1, 0};
        int target = 0;
        System.out.printf("Count of subarray with sum %d is %d.\n", target, countSubArraySumEqualsK(arr, target));
    }

    private static int countSubArraySumEqualsK(int[] arr, int target) {


        int j = 0, n = arr.length, count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while(j < n) {

            sum = sum + arr[j];
            map.put(sum, map.getOrDefault(sum , 0) + 1);

            if(sum == target) {
                count++;
            } else if( sum != target ) {

                if(map.containsKey(sum-target)) {
                    count++;
                }
            }
            j++;
        }

        return count;

    }
}
