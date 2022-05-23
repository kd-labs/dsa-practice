package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String res = compressString(str);
        System.out.println(res);
    }

    private static String compressString(String str) {

        String res = "";
        int i = 0, j=0;
        int count = 0;
        while(j < str.length()) {

            if(str.charAt(j) == str.charAt(i)) {
                count++;
                j++;
            } else {
                res = res + str.charAt(i) + count;
                i = j;
                count=0;
            }

        }
        res = res + str.charAt(i) + count;

        return res;
    }
}