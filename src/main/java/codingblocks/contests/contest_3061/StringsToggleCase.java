package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class StringsToggleCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String res = toggleCase(s);
        System.out.println(res);
    }

    private static String toggleCase(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++) {
           res.append(toggle(s.charAt(i)));
        }
        return res.toString();
    }

    private static String toggle(char ch) {
        if(Character.isUpperCase(ch)) return String.valueOf(Character.toLowerCase(ch));
        else return String.valueOf(Character.toUpperCase(ch));
    }
}
