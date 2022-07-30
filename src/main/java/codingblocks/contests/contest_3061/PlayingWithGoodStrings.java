package codingblocks.contests.contest_3061;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlayingWithGoodStrings {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//
//        int res = maxVowelSubstring(str);
//        System.out.println(res);

        String s1 = null, s2 = null;

        if(s1.equals(s2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    private static int maxVowelSubstring(String str) {
        int res = 0;
        int count = 0;
        List<Character> characters = Arrays.asList('a', 'e', 'i', 'o', 'u');

        for(int i = 0 ; i < str.length() ; i++) {
            if(characters.contains(str.charAt(i))) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 0;
            }
        }

        return res;
    }
}
