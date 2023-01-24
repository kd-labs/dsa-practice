package dsa_revision.recursion;

import java.util.Scanner;

public class CountRemoveReplaceHi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println(countHi(s, 0));
        System.out.println(removeHi(s, 0));
        System.out.println(replaceHi(s, 0));
    }

    private static String replaceHi(String s, int idx) {

        // base case : negative
        if(idx >= s.length()-1) return s;

        // base case : positive
        if(s.substring(idx, idx+2).equalsIgnoreCase("hi")) {
            String s1 = replaceHi(s, idx+2);
            return s1.substring(0, idx) + "bye" + s1.substring(idx+2);
        }

        return replaceHi(s, idx+1);
    }

    private static String removeHi(String s, int idx) {

        // base case : negative
        if(idx >= s.length()-1) return s;

        // base case : positive
        if(s.substring(idx, idx+2).equalsIgnoreCase("hi")) {
            String s1 = removeHi(s, idx+2);
            return s1.substring(0, idx) + s1.substring(idx+2);
        }

        return removeHi(s, idx+1);
    }

    private static int countHi(String s, int idx) {

        // base case : negative
        if(idx >= s.length()-1) return 0;

        // base case : positive
        if(s.substring(idx, idx+2).equalsIgnoreCase("hi")) {
            int a = countHi(s, idx+2);
            return a+1;
        }

        return countHi(s, idx+1);
    }
}
