package leetcode;

/*
    Intuition : Since count of any odd numbers is contributing to k.
                Therefore, change the original array such that odd numbers = 1 , as they are adding to k
                and even numbers = 0, as they are ignored

                Maintain a map, where we keep the count of sum of subarrays/windows

                Using the idea of prefix sum i.e. (sum of current window) - k = sum of previous window(P).
                Check the count of occurrence of P in map and add it to the result
 */

import java.util.HashMap;

public class CountNiceSubArrays {

    public static void main(String[] args) {
//        int[] nums = {1,1,2,1,1};
//        int k = 3;
//        int[] nums = {2,4,6};
//        int k = 1;
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
//        int[] nums = {2,2,1,2,1,2,1};
//        int k = 2;

//        int res = countNiceSubarraysBrute(nums, k);
//        int res = countNiceSubarraysOptimized(nums, k);
        int res = countNiceSubarraysMoreOptimized(nums, k);
        System.out.println(res);
    }

    private static int countNiceSubarraysMoreOptimized(int[] nums, int k) {
        int res = 0, len = nums.length;
        int j = 0, subarraySum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while ( j < len) {

//            if((nums[j] & 1) == 1) subarraySum++; Another way of writing as shown below
            subarraySum += nums[j] & 1; // odd & 1 = 1, even & 0...... therefore

            if(subarraySum == k) res++;
            res += map.getOrDefault(subarraySum-k, 0);

            map.put(subarraySum, map.getOrDefault(subarraySum,0)+1);

            j++;
        }

        return res;
    }

    private static int countNiceSubarraysOptimized(int[] nums, int need) {
        int res = 0, len = nums.length, sum = 0;
        int i = 0; // left pointer
        int j = 0; // right pointer
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int k = 0 ; k < len ; k++) {
            if((nums[k] & 1) == 1) {
                nums[k] = 1;
            } else
                nums[k] = 0;
        }

        while (j < len) {

            sum = sum + nums[j];

            if(sum == need) res++;
            if((sum-need >= 0) && map.containsKey(sum-need)) res += map.get(sum-need);

            map.put(sum, map.getOrDefault(sum, 0) + 1);

            j++;
        }

        return res;
    }

    private static int countNiceSubarraysBrute(int[] nums, int k) {
        int res = 0, len=nums.length, need;

        for(int i = 0 ; i < len ; i++) {
            need = k;
            for(int j = i ; j < len ; j++) {
                if((nums[j] & 1) == 1) {
                    need--;
                }
                if(need == 0) {
                    res++;
                } else if(need < 0) {
                    break;
                }
            }
        }


        return res;
    }
}
