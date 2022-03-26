package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountSubstringContainingAtLeastCharacters {

    public static void main(String[] args) {
        String s = "abcabc";
//        String s = "aaacb";
//        String s = "abc";
//        String s = "aa";


//        int res = countSubstringContainingAtLeastCharacters(s);
        int res = countSubstringContainingAtLeastCharactersOptimized(s);
        System.out.println(res);

    }
    private static int countSubstringContainingAtLeastCharactersOptimized(String s)  {
        int i=0; // left pointer
        int j=0; // right pointer
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        resetMap(map);
        int need = map.size();
        int length = s.length();

        while(j < length) {
            if(map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j)) == 0) need--;
            }
            while(need == 0) {

                res += length-j;

                if(map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                    if(map.get(s.charAt(i)) > 0) need++;
                }
                i++;
            }
            j++;
        }

        return res;
    }

    // Brute Force
    private static int countSubstringContainingAtLeastCharacters(String s)  {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int length = s.length();
        for(int i = 0; i < length; i++) {

            int j;
            resetMap(map);
            int need = map.size();

            for(j = i; j < length; j++) {
                map.put(s.charAt(j), map.get(s.charAt(j))-1 );
                if(map.get(s.charAt(j)) == 0) need--;
                if(need == 0) {
                    break;
                }
            }
            res += length - j;

        }

        return res;
    }

    private static void resetMap(HashMap<Character, Integer> map) {

        map.clear();

        map.put('a', 1);
        map.put('b', 1);
        map.put('c', 1);
    }
}
