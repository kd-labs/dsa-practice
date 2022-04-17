package codingblocks.lec6;

import java.util.Scanner;

public class DecToOctal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();

        int oct = decToOct(dec);
        System.out.println(oct);
    }

    private static int decToOct(int dec) {
        int oct = 0;

        for(int i = 0 ; dec > 0 ; dec = dec / 8, i++) {
            oct += dec % 8 * Math.pow(10, i);
        }

        return oct;
    }
}
