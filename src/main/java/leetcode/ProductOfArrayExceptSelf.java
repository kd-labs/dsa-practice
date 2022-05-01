package leetcode;

import java.util.Arrays;

/*
 * @see <a href="https://leetcode.com/problems/product-of-array-except-self/"></a>
 */

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 2};
        int[] prductArrayExceptSelf = productArrayExceptSelf(nums);
        for (int i : prductArrayExceptSelf) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] productArrayExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];

        int[] prefixProdLeft = prefixProductLeft(nums);
        int[] prefixProdRight = prefixProductRight(nums);

        for(int i = 0 ; i < len ; i++) {
            res[i] = prefixProdLeft[i] * prefixProdRight[i];
        }

        return res;
    }

    private static int[] prefixProductRight(int[] nums) {
        int len = nums.length;
        int[] prefixProductRight = new int[nums.length];
        prefixProductRight[len-1] = 1;
        for(int i = nums.length-2 ; i >= 0 ; i--) {
            prefixProductRight[i] = prefixProductRight[i+1] * nums[i+1];
        }
        return prefixProductRight;
    }

    private static int[] prefixProductLeft(int[] nums) {
        int[] prefixProductLeft = new int[nums.length];
        prefixProductLeft[0] = 1;
        for(int i = 1; i < nums.length ; i++) {
            prefixProductLeft[i] = prefixProductLeft[i-1] * nums[i-1];
        }

        return prefixProductLeft;
    }

}
