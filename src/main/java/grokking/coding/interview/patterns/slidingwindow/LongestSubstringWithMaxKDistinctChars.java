package grokking.coding.interview.patterns.slidingwindow;

import java.util.HashMap;

public class LongestSubstringWithMaxKDistinctChars {

    public static void main(String[] args) {
        String s = "araaci";
        int k = 2;

        int res = longestSubstringWithMaxKDistinctChars(s, k);
        System.out.println(res);
    }

    private static int longestSubstringWithMaxKDistinctChars(String s, int k) {
        int res = 0, j = 0, i = 0, len = s.length(), count;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < len) {

            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            count = map.size();

            while(count > k) {

                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                    count--;
                }

                i++;
            }

            res = Math.max(res, j+1-i);

            j++;
        }

        return res;
    }
}
