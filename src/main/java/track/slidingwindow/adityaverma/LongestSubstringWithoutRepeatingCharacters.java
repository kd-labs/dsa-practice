package track.slidingwindow.adityaverma;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String str = "pwwkew";
        int res = longestSubstringWithUniqueCharacters(str);
        System.out.printf("Longest substring in string %s without repeating characters is %d.\n",
                                            str, res);
    }

    private static int longestSubstringWithUniqueCharacters(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, n = s.length(), res = 0, count;

        while (j < n) {

            /*
             * Calculation
             */
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            count = map.size();

            if(count == j-i+1) {
                /*
                    ans <------- calculation
                 */
                res = Math.max(res, j-i+1);

            } else if(count != j-i+1) {
                /*
                    Grow the window and maintain the contraint that number of distinct characters == window_size
                 */
                if(map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                }

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
