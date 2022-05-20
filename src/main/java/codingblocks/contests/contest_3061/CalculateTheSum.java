package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        int ops = sc.nextInt();
        int res = calculateSum(arr, ops, sc);
        System.out.println(res);
    }

    private static int calculateSum(int[] arr, int ops, Scanner sc) {
        while(ops-- > 0) {
            int[] currArr = new int[arr.length];
            int x = sc.nextInt(), idx;

            for(int i = 0 ; i < arr.length ; i++) {
               idx = i-x;
               if(idx < 0) idx += arr.length;
               currArr[i] = arr[i] + arr[idx];
            }
            arr = currArr;
        }
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum % 1000000007;

    }
}
