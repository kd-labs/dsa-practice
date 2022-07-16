package codingblocks.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        List<String> res = new ArrayList<>();
        stringPermutation(ip, res, "");

        res.forEach(str -> System.out.println(str));
    }


    private static void stringPermutation(String ip, List<String> res, String op) {

        // Base Case
        if(ip.length() == 0) {
            res.add(op);
            return;
        }

        // recursive case
        for(int i = 0 ; i < ip.length() ; i++) {
            char c = ip.charAt(i);
            String newIp = ip.substring(0, i) + ip.substring(i+1);
            stringPermutation(newIp, res, op + c);
        }
    }
}
