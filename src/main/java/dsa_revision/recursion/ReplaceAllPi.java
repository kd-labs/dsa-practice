package dsa_revision.recursion;

import java.util.Scanner;

public class ReplaceAllPi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tcs = scanner.nextInt();

        for(int i = 0 ; i < tcs ; i++) {
            String str = scanner.next();
            System.out.println(replaceAllPi(str, 0));
        }
    }

    public static String replaceAllPi(String str, int idx) {

        // Base Case
        if(idx == str.length()-1) return str;

        // Recursive Case
        String s = null;
        final String NUM_PI = "3.14";
        if(str.substring(idx,idx+2).equalsIgnoreCase("pi")) {
            s = replaceAllPi(str, idx+2);
            s = s.substring(0, idx) + NUM_PI + s.substring(idx+2);
            return s;
        } else {
            return replaceAllPi(str, idx+1);
        }
    }
}
