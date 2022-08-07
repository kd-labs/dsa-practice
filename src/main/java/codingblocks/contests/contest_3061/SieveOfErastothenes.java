package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class SieveOfErastothenes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }

        }
    }

    private static boolean isPrime(int n) {

        if(n == 2 || n == 3) return true;

        if(n == 1 || n % 2 == 0 || n % 3 == 0) return false;


        for(int i = 5; Math.pow(i, 2) <= n; i = i + 6) {

            if(n % i == 0 || n % (i+2) == 0) return false;

        }

        return true;
    }
}
