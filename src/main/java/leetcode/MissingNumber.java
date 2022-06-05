package leetcode;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {9,6,4,2,3,5,7,0,1};

        int res = missingNumber(nums);
        System.out.println(res);

    }

    private static int missingNumber(int[] nums){

        int n = nums.length;
        int sumN = n * (n+1)/2;
        int sum = Arrays.stream(nums).reduce(0, (t, x) -> t + x);
        return sumN-sum;
    }
}
