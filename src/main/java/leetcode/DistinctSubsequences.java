package leetcode;

import java.util.Arrays;

public class DistinctSubsequences {

    public static void main(String[] args) {

        DistinctSubsequences distinctSubsequences = new DistinctSubsequences();

        System.out.println(distinctSubsequences.numDistinct("rabbbit", "rabbit"));
//        System.out.println(distinctSubsequences.numDistinct("babgbag", "bag"));

    }

    public int numDistinct(String s, String t) {

        int[][] dp = new int[t.length()+1][s.length()+1];

        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }

        return numDistinct(s, t, 0, 0, dp);
    }

    private int numDistinct(String s, String t, int idx_s, int idx_t, int[][] dp) {

        // Base Case
        if(idx_t == t.length()) return 1;
        if(idx_s == s.length() || idx_t == t.length() || ((t.length()-1-idx_t) > (s.length()-1-idx_s))) return 0;

        // DP case i.e. check if result already present in dp table
        if(dp[idx_t][idx_s] != -1) return dp[idx_t][idx_s];

        // Recursive Case
        int res = 0;
        // inclusion case
        if(s.charAt(idx_s) == t.charAt(idx_t)) {
            // inclusion can be done
            res += numDistinct(s, t, idx_s+1, idx_t+1, dp);
        }
        // exclusion case
        res += numDistinct(s, t, idx_s+1, idx_t, dp);

        // save into dp table
        dp[idx_t][idx_s] = res;

        return res;
    }
}
