package leetcode;

import java.util.Scanner;

public class Sqrtx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int res = mySqrt(a);
        System.out.println(res);
    }

    /*
        Idea :
            Applying Binary Search to find the mid element and checking it squaring that is equal to target.
            if yes, then return mid immediately
            else, if mid^2 < target, them mid might be a probable ans and store it
     */
    private static int mySqrt(int a) {
        if(a == 0 || a == 1) return a;
        int lo = 1, hi = a/2, mid, res=0;
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
