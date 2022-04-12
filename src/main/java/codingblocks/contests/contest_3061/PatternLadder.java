package codingblocks.contests.contest_3061;

import java.util.Scanner;

/*
Pattern:
1
2 3
4 5 6
7 8 9 10
 */
public class PatternLadder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int val = 1;

        while(row <= rows) {

            int i = 1;
            while(i <= row) {
                System.out.print(val++ + "\t");
                i++;
            }

            System.out.println();
            row++;
        }
    }
}
