package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class StringsOddEvenCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String res = changeString(s);
        System.out.println(res);
    }

    private static String changeString(String s) {
        StringBuilder res = new StringBuilder();
        char[] chars = s.toCharArray();

        for(int i = 0 ; i < chars.length ; i++) {
            if(i % 2 == 0) {
                res.append(Character.toString((char)(97 + ((chars[i] - 97 + 1 + 26) % 26))));
            } else {
                res.append(Character.toString((char)(97 + ((chars[i] - 97 - 1 + 26) % 26))));
            }
        }

        return res.toString();
    }
}
