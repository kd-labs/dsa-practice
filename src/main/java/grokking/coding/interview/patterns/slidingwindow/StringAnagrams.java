package grokking.coding.interview.patterns.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StringAnagrams {

    public static void main(String[] args) {
        String str = "abbcabc";
        String pattern = "abc";
        List<Integer> patternPresent = isPatternPresent(str, pattern);

        for (int i : patternPresent) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static List<Integer> isPatternPresent(String str, String pattern) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] res = new int[0];
        for(int i = 0 ; i < pattern.length() ; i++) {
            map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i), 0) + 1);
        }
        int count = map.size();

        int j = 0, i = 0, len = str.length();

//        String str = "aaacb";   map = {a : 1, b : 1, c : 1}
        while (j < len) {

            if(pattern.length() > len) list.toArray();

            if (map.containsKey(str.charAt(j))) {
                map.put(str.charAt(j), map.get(str.charAt(j))-1);
                if(map.get(str.charAt(j)) ==0) count--;
            }

            if(j+1-i < pattern.length()) {
                j++;
            } else if ((j+1-i) == pattern.length()) {

                if(count == 0) {
                    list.add(i);
                }

                if(map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                    if(map.get(str.charAt(i)) > 0) count++;
                }

                i++;
                j++;
            }

        }
        return list;
    }
}
