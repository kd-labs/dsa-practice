package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class DifferenceInAsciiCodes {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String res = asciiDiff(str);
        System.out.println(res);
    }

    private static String asciiDiff(String str) {
        StringBuilder res = new StringBuilder();

        res.append(Character.toString(str.charAt(0)));
        for(int i = 1; i < str.length() ; i++) {
            res.append((str.charAt(i) - str.charAt(i-1)) + Character.toString(str.charAt(i)));
        }
        return res.toString();
    }
}
