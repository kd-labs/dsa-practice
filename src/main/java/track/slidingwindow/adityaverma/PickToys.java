package track.slidingwindow.adityaverma;

import java.util.HashMap;
import java.util.Map;

public class PickToys {

    public static void main(String[] args) {

        String str = "abaccab";
        int k = 2;
        int res = longestSubArray(str, k);

        System.out.printf("Maximum number of toys that can be picked is %d.\n", res);

    }

    private static int longestSubArray(String str, int k) {

        Map<Character, Integer> map = new HashMap<>();
        int i = 0 , j = 0, n = str.length(), count, res = 0;

        while(j < n) {
            /*
             * calculation
             */
            map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);
            count = map.size();

            /*
             * condition hit
             */
            if(count == k) {
                res = Math.max(res, j-i+1);
            } else if(count > k) {
                if(map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), map.get(str.charAt(i))-1);
                }
                if(map.get(str.charAt(i)) == 0) {
                    map.remove(str.charAt(i));
                    count--;
                }
                i++;
            }
            j++;
        }
        return res;
    }
}
