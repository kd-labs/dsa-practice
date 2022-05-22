package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class DivisibleSubarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];

            for(int i = 0 ; i < size ; i++) {
                arr[i] = sc.nextInt();
            }

            int res = countDivisibleSubarrays(arr);
            System.out.println(res);
        }
    }

    /**
     *      Hint : Pigeon Hole Principle
     *      Algo :
     *          1. Calculate prefix array where element at index i is the sum of first i elements in input arr
     *          Logic :
     *             (b-a) % n = 0
     *             => b % n - a % n = 0
     *             => b%a = a%n
     *          2. Therefore, calculate the mod of each element in prefix array and store it in freq array of size n
     *             because mod n can range from 0 to n-1.
     *          3. For each element in frequency arr, calcualte number of ways selecting 2 out of freq[i] using combination
     *             formula i.e. nCr and add to sum
     *          4. return sum.
     */
    private static int countDivisibleSubarrays(int[] arr) {
        int n = 1000, sum = 0;
        int res = 0;
        long[] pigeonHole = new long[n];
        pigeonHole[0] = 1;
        for(int i = 0 ; i < arr.length ; i++) {
            sum = (sum + arr[i]) % n;
            if(sum < 0) sum += n;
            pigeonHole[sum]++;
        }
        for(int i = 0 ; i < n ; i++) {
            if(pigeonHole[i] < 2) continue;
            res += getCombination(pigeonHole[i], 2);
        }
        return res;
    }

    private static long getCombination(long n, int r) {
        return (n * (n-1))/2;
    }
}
