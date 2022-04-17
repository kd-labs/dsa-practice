package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class InverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = inverseNumber(n);
        System.out.println(res);
    }

    private static int inverseNumber(int n) {
        int res = 0;

        for(int i = 1; n > 0; n = n/10, i++) {
            res += i * Math.pow(10, n%10-1);
        }

        return res;
    }
}
