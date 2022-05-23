package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class MaximumSumPathInTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] arr1 = new int[m];
            int[] arr2 = new int[n];

            for(int i = 0 ; i < m ; i++) {
                arr1[i] = sc.nextInt();
            }

            for(int i = 0 ; i < n ; i++) {
                arr2[i] = sc.nextInt();
            }

            int res = maxSumPathTwoArrays(arr1, arr2);
            System.out.println(res);
        }
    }

    private static int maxSumPathTwoArrays(int[] m, int[] n) {
        int sum = 0;

        int i = 0, j = 0;
        int s1 = i, s2 = j;
        while(i < m.length && j < n.length) {
            if(m[i] == n[j]) {
                sum += Math.max(getSum(s1, i, m), getSum(s2, j, n));
                i++;
                j++;
                s1 = i; s2 = j;
            } else if(m[i] < n[j]) {
                i++;
            } else {
                j++;
            }
        }
        if(i == m.length || j == n.length) {
            sum += Math.max(getSum(s1, m.length-1, m), getSum(s2, n.length-1, n));
        }

        return sum;
    }

    private static int getSum(int s, int i, int[] arr) {
        int sum = 0 ;

        while (s <= i) {
            sum += arr[s];
            s++;
        }

        return sum;
    }
}