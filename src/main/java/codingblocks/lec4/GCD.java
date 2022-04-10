package codingblocks.lec4;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = calculateGCD(a, b);
        System.out.println(gcd);
    }

    private static int calculateGCD(int dividend, int divisor) {
        int rem;

        while (dividend%divisor != 0) {
           rem = dividend%divisor;
           dividend = divisor;
           divisor = rem;
        }
        return divisor;
    }
}
