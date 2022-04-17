package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class PrintSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        printPattern(n1, n2);
    }

    private static void printPattern(int n1, int n2) {
        int i = 1, m = 1, k;
        while (i <= n1) {

            k = 3 * m++ + 2;
            if(k % n2 != 0) {
                System.out.println(k);
                i++;
            }

        }
    }
}
