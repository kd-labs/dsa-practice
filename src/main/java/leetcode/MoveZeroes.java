package leetcode;

public class MoveZeroes {

    public static void main(String[] args) {

    }

    /**
     *      Hint : Two Pointer
     *
     *      Approach :
     *
     *          pos-ptr and loop-ptr
     *          if(loop-ptr != 0)
     *              then swap pos-ptr and loop-prt
     *              and pos-ptr++
     */

    private static void moveZeroes(int[] nums) {

        int i = 0, insert = 0;
        while(i < nums.length) {
            if(nums[i] != 0){
                int temp = nums[insert];
                nums[insert] = nums[i];
                nums[i] = temp;
                insert++;
            }
            i++;
        }
    }
}
