package track.recursion.aditya.verma;

import java.util.ArrayList;

public class PrintNBitBinaryWithMore1s {

    private static final ArrayList<String> res = new ArrayList<>();

    public static void main(String[] args) {

        int n = 5;
        printNBit(1, 0, n-1, "1");

        res.forEach(System.out::println);

    }

    private static void printNBit(int ones, int zeroes, int n, String op) {

        /*
            Base Case
         */
        if(n == 0 ) {
            res.add(op);
            return;
        }

        printNBit(ones++, zeroes, n-1, op+1);

        if(zeroes < ones) {
            printNBit(ones, zeroes++, n-1, op+0);
        }

    }
}
