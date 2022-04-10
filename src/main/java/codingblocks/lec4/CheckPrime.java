package codingblocks.lec4;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        boolean isPrime = checkPrime(n);
        System.out.println(String.format("%d is %s", n , isPrime ? "prime" : "not prime"));
    }

    private static boolean checkPrime(int n) {

        for(int i = 2; i < (Math.sqrt(n) + 1) ; i++) {
            if(n % i == 0) return false;
        }

        return true;
    }
}
