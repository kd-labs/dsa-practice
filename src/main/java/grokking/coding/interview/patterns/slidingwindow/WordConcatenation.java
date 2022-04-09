package grokking.coding.interview.patterns.slidingwindow;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordConcatenation {

    public static void main(String[] args) {

//        String str = "catcatfoxfox";
        String str = "catfoxcat";
        String[] pattern = {"cat", "fox"};
        List<Integer> res = wordConcatenation(str, pattern);
        System.out.println(res);
    }

    private static List<Integer> wordConcatenation(String str, String[] pattern) {

        List<Integer> res = new ArrayList<>();
        HashMap<String, Integer> wordFreq = new HashMap<>();
        for(String s : pattern) {
            wordFreq.put(s, wordFreq.getOrDefault(s, 0) + 1);
        }

        int i = 0, len = str.length(), words = pattern.length, wordLength = pattern[0].length();

        while (i <= (len-words*wordLength)) {

            HashMap<String, Integer> wordsSeen = new HashMap<>();

            int j = 0;
            while (j < words) {

                int wordStartIndex = i + j*wordLength;

                String word = str.substring(wordStartIndex, wordStartIndex + wordLength);

                if(!wordFreq.containsKey(word)) break;

                wordsSeen.put(word, wordsSeen.getOrDefault(word, 0) + 1);

                if(wordsSeen.get(word) > wordFreq.get(word)) break;

                if(j+1 == words) res.add(i);

                j++;
            }

            i++;
        }

        return res;
    }
}
