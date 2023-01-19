package leetcode;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

        // take an array to hold the longest increasing subsequence
        int[] lisArr = new int[nums.length];
        lisArr[0] = nums[0];

        // loop through rest of the elements and compare
        int len = 1;
        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] > lisArr[len-1]) {
                lisArr[len] = nums[i];
                len++;
            } else {

                int indxReplace = binarySearch(lisArr, 0, len-1, nums[i]);
                lisArr[indxReplace] = nums[i];
            }
        }

        return len;
    }

    /*
        This binary search is similar to the problem "Find the next greater element"
     */
    public int binarySearch(int[] lisArr, int start, int end, int target) {

        int ans = 0;
        while(start <= end) {

            int mid = start + (end-start)/2;

            if(lisArr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

}
