package track.recursion.aditya.verma;

import java.util.Locale;

public class PermutationWithCaseChange {

    public static void main(String[] args) {

        String ip = "ab";
        permutationWithCaseChange(ip, "");

    }

    private static void permutationWithCaseChange(String ip , String op) {

        if(ip.length() == 0) {
            System.out.println(op);
            return;
        }

        String substring = ip.substring(1);
        String firstChar = ip.substring(0, 1);
        permutationWithCaseChange(substring, op + firstChar.toLowerCase());
        permutationWithCaseChange(substring, op + firstChar.toUpperCase());
    }
}
