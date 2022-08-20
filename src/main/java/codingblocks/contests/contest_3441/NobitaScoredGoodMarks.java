package codingblocks.contests.contest_3441;

import java.util.Scanner;

public class NobitaScoredGoodMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();

        while(tcs-- > 0) {

            int candles = sc.nextInt();
            int friends = sc.nextInt();

            int ans = Math.min(candles % friends, friends - (candles%friends));

            System.out.println(ans);
        }
    }
}
