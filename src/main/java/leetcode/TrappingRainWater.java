package leetcode;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] nums = {3, 1, 10, 6, 8, 7};

        int trappedWater = calculateTrappedWater(nums);
        System.out.println(trappedWater);
    }

    private static int calculateTrappedWater(int[] nums) {
        int sum = 0;

        // TODO : build leftMax and rightMax using single loop

        int[] leftMax = getLeftMax(nums);
        int[] rightMax = getRightMax(nums);

        for(int i = 0 ; i < nums.length ; i++) {
            sum += Math.min(leftMax[i], rightMax[i]) - nums[i];
        }

        return sum;
    }

    private static int[] getRightMax(int[] nums) {
        int length = nums.length;
        int[] rightMax = new int[length];
        rightMax[length-1] = nums[length-1];

        for(int i = length-2; i >=0; i--) {
            rightMax[i] = Math.max(nums[i], rightMax[i+1]);
        }

        return rightMax;
    }

    private static int[] getLeftMax(int[] nums) {
        int[] leftMax = new int[nums.length];
        leftMax[0] = nums[0];

        for(int i = 1 ; i < nums.length ; i++) {
            leftMax[i] = Math.max(leftMax[i-1], nums[i]);
        }
        return leftMax;
    }
}
