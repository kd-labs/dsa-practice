package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinations {

    private List<String> keypad = Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");

    public List<String> letterCombinations(String digits) {

        // Create the result container list
        List<String> res = new ArrayList<>();

        // call fn with idx = 0
        letterCombinations(digits, 0, "", res);

        return res;
    }

    public void letterCombinations(String digits, int digitIdx, String str, List<String> res) {

        // Base Case
        if(digitIdx == digits.length()) {
            if(str.length() != 0) // if str is empty then don't add in final result
                res.add(str);
            return;
        }

        // Recursive Case
        int k = Integer.parseInt(String.valueOf(digits.charAt(digitIdx))); // parse the digit character into integer
        String letters = keypad.get(k); // get the corresponding string for the integer from the keypad array
        for(int i = 0 ; i < letters.length(); i++) {
            // Recursion call to the next level with digitIdx to next character
            letterCombinations(digits, digitIdx+1, str.concat(String.valueOf(letters.charAt(i))), res);
        }
    }
}
