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

    /*
        Prime Sieve Algorithm
     */
    private static void primeSieve() {

        // 1. Create boolean array
        boolean[] primesArr = new boolean[100];

        // 2. Fill boolean array with true value
        Arrays.fill(primesArr, true);

        // 3. Initialize 0 and 1 as false i.e. nos 0 and 1 are not prime
        primesArr[0] = primesArr[1] = false;

        // 4. start p = 2 and while p <= sqrt(primesArr.length) and incr p by 1
        for(int i = 2 ; i*i <= primesArr.length ; i++) {

            // if primesArr is true then take that as starting point
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
