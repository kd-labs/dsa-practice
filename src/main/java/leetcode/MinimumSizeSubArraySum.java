package leetcode;

public class MinimumSizeSubArraySum {

    public static void main(String[] args) {
//        int target = 7;
//        int[] nums = {2,3,1,2,4,3};
        int target = 4;
        int[] nums = {1,4,4};
//        int target = 11;
//        int[] nums = {1,1,1,1,1,1,1,1};
//        int target = 11;
//        int[] nums = {1,2,3,4,5};

        int res = minimumSubArrayLen(nums, target);
        System.out.println(res);
    }

    private static int minimumSubArrayLen(int[] nums, int target) {

        int res = Integer.MAX_VALUE;
        int i=0, j=0, size=nums.length, window_sum=0;

        while(j < size) {

            // calculate for j
            window_sum += nums[j];

            while(window_sum >= target) {
                res = Math.min(res, j+1 -i);

                // remove the calculation of i from window_sum
                window_sum -= nums[i];
                // move i
                i++;
            }
            j++;

        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }

//    private static int minimumSubArrayLen(int[] nums, int target) {
//
//        int res = Integer.MAX_VALUE;
//        int left=0, right=0, size=nums.length, window_sum=0;
//
//        while(right < size) {
//
//            if(window_sum < target) {
//                window_sum = window_sum + nums[right];
//                right++;
//            } else if(window_sum == target) {
//                res = Math.min(res, right-left+1);
//                right++;
//            } else if(window_sum > target) {
//                while(window_sum > target) {
//                    window_sum = window_sum - nums[left];
//                    left++;
//                }
//            }
//        }
//
//        return res == Integer.MAX_VALUE ? 0 : res;
//    }
}
