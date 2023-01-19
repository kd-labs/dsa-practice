package leetcode;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        int res = majorityElement(nums);
        System.out.println(res);
    }

    private static int majorityElement(int[] nums) {

        // Assumption
        int majorityElement = nums[0], count = 1;

        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] == majorityElement) count++;
            else {
                count--;
                if(count == 0) {
                    count = 1;
                    majorityElement = nums[i];
                }
            }
        }

        return majorityElement;
    }
}
