package grokking.coding.interview.patterns.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithDistinctCharacters {

    public static void main(String[] args) {
        String s = "abccde";

        int res = longestSubstringWithDistinctCharacters(s);
        System.out.println(res);
    }

    private static int longestSubstringWithDistinctCharacters(String s) {
        int res = 0, j = 0, i = 0, len = s.length(), count;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < len) {

            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            count = map.size();

            if(count == (j+1-i)) {
                res = Math.max(res, j+1-i);
            }

            while(count != (j+1-i)) {

                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                    count--;
                }

                i++;
            }

            j++;
        }

        return res;
    }
}
