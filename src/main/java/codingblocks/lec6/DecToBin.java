package codingblocks.lec6;

import java.util.Scanner;

public class DecToBin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();

        int bin = decToBin(dec);
        System.out.println(bin);

    }

    private static int decToBin(int dec) {

        int bin = 0;
        for(int i = 0 ; dec > 0; dec = dec/2, i++) {
            bin += dec % 2 * Math.pow(10, i);
        }
        return bin;
    }
}
