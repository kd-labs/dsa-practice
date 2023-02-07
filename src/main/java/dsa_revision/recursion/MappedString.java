package dsa_revision.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MappedString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();

        List<String> mappedStrings = new ArrayList<String>();

        mappedString(ip, "", mappedStrings);

        Collections.sort(mappedStrings);

        for (String mappedString : mappedStrings) {
            System.out.println(mappedString);
        }
    }

    private static void mappedString(String ip, String op, List<String> mappedStrings) {

        // Base Case : positive
        if(ip.length() == 0) {
            mappedStrings.add(op);
            return;
        }

        for(int i = 0 ; i < ip.length() ; i++) {

            // get the number from the input string
            int codePoint = Integer.parseInt(ip.substring(0, i + 1));

            if(codePoint > 26) break; // if number is greater than 26 then 64+27 = 91 which is beyond ascii 'Z'
            String newOp = op + (char) (64+codePoint);
            // get the new input string from the next character after i
            String newIp = ip.substring(i+1);

            mappedString(newIp, newOp, mappedStrings);

        }
    }
}
