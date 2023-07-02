package practice_july_2023;

public class JumpGame {

    public boolean canJump(int[] nums) {

        return canJump(nums, 0);
    }

    // method overloading
    public boolean canJump(int[] nums, int idx) {

        if (idx >= nums.length-1) return true;

        boolean flag = false;

        for(int i = 1 ; i <= nums[idx] ; i++) {
            flag = flag || canJump(nums, idx+i);
        }

        return flag;
    }
}
