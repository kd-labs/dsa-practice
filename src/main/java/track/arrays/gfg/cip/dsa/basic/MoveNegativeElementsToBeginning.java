package track.arrays.gfg.cip.dsa.basic;

import Utilities.Helper;

public class MoveNegativeElementsToBeginning {

    public static void main(String[] args)
    {
        int[] ar = { 1, 2,  -4, -5, 2, -7, 3,
                2, -6, -8, -9, 3, 2,  1 };
//        move(ar);
        moveUsingTwoPointer(ar);
        for (int e : ar)
            System.out.print(e + " ");
    }

    /**
     *      Hint : Using Dutch National Flag Algorithm
     */
    private static void move(int[] nums) {
        int lo = 0 , hi = nums.length-1;

        while(lo <= hi) {
            if(nums[lo] < 0) lo++;
            else {
                Helper.swap(nums, lo, hi);
                hi--;
            }
        }
    }

    private static void moveUsingTwoPointer(int[] nums) {
        int lo = 0, hi = nums.length-1;

        while(lo <= hi) {

            if(nums[lo] < 0) lo++;
            else if(nums[hi] > 0) hi--;
            else {
                Helper.swap(nums, lo, hi);
                lo++;
                hi--;
            }
        }
    }
}
