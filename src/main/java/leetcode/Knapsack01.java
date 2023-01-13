package leetcode;

import java.util.Arrays;

public class Knapsack01 {

    public static void main(String[] args) {
        int cap = 8;
        int[] weight = {1, 4, 2, 3, 6};
        int[] value = {1, 1, 7, 9, 1};

        int[][] dp = new int[cap+1][value.length+1];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }

        System.out.println(knapsack(cap, weight, value, 0, dp));
    }

    public static int knapsack(int capacity, int[] weight, int[] value, int idx, int[][] dp) {

        // Base Case
        if(capacity == 0 || idx == value.length) return 0;

        // DP case i.e. check if result is already remembered in dp array
        if(dp[capacity][idx] != -1) return dp[capacity][idx];

        // Recursive Case
        // inclusion case
        int inclusion = 0;
        int exclusion = 0;
        if(capacity >= weight[idx]) {
            inclusion = value[idx] + knapsack(capacity-weight[idx], weight, value, idx+1, dp);
        }
        exclusion = knapsack(capacity, weight, value, idx+1, dp);

        // save result in dp array and return
        return dp[capacity][idx] = Math.max(inclusion, exclusion);
    }
}
