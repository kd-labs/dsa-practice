package track.java.advanced;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibUntil = Integer.parseInt(sc.nextLine());
        System.out.println(isPrime(fibUntil));
    }

    private static boolean isPrime(int n) {
        BigInteger.valueOf(n).nextProbablePrime().intValue();
        return BigInteger.valueOf(n).isProbablePrime(1);
    }

    private static BigInteger fib(int n) {
        BigInteger res = null;
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;

        for(int i = 3 ; i <= n ; i++) {
            res = a.add(b);
            a = b;
            b = res;
        }

        return b;
    }
}
