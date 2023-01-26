package dsa_revision.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AsciiSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        List<String> res = new ArrayList();

        asciiSubsequence(str, 0, "", res);

        for (String re : res) {
            System.out.print(re + " ");
        }
        System.out.println();
        System.out.println(res.size());
    }

    public static void asciiSubsequence(String str, int idx, String s, List<String> res) {

        // Base Case
        if(idx == str.length()) {
            res.add(s);
            return;
        }

        // Recursive Case
        asciiSubsequence(str, idx+1, s, res); // No select
        asciiSubsequence(str, idx+1, s + str.charAt(idx), res); // select as char
        asciiSubsequence(str, idx+1, s + ((int)str.charAt(idx)), res); // select as int
    }
}
