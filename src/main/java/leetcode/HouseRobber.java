package leetcode;

import java.util.Arrays;

public class HouseRobber {

    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        int[] table = new int[nums.length];
        Arrays.fill(table, -1);

        int maxValue = rob(nums, 0, table);
        return maxValue;
    }

    /*
        In this we are using top-down i.e. memoization approach
        where we are filling the memoization DS from right to left with base
        case starts from rightmost element
     */
    private int rob(int[] nums, int idx, int[] table) {

        // Base Case
        if(idx >= nums.length) return 0;

        // DP case i.e. check if result already in memoization DS
        if(table[idx] != -1) return table[idx];

        /*
             Recursive Case
         */
        // Case 1 : Rob house at idx and move to idx+2
        int i1 = nums[idx] + rob(nums, idx+2, table);
        // Case 2 : Skip house at idx and move to idx+1
        int i2 = rob(nums, idx+1, table);
        int res = Math.max(i1, i2);
        // store result in memoization DS
        table[idx] = res;
        return res;
    }

    // sample arr = {5, 2, 1, 11, 3}
    /*
        In bottom up i.e. tabulation approach we are coming from right to left.
        Therefore, we start filling the tabulation with base case starting from left and
        then build the answers as we move towards right.
     */
    private int rob_tabulation(int[] arr) {

        int[] table = new int[arr.length];
        table[0] = arr[0]; // setting the base case of the last house on the left i.e. arr[0]
        table[1] = Math.max(table[0], arr[1]); // setting the base case of the second last house on left i.e. arr[1], we find the max of (robbing idx=1 house, robbing idx=0 house)

        for(int i = 2 ; i < table.length ; i++) {
            // sample arr = {5, 2, 1, 11, 3}
            // Note : we are robbing house from right i.e. {5, 2, 1, 11, 3} <----- robbing from here
            // table[i] = Math.max(We rob idx house and get the max of robbing idx-2 house, We don't rob idx house and get the max of robbing idx-1 house)
            table[i] = Math.max(arr[i] + table[i-2], table[i-1]);
        }

        return table[table.length-1];
    }
}
