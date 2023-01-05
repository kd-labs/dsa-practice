package leetcode;

import java.util.Arrays;

public class MinimumCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {

        int[] memoizationDS = new int[cost.length];
        Arrays.fill(memoizationDS, -1);

        int res = Math.min(
                minCostClimbingStairs(cost, 0, memoizationDS),
                minCostClimbingStairs(cost, 1, memoizationDS)
        );

        return res;

    }

    /*
        Memoization approach
     */
    private int minCostClimbingStairs(int[] cost, int idx, int[] ds) {

        // Base Case
        if(idx >= cost.length) return 0;

        // DP case
        if(ds[idx] != -1) { // means we have already calculated the min cost of climbing from step idx
            return ds[idx];
        }

        // Recursive Case
        int i1 = cost[idx] + minCostClimbingStairs(cost, idx+1, ds);
        int i2 = cost[idx] + minCostClimbingStairs(cost, idx+2, ds);

        int res = Math.min(i1, i2);
        ds[idx] = res;
        return res;
    }

    // sample data: [1,100,1,1,1,100,1,1,100,1]
    /*
        Bottom Up Approach i.e. Tabulation Approach
     */
    public int minCostClimbingStairs_tabulation(int[] cost) {
        int[] table = new int[cost.length];

        // setting the base cases from left
        table[0] = cost[0];
        table[1] = cost[1];

        for(int i = 2 ; i < table.length ; i++) {
            // table[i] = Math.min(pay idx cost and get min cost from idx-1 step, pay idx cost and get min from idx-2 step)
            table[i] = Math.min(
                    cost[i] + table[i-1],
                    cost[i] + table[i-2]
            );
        }

        return Math.min(table[table.length-1], table[table.length-2]);
    }

}
