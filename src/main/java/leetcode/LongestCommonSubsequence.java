package leetcode;

import java.util.Arrays;

public class LongestCommonSubsequence {

    public static void main(String[] args) {

        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

//        System.out.println(longestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));
//        System.out.println(longestCommonSubsequence.longestCommonSubsequence("abc", "def"));

        System.out.println(longestCommonSubsequence.longestCommonSubsequence_Tabulation("abcde", "ace"));

    }

    public int longestCommonSubsequence(String k, String v) {

        int[][] dp = new int[k.length()+1][v.length()+1];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }

        return longestCommonSubsequence(k, v, 0, 0, dp);
    }

    public int longestCommonSubsequence(String k, String v, int idx_k, int idx_v, int[][] dp) {

        // Base Case
        if(idx_k == k.length() || idx_v == v.length()) return 0;

        // DP case
        if(dp[idx_k][idx_v] != -1) return dp[idx_k][idx_v];

        // Recursive Case
        int res = 0;
        if(k.charAt(idx_k) == v.charAt(idx_v)) {
            res = 1 + longestCommonSubsequence(k, v, idx_k+1, idx_v+1, dp);
        } else {
            res = Math.max(longestCommonSubsequence(k, v, idx_k+1, idx_v, dp), longestCommonSubsequence(k, v, idx_k, idx_v+1, dp));
        }

        // store the res in dp and return
        return dp[idx_k][idx_v] = res;
    }

    public int longestCommonSubsequence_Tabulation(String k, String v) {

        int[][] dp = new int[k.length()+1][v.length()+1];

        for(int i = 1 ; i < dp.length ; i++) {
            for(int j = 1 ; j < dp[0].length ; j++) {
                if(k.charAt(i-1) == v.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[k.length()][v.length()];
    }

}
