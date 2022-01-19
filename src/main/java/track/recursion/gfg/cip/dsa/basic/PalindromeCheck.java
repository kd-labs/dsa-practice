package track.recursion.gfg.cip.dsa.basic;

public class PalindromeCheck {

    public static void main(String[] args) {
        String tc1 = "abbcbba";
        String tc2 = "abba";
        String tc3 = "geeks";

        System.out.printf("%s is palindrome ? %b\n", tc1, isPalindrome(tc1));
        System.out.printf("%s is palindrome ? %b\n", tc2, isPalindrome(tc2));
        System.out.printf("%s is palindrome ? %b\n", tc3, isPalindrome(tc3));
    }

    private static boolean isPalindrome(String str) {
        //Base Case
        if(str.length() == 0 || str.length() == 1) return true;

        return str.charAt(0) == str.charAt(str.length()-1) ? isPalindrome(str.substring(1, str.length()-1)) : false;
    }
}
