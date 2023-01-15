package leetcode;

import java.util.Arrays;

public class UncrossedLines {

    public static void main(String[] args) {

        UncrossedLines uncrossedLines = new UncrossedLines();

        System.out.println(uncrossedLines.maxUncrossedLines(new int[]{1,3,7,1,7,5}, new int[]{1,9,2,5,1}));

    }

    public int maxUncrossedLines(int[] nums1, int[] nums2) {

        int[][] dp = new int[nums1.length+1][nums2.length+1];

        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }

        return maxUncrossedLines(nums1, nums2, 0, 0, dp);
    }

    public int maxUncrossedLines(int[] nums1, int[] nums2, int idx1, int idx2, int[][] dp) {

        // Base Case
        if(idx1 == nums1.length || idx2 == nums2.length) return 0;

        // DP Case
        if(dp[idx1][idx2] != -1) {
            return dp[idx1][idx2];
        }

        // Recursive Case
        int ans = 0;
        if(nums1[idx1] == nums2[idx2]) {
            ans = 1 + maxUncrossedLines(nums1, nums2, idx1+1, idx2+1, dp);
        } else {
            ans = Math.max(
                    maxUncrossedLines(nums1, nums2, idx1+1, idx2, dp),
                    maxUncrossedLines(nums1, nums2, idx1, idx2+1, dp)
            );
        }

        // Save the answer in dp table and return
        return dp[idx1][idx2] = ans;

    }

    public int maxUncrossedLines_BU(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length+1][nums2.length+1];

        for(int i = 1 ; i < dp.length ; i++) {
            for(int j = 1 ; j < dp[0].length ; j++) {
                if(nums1[i-1] == nums2[j-1]) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        return dp[nums1.length][nums2.length];
    }
}
