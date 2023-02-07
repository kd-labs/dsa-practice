package dsa_revision.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DictionaryOrderLarger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        List<String> res = new ArrayList<>();

        dictionaryOrderLarger(input, "", input, res);

        Collections.sort(res);

        for (String re : res) {
            System.out.println(re);
        }
    }

    private static void dictionaryOrderLarger(String ip, String op, String original, List<String> res) {

        // Base case
        if(ip.length() == 0) {
            if(op.compareToIgnoreCase(original) > 0) res.add(op);
            return;
        }

        // Recursive Case
        for(int i = 0 ; i < ip.length() ; i++) {
            String newOp = op + ip.charAt(i);
            String newIp = ip.substring(0, i) + ip.substring(i+1);
            dictionaryOrderLarger(newIp, newOp, original, res);
        }
    }
}
