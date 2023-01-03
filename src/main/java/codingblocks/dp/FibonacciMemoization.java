package codingblocks.dp;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciMemoization {

    private static int[] memoizationDS = null;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // initialize the memoization DS
        memoizationDS = new int[N+1];
        Arrays.fill(memoizationDS, -1);

        long start = System.nanoTime();
        int res = fib(N);
        long end = System.nanoTime();
        System.out.println(String.format("Fibonacci of %d is %d calculated in %ds", N, res, (end-start)));

    }

    /**
     *
     * @param n takes the integer input whose fibonacci is to calculate
     * @return integer value of fibonacci of n
     */
    public static int fib(int n) {
        /*
            In memoization i.e. momorizing the past in a data structure, we store the
            results of fibonacci of previously calculated inputs in array DS.
         */

        // Base Case
        if(n == 1 || n == 0) return n;

        // First check if input is already memoized
        if(memoizationDS[n] != -1) return memoizationDS[n];

        // Recursive Case
        int res = fib(n - 1) + fib(n - 2);
        // before returning the result to calling stack, memoize the result in DS
        memoizationDS[n] = res;
        return res;
    }
}
