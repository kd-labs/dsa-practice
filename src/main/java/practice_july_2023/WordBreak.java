package practice_july_2023;

import java.util.List;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {

        return wordBreak(s, wordDict, "");

    }

    public boolean wordBreak(String s, List<String> wordDict, String currStr) {

        // Base Case
        if(currStr.length() > s.length()) return false;
        else if (currStr.length() == s.length() && currStr.equalsIgnoreCase(s)) return true;

        boolean ansFound = false;
        for(String word : wordDict) {
            if(!ansFound) {
                ansFound = wordBreak(s, wordDict, currStr+word);
            }
        }
        return ansFound;
    }
}
