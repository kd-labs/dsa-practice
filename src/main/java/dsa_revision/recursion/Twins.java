package dsa_revision.recursion;

import java.util.Scanner;

public class Twins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(countTwins(str, 0));
    }

    public static int countTwins(String str, int idx) {

        // base case
        if(idx >= str.length()-2) return 0;

        // Recursive Case
        if(str.charAt(idx) == str.charAt(idx+2)) {
            // twin exists
            return 1 + countTwins(str, idx+1);
        } else {
            return countTwins(str, idx+1);
        }
    }
}
