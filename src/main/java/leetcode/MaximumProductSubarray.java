package leetcode;

public class MaximumProductSubarray {

    public static void main(String[] args) {
        // TC1 : int[] nums = {2,3,-2,4};
        // TC2 : int[] nums = {-2,0,-1};
        int[] nums = {-3,-1,-1};
        int res = maxProduct(nums);
        System.out.println(res);
    }

    private static int maxProduct(int[] array) {
       int res = Integer.MIN_VALUE;
       int product = 1;
       for(int i = 0 ; i < array.length ; i++) {

           product = product * array[i];
           res = Math.max(res, product);
           if(product <= 0) product = 1;
       }
       return res;
    }
}
