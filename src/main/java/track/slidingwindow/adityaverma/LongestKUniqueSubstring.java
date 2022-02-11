package track.slidingwindow.adityaverma;

import java.util.HashMap;
import java.util.Map;

public class LongestKUniqueSubstring {

    public static void main(String[] args) {
        String str = "aabacbebebe";
        int k = 3;

        int res = longestKUniqueSubstring(str, k);

        System.out.printf("Longest substring with %d distinct chars is %d.\n", k, res);
    }

    private static int longestKUniqueSubstring(String str, int k) {

        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int i = 0 , j = 0, n = str.length(), count;

        while(j < n) {

            /*
                calculation
             */
            map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);
            count = map.size();

            if(count == k) {
                /*
                    ans <------ calculation
                 */
                res = Math.max(res, j-i+1);
            } else if(count > k) {

                /*
                    Grow the window and check the condition
                 */
                while(count > k) {

                    if(map.containsKey(str.charAt(i))) {
                        map.put(str.charAt(i), map.get(str.charAt(i))-1);
                        if(map.get(str.charAt(i)) == 0) {
                            map.remove(str.charAt(i));
                            count--;
                        }
                    }
                    i++;
                }
            }
            j++;
        }

        return res;
    }
}
