package leetcode;

import java.util.Arrays;

public class CoinChangeII {

    public static void main(String[] args) {

        CoinChangeII coinChange = new CoinChangeII();

        System.out.println(coinChange.change(5, new int[] {1, 2, 5}));

    }

    public int change(int amount, int[] coins) {

        int[][] amountArr = new int[amount+1][coins.length];

        for(int i = 0 ; i < amountArr.length ; i++) {
            Arrays.fill(amountArr[i], -1);
        }

        // top down i.e. memoization approach
        // return change(amount, coins, amountArr, 0);

        // bottom up i.e. tabulation approach
        return change_bottomUp(amount, coins);
    }

    private int change(int amount, int[] coins, int[][] amountArr, int idx) {

        // Base Case
        if(amount == 0) return 1;
        if(idx >= coins.length) return 0;

        // DP Case
        if(amountArr[amount][idx] != -1) {
            return amountArr[amount][idx];
        }

        int res = 0;
        // Recursion Case
        // inclusion call
        if(coins[idx] <= amount) {
           res += change(amount-coins[idx], coins, amountArr, idx);
        }
        // exclusion call
        res += change(amount, coins, amountArr, idx+1);

        amountArr[amount][idx] = res;

        return res;

    }

    private int change_bottomUp(int amount, int[] coins) {

        // create a tabulation 2D array
        int[][] dp = new int[amount+1][coins.length+1];

        // fill the 0th row i.e. amount = 0 with 1
        // meaning # of ways to get amount 0 i.e. base case using any coins is 1
        for(int i = 0 ; i < dp[0].length ; i++) {
            dp[0][i] = 1;
        }

        // fill the 0th col i.e. 0 coins with 0
        // meaning # of ways to get any amount using 0 coins is 0
        for(int i = 0 ; i < dp.length ; i++) {
            dp[i][0] = 0;
        }

        // start filling the rest of the rows i.e. amounts for all the cols i.e. coins
        for(int amt = 1 ; amt < dp.length ; amt++) {
            for(int coinIdx = 1 ; coinIdx < dp[amt].length ; coinIdx++) {

                int res = 0;
                // check if coins[coinIdx] is less than or equal to amount so it can be included
                // inclusion case
                if(coins[coinIdx-1] <= amt) {
                    res += dp[amt-coins[coinIdx-1]][coinIdx];
                }
                // exclusion case
                res += dp[amt][coinIdx-1];

                dp[amt][coinIdx] = res;

            }
        }

        return dp[amount][coins.length];
    }
}
