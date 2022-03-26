package leetcode;

public class BinarySubarraysWithSum {

    public static void main(String[] args) {
//        int[] nums = {1,0,1,0,1};
//        int goal = 2;
        int[] nums = {0,0,0,0,0};
        int goal = 0;

        int res = subarraysCountWithSumGoalBrute(nums, goal);
        System.out.println(res);
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
