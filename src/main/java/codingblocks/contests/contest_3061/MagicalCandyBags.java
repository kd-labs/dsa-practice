package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class MagicalCandyBags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();
        while(tcs-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] candies = new int[N];

            for(int i = 0 ; i < N ; i++) {
                candies[i] = sc.nextInt();
            }

            int res = maxCandies(candies, K);

            System.out.println(res);
        }
    }

    private static int maxCandies(int[] candies, int k) {
        int res = 0;
        for(int i = 0 ; i < k ; i++) {
            int maxIdx = getMaxIdx(candies);
            res += candies[maxIdx];
            candies[maxIdx] = (int) Math.floor(candies[maxIdx]/2);
        }
        return res;
    }

    private static int getMaxIdx(int[] candies) {
        int maxIdx = 0;
        for(int i = 1 ; i < candies.length ; i++) {
            if(candies[i] > candies[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
