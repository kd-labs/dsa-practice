package codingblocks.strings;

import com.sun.org.apache.xpath.internal.objects.XStringForChars;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean isPalindrome(String str) {

        int lo = 0, hi = str.length()-1;
        while(lo <= hi) {
            if(str.charAt(lo) != str.charAt(hi)) return false;
            lo++;
            hi--;
        }
        return true;
    }
}
