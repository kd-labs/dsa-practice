package grokking.coding.interview.patterns.slidingwindow;

import java.util.HashMap;

public class PermutationInAString {

    public static void main(String[] args) {
        String str = "aaacb";
        String pattern = "abc";

        System.out.println(isPatternPresent(str, pattern));
    }

    private static boolean isPatternPresent(String str, String pattern) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < pattern.length() ; i++) {
            map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i), 0) + 1);
        }
        int count = map.size();

        int j = 0, i = 0, len = str.length();

//        String str = "aaacb";   map = {a : 1, b : 1, c : 1}
        while (j < len) {

            if(pattern.length() > len) return false;

            if (map.containsKey(str.charAt(j))) {
                map.put(str.charAt(j), map.get(str.charAt(j))-1);
                if(map.get(str.charAt(j)) ==0) count--;
            }

            if(j+1-i < pattern.length()) {
                j++;
            } else if ((j+1-i) == pattern.length()) {

                if(count == 0) return true;

                if(map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                    if(map.get(str.charAt(i)) > 0) count++;
                }

                i++;
                j++;
            }

        }
        return false;
    }
}
