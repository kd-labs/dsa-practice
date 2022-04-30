package leetcode;

/*
@link : https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {

    /*
        Algo :
            1. Create helper function to reverse array from m to n index
            2. reverse nums from 0 to arr.length - 1
            3. reverse nums from 0 to k-1.
            4. reverse nums from k to arr.length-1
     */

    public static void rotate(int[] nums, int k) {

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

    }

    public static void reverse(int[] nums, int start, int end) {
        int temp;
        while(start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

//        int[] nums = {-1,-100,3,99};
//        int k = 2;

        rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}
