package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class FibonacciPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);

    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int nums = row;
        int a = 0, b = 0, c;

        while(row <= rows) {
            if (row == 1) {
                System.out.print(b++ +"\t");
            } else {
                int num = 1;
                while( num <= nums) {
                    System.out.print(b +"\t");
                    c = b + a;
                    a = b;
                    b=c;

                    num++;
                }

            }

            System.out.println();
            row++;
            nums = row;
        }
    }
}
