package codingblocks.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPermutationII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        List<String> res = new ArrayList<>();

        stringPermutation(ip, "", res);

        res.forEach(System.out::println);

    }

    private static void stringPermutation(String ip, String op, List<String> res) {

        // Base Case
        if(ip.length() == 0) {
            res.add(op);
            return;
        }

        // Recursive Case
        for(int i = 0 ; i < ip.length() ; i++) {
            char c = ip.charAt(i);
            if(ip.substring(0, i).indexOf(c) != -1) continue;
            String newIp = ip.substring(0, i) + ip.substring(i+1);
            stringPermutation(newIp, op + c, res);
        }

    }
}
