package codingblocks.contests.contest_3061;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeepakAndPrimes {

    private static List<Integer> primes = new ArrayList<Integer>();

    public static void main(String args[]) {
        primeSieve();
        System.out.println("Sieve completed");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nthPrime = primes.get(n-1);
        System.out.println(nthPrime);

    }

    private static void primeSieve() {

        boolean[] primesArr = new boolean[100];
        Arrays.fill(primesArr, true);

        primesArr[0] = primesArr[1] = false;

        for(int i = 2 ; i*i <= primesArr.length ; i++) {

            if(primesArr[i]) {
                for(int k = i*i ; k < primesArr.length ; k = k + i) {
                    primesArr[k] = false;
                }
            }
        }

        // Iterate through the primesArr to get all primes and store in primes
        for(int i = 2 ; i < primesArr.length ; i++) {
            // if primesArr[i] true then add i in primes list
            if(primesArr[i]) {
                primes.add(i);
            }
        }

        primes.stream().limit(20).forEach(System.out::println);

    }
}
