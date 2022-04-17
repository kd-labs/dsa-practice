package leetcode;

public class GetEqualSubstringsWithinBudget {

    public static void main(String[] args) {

        // TC 1
//        String s = "abcd";
//        String t = "bcdf";
//        int maxCost = 3;

        // TC 2
//        String s = "abcd";
//        String t = "cdef";
//        int maxCost = 3;

        // TC 3
        String s = "abcd";
        String t = "acde";
        int maxCost = 0;

        int res = longestSubstringWithBudget(s, t, maxCost);
        System.out.println(res);
    }

    private static int longestSubstringWithBudget(String s, String t, int maxCost) {

        int res = 0, len = s.length(), j = 0, i = 0,sum = 0;

        while (j < len) {

            sum += Math.abs(s.charAt(j) - t.charAt(j));

            while (sum > maxCost) {

                sum -= Math.abs(s.charAt(i) - t.charAt(i));
                i++;
            }


            res = Math.max(res, j+1-i);

            j++;
        }

        return res;

    }
}
