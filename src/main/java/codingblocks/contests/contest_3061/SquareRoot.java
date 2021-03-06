package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();

        long res = squareRoot(a);
        System.out.println(res);
    }

    /*
        Idea :
            Applying Binary Search to find the mid element and checking it squaring that is equal to target.
            if yes, then return mid immediately
            else, if mid^2 < target, them mid might be a probable ans and store it
     */
    private static long squareRoot(long a) {
        if(a == 0 || a == 1) return a;
        long lo = 1, hi = a/2, mid, res=0;
        while(lo <= hi) {
            mid = lo + (hi-lo)/2;
            if(Math.pow(mid, 2) == a) return mid;
            else if(Math.pow(mid, 2) < a) {
                res = mid;
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }

        return res;
    }
}