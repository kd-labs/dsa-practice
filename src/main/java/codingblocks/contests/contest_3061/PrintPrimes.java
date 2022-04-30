package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class PrintPrimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPrimes(n);
    }

    private static void printPrimes(int n) {

        for(int i = 2 ; i <= n ; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int i) {

        if(i <= 3) return true;

        if(i % 2 == 0 || i % 3 == 0) return false;

        for(int k = 5 ; k * k <= i ; k = k + 6) {
           if(i % k == 0 || i % (k+2) == 0) return false;
        }
        return true;
    }
}
