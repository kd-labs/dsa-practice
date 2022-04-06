package grokking.coding.interview.patterns.slidingwindow;

import java.util.HashMap;

public class LongestSubstringWithSameLettersAfterReplacement {

    public static void main(String[] args) {
        String s = "abbcb";
        int k = 1;

        int res = longestSubstringWithSameLettersAfterReplacement(s, k);
        System.out.println(res);
    }

    private static int longestSubstringWithSameLettersAfterReplacement(String s, int k) {
        int res = 0, j = 0, i = 0, len = s.length(), maxCharFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < len) {

            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            maxCharFreq = Math.max(maxCharFreq, map.get(s.charAt(j)));

            while((j+1-i) - maxCharFreq > k) {

                map.put(s.charAt(i), map.get(s.charAt(i))-1);

                i++;
            }

            res = Math.max(res, j+1-i);

            j++;
        }
        return res;
    }
}
