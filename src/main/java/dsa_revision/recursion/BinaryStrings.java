package dsa_revision.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tcs = scanner.nextInt();

        for(int i = 0 ; i < tcs ; i++) {

            String str = scanner.next();

            List<String> res = new ArrayList<>();
            generateBinaryString(str, 0, res);

            for (String binaryString : res) {
                System.out.print(binaryString + " ");
            }
            System.out.println();
        }
    }

    public static void generateBinaryString(String str, int idx, List<String> res) {

        // Base Case : when we have reached the end of string
        if(idx == str.length()) {
            res.add(str);
            return;
        }

        // Recursive Case
        if(str.charAt(idx) != '?') { // when character at idx is not ?, then send the same string with next idx
            generateBinaryString(str, idx+1, res);
        } else {
            // replace ? once with 0 and call recursively for next index
            generateBinaryString(str.substring(0, idx) + "0" + str.substring(idx+1), idx+1, res);
            // replace ? once with 1 and call recursively for next index
            generateBinaryString(str.substring(0, idx) + "1" + str.substring(idx+1), idx+1, res);
        }
    }
}
