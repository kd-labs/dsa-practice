package grokking.coding.interview.patterns.slidingwindow;

import javafx.util.Pair;

import java.util.HashMap;

public class SmallestWindowContainingSubstring {

    public static void main(String[] args) {

        String str = "adbbca";
        String pattern = "abc";

        String res = minWindowContainingSubstring(str, pattern);
        System.out.println(res);
    }

    private static String minWindowContainingSubstring(String str, String pattern) {
        String res = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < pattern.length(); i++) {
            map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i), 0) + 1);
        }

        int need = map.size();

        int j = 0, i = 0, len = str.length();

        while (j < len) {

            if(map.containsKey(str.charAt(j))) {
                map.put(str.charAt(j), map.get(str.charAt(j))-1);
                if(map.get(str.charAt(j)) == 0) need--;
            }

            while (need == 0) {

                res = str.substring(i, j+1);

                if(map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), map.get(str.charAt(i))+1);
                    if(map.get(str.charAt(i)) > 0) need++;
                }

                i++;
            }
            j++;
        }

        return res;
    }
}
