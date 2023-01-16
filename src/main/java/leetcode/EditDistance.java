package leetcode;

import java.util.Arrays;

public class EditDistance {

    public int minDistance(String word1, String word2) {

        int[][] dp = new int[word1.length()][word2.length()];

        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }

//        return minDistance(word1, word2, 0, 0, dp);
        return minDistance_BU(word1, word2);

    }

    public int minDistance(String word1, String word2, int idx1, int idx2, int[][] dp) {

        // Base Case
        if(idx1 == word1.length()) return word2.length()-idx2;
        else if(idx2 == word2.length()) return word1.length()-idx1;

        // DP case
        if(dp[idx1][idx2] != -1) return dp[idx1][idx2];

        // Recursive Case
        int res = 0;
        if(word1.charAt(idx1) == word2.charAt(idx2)) {
            // if characters are same then no operations is needed
            // so we move both the indexes
            res = minDistance(word1, word2, idx1+1, idx2+1, dp);
        } else {
            // the characters are different
            // therefore we need to perform the following operations : delete, insert, replace on word1
            // and call the recursive function with appropriate indexes incremented
            // and find the minimum among the 3 recursive calls for each operation performed

            // for delete operation
            int delete = minDistance(word1, word2, idx1+1, idx2, dp);

            // for insert operation
            int insert = minDistance(word1, word2, idx1, idx2+1, dp);

            // for replace operation
            int replace = minDistance(word1, word2, idx1+1, idx2+1, dp);

            res = 1 + Math.min(delete, Math.min(insert, replace));
        }

        return dp[idx1][idx2] = res;
    }

    public int minDistance_BU(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];

        dp[0][0] = 0;

        for(int i = 1 ; i < dp.length ; i++) {
            dp[i][0] = i;
        }

        for(int i = 1 ; i < dp[0].length ; i++) {
            dp[0][i] = i;
        }

        for(int i = 1 ; i < dp.length ; i++) {
            for(int j = 1 ; j < dp[0].length ; j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    int delete = dp[i-1][j]; // delete
                    int insert = dp[i][j-1]; // insert
                    int replace = dp[i-1][j-1]; // replace
                    dp[i][j] = Math.min(delete, Math.min(insert, replace)) + 1;
                }
            }
        }

        return dp[word1.length()][word2.length()];

    }
}
