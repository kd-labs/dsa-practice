package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> res = new HashMap<>();

        // calculate the sum of ascii value of chars and add entry in res map where sum of ascii of characters is key and
        // value is arraylist and contains word having same ascii sum values i.e. they are anagrams
        for(String str : strs) {
            String key = generateKey(str);
            res.putIfAbsent(key, new ArrayList());
            List<String> list = res.get(key);
            list.add(str);
        }

        return new ArrayList(res.values());
    }

    private static String generateKey(String word) {
        int[] freq = new int[26];
        for(int i = 0 ; i < word.length() ; i++) {
            freq[word.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < freq.length ; i++) {
            sb.append(freq[i] + " ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        List<List<String>> lists = new GroupAnagrams().groupAnagrams(new String[]{"bdddddddddd", "bbbbbbbbbbc"});
        for(List<String> ll : lists) {
            System.out.println(ll);
        }
    }
}
