package leetcode;

import java.util.HashMap;

public class BinarySubarraysWithSum {

    public static void main(String[] args) {
//        int[] nums = {1,0,1,0,1};
//        int goal = 2;
        int[] nums = {0,0,0,0,0};
        int goal = 0;

//        int res = subarraysCountWithSumGoalBrute(nums, goal);
        int res = subarraysCountWithSumGoalOptimized(nums, goal);
        System.out.println(res);
    }

    private static int subarraysCountWithSumGoalOptimized(int[] nums, int goal) {
        int i = 0; // left pointer
        int j = 0; // right pointer
        int len = nums.length;
        int sum=0, res=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(j < len) {

            sum = sum + nums[j];
            if(sum == goal) res++;
            if(map.containsKey(sum-goal)) {
                res += map.get(sum-goal);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

            j++;
        }

        return res;
    }

    private static int subarraysCountWithSumGoalBrute(int[] nums, int goal) {
        int res = 0, len = nums.length, sum;

        for(int i = 0 ; i < len ; i++) {
            sum = 0;
            for(int j = i; j < len ; j++) {
                sum = sum + nums[j];
                if(sum == goal) {
                    res++;
                } else if (sum > goal) break;
            }
        }

        return res;
    }
}
