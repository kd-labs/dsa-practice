package leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int res = getInsertPosition(nums, target);
        System.out.println(res);
    }

    private static int getInsertPosition(int[] nums, int target) {
        int lo = 0, hi = nums.length-1, mid;

        while(lo <= hi) {
            mid = lo + (hi-lo)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                lo = mid+1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }
}
