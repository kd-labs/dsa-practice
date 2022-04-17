package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        while (sum >= 0 ) {
            System.out.println(n);
            n = sc.nextInt();
            sum += n;
        }

    }
}
