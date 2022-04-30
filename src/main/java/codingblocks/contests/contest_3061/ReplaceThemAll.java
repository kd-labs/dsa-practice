package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class ReplaceThemAll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();

        long addValue = calculateAddValue(l);
        System.out.println(l + addValue);
    }

    private static long calculateAddValue(long l) {
        long addValue = 0;
        int place = 1;
        if(l == 0) return 5;

        // l = 1020
        // addValue = 505
        while(l != 0) {

            long digit =  (l % 10);
            if(digit == 0) addValue += 5 * place;

            place = place * 10;
            l = l / 10;
        }
        return addValue;
    }
}
