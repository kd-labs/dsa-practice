package track.slidingwindow.adityaverma;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrencesOfAnagrams {

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        int i = countAnagramOccurrences(s, p);
        System.out.printf("count of anagram %s in string %s is %d.\n", s, p , i);

    }

    private static int countAnagramOccurrences(String text, String pattern) {
        int res = 0;
        Map<Character, Integer> map = createMap(pattern);
        int count = map.size();

        int i = 0, j = 0, n = text.length(), k = pattern.length();

        while(j < n) {

            /*
                calculation
             */
            if(map.containsKey(text.charAt(j))) {
                map.put(text.charAt(j), map.get(text.charAt(j))-1);
                if(map.get(text.charAt(j)) == 0) count--;
            }

            // window size hits K
            if(j-i+1 == k) {

                /*
                    ans <----- calculation
                 */
                if(count == 0) res++;

                // maintain and slide the window, by incrementing j and i but
                // first remove the calculation of i, and then
                // increment i

                if(map.containsKey(text.charAt(i))){
                    map.put(text.charAt(i), map.get(text.charAt(i))+1);
                    if(map.get(text.charAt(i)) == 1) count++;
                }
                i++;
            }
            j++;
        }

        return res;
    }

    private static Map<Character, Integer> createMap(String pattern) {

        Map<Character, Long> map1 =
                pattern.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    Map<Character, Integer> map = new HashMap<>();

        for(char c : pattern.toCharArray()) {
           map.put(c, map.getOrDefault(c, 0)+1);
        }

        return map;
    }
}
