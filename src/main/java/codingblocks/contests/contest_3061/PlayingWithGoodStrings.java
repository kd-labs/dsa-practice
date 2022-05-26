package codingblocks.contests.contest_3061;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlayingWithGoodStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int res = maxVowelSubstring(str);
        System.out.println(res);
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
