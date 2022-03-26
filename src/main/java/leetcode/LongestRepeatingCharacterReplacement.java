package leetcode;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
//        String s = "ABBB";
//        int k = 2;

//        int res = longestRepeatingCharacterReplacementBrute(s, k);
        int res = longestRepeatingCharacterReplacementOptimized(s, k);
        System.out.println(res);
    }

    private static int longestRepeatingCharacterReplacementOptimized(String s, int k) {

        int i = 0; // left pointer
        int j = 0; // right pointer
        int len = s.length(), windowLen;
        int res = Integer.MIN_VALUE, maxFreq = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        while(j < len) {

            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(j)));
            windowLen = j+1-i;

            if(windowLen - maxFreq <= k) {
               res = Math.max(res, (j+1-i));
            }

            while((j+1-i) - maxFreq > k) {

                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                maxFreq = Math.max(maxFreq, map.get(s.charAt(i)));
                i++;
            }

            j++;
        }

        return res;
    }

    private static int longestRepeatingCharacterReplacementBrute(String s, int k) {
        int res = Integer.MIN_VALUE, maxFreq = Integer.MIN_VALUE;
        int len = s.length(), windowLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < len ; i++) {

            map.clear();

            for(int j = i; j < len; j++) {

                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
                maxFreq = Math.max(maxFreq, map.get(s.charAt(j)));
                windowLen = j+1-i;
                if(windowLen-maxFreq <= k) {
                    // window is valid
                    // update result with max window len
                    res = Math.max(res, windowLen);
                } else break;

            }

        }

        return res;
    }
}
