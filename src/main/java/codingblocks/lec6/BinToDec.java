package codingblocks.lec6;

import java.util.Scanner;

public class BinToDec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();

        while(tcs-- != 0) {
            int bin = sc.nextInt();
            int dec = binToDec(bin);
            System.out.println(dec);
        }
    }

    private static int binToDec(int bin) {
        int dec = 0;

        for(int i = 0; bin > 0; bin = bin / 10, i++) {
            dec += bin % 10 * Math.pow(2, i);
        }
        return dec;
    }
}
