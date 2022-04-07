package grokking.coding.interview.patterns.slidingwindow;

public class LongestSubarrayWithOnesAfterReplacement {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1};
        int k = 3;

        int res= longestSubarrayWithOnesAfterReplacement(nums, k);
        System.out.println(res);
    }

    private static int longestSubarrayWithOnesAfterReplacement(int[] nums, int k) {
        int res = 0, len = nums.length, i = 0, j = 0, sum = 0;

        while (j < len) {

            sum += nums[j];

            while ((j+1-i) - sum > k) {
                // shrink window
                sum -= nums[i];
                i++;
            }

            res = Math.max(res, j+1-i);

            j++;
        }

        return res;
    }
}
