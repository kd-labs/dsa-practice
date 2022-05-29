package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class CountPalindromicSubstrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int res = countPalindromicSubstrings(str);
        System.out.println(res);
    }

    private static int countPalindromicSubstrings(String str) {
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++) {
            for(int j = 0 ; j <= str.length() ; j++) {
                if(isPalindrome(str, i, j)) count++;
            }
        }

        return count;
    }

    private static boolean isPalindrome(String str, int i, int j) {
        int start = i, end = j;
        while (start < end) {
            if(str.charAt(start) != str.charAt(end)) return false;
        }
         return true;
    }
}
