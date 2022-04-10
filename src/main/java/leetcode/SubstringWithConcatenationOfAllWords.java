package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {

    public static void main(String[] args) {
//        String s = "barfoothefoobarman";
//        String[] words = {"foo", "bar"};
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","good"};

        List<Integer> res = substringWithConcatenationOfAllWords(s, words);
        System.out.println(res);
    }

    private static List<Integer> substringWithConcatenationOfAllWords(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int i = 0, len = s.length(), wordsCount = words.length, wordLen = words[0].length();
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        while (i <= (len-(wordsCount * wordLen))) {

            int j = 0;
            HashMap<String, Integer> seen = new HashMap<>();
            while (j < wordsCount) {

                int wordStartIdx = i + j * wordLen;

                String word = s.substring(wordStartIdx, wordStartIdx + wordLen);

                if(!map.containsKey(word)) break;

                seen.put(word, seen.getOrDefault(word, 0) + 1);

                if(seen.get(word) > map.get(word)) break;

                if(j+1 == wordsCount) res.add(i);

                j++;
            }

            i++;
        }

        return res;
    }
}
