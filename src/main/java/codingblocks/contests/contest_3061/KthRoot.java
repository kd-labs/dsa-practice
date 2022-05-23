package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class KthRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long res = kthRoot(n, k);
            System.out.println(res);

            tc--;
        }

    }

    private static long kthRoot(long n, long k) {
        long lo = 1, hi = n, mid, res=0;

        while(lo <= hi) {
           mid = lo + (hi-lo)/2;

           if(Math.pow(mid, k) == n) return mid;
           else if(Math.pow(mid, k) < n) {
               res = mid;
               lo = mid+1;
           } else {
               hi = mid-1;
           }
        }
        return res;
    }
}