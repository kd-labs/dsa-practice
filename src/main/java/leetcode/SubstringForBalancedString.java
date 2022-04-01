package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SubstringForBalancedString {

    public static void main(String[] args) {
//        String s = "WWEQERQWQWWRWWERQWEQ";
//        String s = "QQWE";
        String s = "QQQW";

        int res = minWindowForBalancedSubstring(s);
        System.out.println(res);
    }

    private static int minWindowForBalancedSubstring(String s) {
        int res = s.length(), n = s.length(), need = n/4, end=0, start=0;
        char c;

        int[] charCount = new int[4];
        HashMap<Character, Integer> extraChars = new HashMap<>();

        // 1. Count the occurrences of each character and store in array
        for(int i = 0 ; i < n ; i++) {
            c = s.charAt(i);
            extraChars.put(c, extraChars.getOrDefault(c, 0) + 1 );
        }

        boolean flag = true;

        int count = 0;
        // 2. Calculate the number of excess characters above needed character i.e. s/4
        for (Map.Entry<Character, Integer> e : extraChars.entrySet()) {
            // Handle case when all chars are in required quantity
            if(e.getValue() != need) flag = false;
            extraChars.put(e.getKey(), Math.max(0, extraChars.get(e.getKey()))-need);
            if(extraChars.get(e.getKey()) > 0) count++;
        }

        // Early return if all characters have size/4 occurrences
        if(flag) return 0;

        // sliding window begins
        while(end < n) {

            c = s.charAt(end);
            extraChars.put(c, extraChars.get(c)-1);
            if(extraChars.get(c) == 0) count--;

            while(count == 0 ) {

                res = Math.min(res, end+1-start);
                c = s.charAt(start);
                extraChars.put(c, extraChars.get(c)+1);
                if(extraChars.get(c) > 0) count++;
                start++;
            }

            end++;
        }

        return res;
    }


}
