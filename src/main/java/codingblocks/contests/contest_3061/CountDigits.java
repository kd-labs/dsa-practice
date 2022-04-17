package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();

        int res = countDigits(num, digit);
        System.out.println(res);
    }

    private static int countDigits(int num, int digit) {
        int res = 0;

        while(num >0) {
            if(num % 10 == digit) res++;
            num = num/10;
        }

        return res;
    }
}
