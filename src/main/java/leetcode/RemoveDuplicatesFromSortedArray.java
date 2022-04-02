package leetcode;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = removeDuplicates(nums);
        System.out.println(k);
    }

    private static int removeDuplicates(int[] nums) {
        int i = 0, len = nums.length;

        for(int j = 0 ; j < len ; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }

        return i+1;
    }
}
