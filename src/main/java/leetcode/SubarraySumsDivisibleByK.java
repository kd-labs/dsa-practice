package leetcode;

public class SubarraySumsDivisibleByK {

    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int target = 5;

        int res = subArrayCountDivisibleByK(nums, target);

        System.out.println(res);
    }

    private static int subArrayCountDivisibleByK(int[] nums, int target){
        int len = nums.length, sum, count = 0;
        for(int i = 0 ; i < len ; i++) {
            sum = 0;
            for (int j = i ; j < len ; j++) {
                sum += nums[j];
                if(sum % target == 0) count++;
            }
        }
        return count;

    }
}
