package leetcode;

public class MaximumSubarray {

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = maxSubArrayBrute(nums);
        System.out.println(res);
    }

    // Brute Force Approach
    private static int maxSubArrayBrute(int[] nums) {
        int max = Integer.MIN_VALUE, sum;

        for(int i = 0 ; i < nums.length ; i++) {
            sum = 0;
            for(int j = i ; j < nums.length ; j++) {
                sum += nums[j];
                if(sum > max) max = sum;
            }
        }

        return max;
    }

    /*
        KADANE'S ALGORITHM

            1. input = [-2, -5, -7, -4]
            2. max = -infinity
            3. sum = 0
            4. Kadane's algorithm to find max sum of subarray :-

                a. Calculate sum of element i of arr
                b. Compare sum with max and check which one is max
                c. if sum < 0, i.e. sum of subarray is negative and negative is less than 0,
                   so discard negative sum as we seek max sum,
                   and 0 > -ve sum
                   therefore, sum = 0, whenever sum is -ve

                      input ->  [-2, -5, -7, -4] , i = 0
                      sum = sum + -2 = -2
                      max = Math.max(sum, max) = -2
                      since sum < 0, then sum = 0


                      input ->  [-2, -5, -7, -4] , i = 1
                      sum = sum + -5 = -5
                      max = Math.max(sum, max) = -2
                      since sum < 0, then sum = 0


                      input ->  [-2, -5, -7, -4] , i = 2
                      sum = sum + -7 = -7
                      max = Math.max(sum, max) = -2
                      since sum < 0, then sum = 0


                      input ->  [-2, -5, -7, -4] , i = 3
                      sum = sum + -4 = -4
                      max = Math.max(sum, max) = -2
                      since sum < 0, then sum = 0


                      Therefore, max sum subarray for [-2, -5, -7, -4] is -2 of subarray [-2]

            Related Questions:
                1. Maximum Sum SubArray in circular array.
     */

    private static int maxSumSubArray(int[] nums){

        int max = Integer.MIN_VALUE, sum = 0, start=0, end=0;

        for(int i = 0 ; i < nums.length ; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            // To track the start and end of max sum subarray
            if(sum > max) {
                max = sum;
                end = i;
            }
            if(sum < 0) {
                sum = 0;
                start = i+1;
            }
        }

        System.out.println("Start and end of max sum subarray : " + start + " " + end);
        System.out.println("Length of max sum subarray : " + (end+1-start));
        return max;
    }
}
