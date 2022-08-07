package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class GenerateBinaryStrings {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();
        while(tcs-- > 0) {
            String str = sc.next();
            int len = str.length();
            generateBinaryString(str, 0, len);
        }

    }

    private static void generateBinaryString(String str, int idx, int len) {

        // Base Case
        if(idx == len) {
            System.out.print(str + " ");
            return;
        }

        if(str.charAt(idx) == '?') {
            // Recursive call for 0
            generateBinaryString(str.substring(0, idx) + "0" + str.substring(idx+1), idx+1, len);

            // Recursive call for 1
            generateBinaryString(str.substring(0, idx) + "1" + str.substring(idx+1), idx+1, len);
        } else {
            // Recursive call with nothing changed
            generateBinaryString(str, idx+1, len);
        }
    }
}
