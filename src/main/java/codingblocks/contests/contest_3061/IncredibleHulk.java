package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class IncredibleHulk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // # of TCs
        int tcs = sc.nextInt();

        while(tcs-- > 0) {
            int n = sc.nextInt();

            int res = minSteps(n);
            System.out.println(res);

        }
    }

    private static int minSteps(int n) {

        int steps = 0;

        while (n > 0) {
            steps++;
            n = n & (n-1);
        }

        return steps;
    }
}
