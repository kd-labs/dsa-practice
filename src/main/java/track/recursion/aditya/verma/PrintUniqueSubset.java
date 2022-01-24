package track.recursion.aditya.verma;

import java.util.HashSet;

public class PrintUniqueSubset {

    private static final HashSet<String> res = new HashSet<>();

    public static void main(String[] args) {

        String ip = "aab";

        printUniqueSubset(ip, "");

        res.forEach(System.out::println);
    }

    public static void printUniqueSubset(String ip , String op) {

        if(ip.length() == 0) {
            res.add(op);
            return;
        }

        String substring = ip.substring(1);

        printUniqueSubset(substring, op);
        printUniqueSubset(substring, op + ip.charAt(0));

    }
}
