package leetcode;

public class ShortestSubarrayWithSumAtLeastK {

    public static void main(String[] args) {
//        int[] nums = {2,-1,2};
//        int sum = 3;
//        int[] nums = {1};
//        int sum = 1;
//        int[] nums = {1,2};
//        int sum = 4;
//        int[] nums = {77,19,35,10,-14};
//        int sum = 19;
//        int[] nums = {48,99,37,4,-31};
//        int sum = 140;
        int[] nums = {84,-37,32,40,95};
        int sum = 167;

//        int res = shortestSubarrayWithSumAtLeastKBrute(nums, sum);
        int res = shortestSubarrayWithSumAtLeastKOptimized(nums, sum);

        System.out.println(res);
    }

    private static int shortestSubarrayWithSumAtLeastKOptimized(int[] nums, int k) {
        int i = 0; // left pointer
        int j = 0; // right pointer
        int res = Integer.MAX_VALUE;
        int len = nums.length;
        int sum=0;
        int[] prefixSum = new int[len];

        while(j < len) {

            sum = sum + nums[j];
            prefixSum[j] = sum;

            while(sum >= k) {
                res = Math.min(res, j+1-i);
                sum = sum - prefixSum[i];
                i++;
            }

            j++;
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private static int shortestSubarrayWithSumAtLeastKBrute(int[] nums, int k) {
        int res = Integer.MAX_VALUE;
        int len = nums.length;
        int sum;

        for(int i = 0 ; i < len ; i++) {
            sum = 0;
            for(int j = i ; j < len ; j++) {
                sum = sum + nums[j];
                if(sum >= k) {
                    res = Math.min(res, j+1-i);
                }
            }

        }


        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
