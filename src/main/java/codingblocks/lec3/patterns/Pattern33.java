package codingblocks.lec3.patterns;

import java.util.Scanner;

public class Pattern33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 0;
        int spaces = n-1;
        int patterns = 0;
        int numPatternMax = n-1;

        while (row < rows) {

            // left loop
            int numPatternStart = n-row;
            int space = 1;

            while (space <= spaces) {
                System.out.print("  ");
                space++;
            }

            int pattern = 0;
            while (pattern < patterns) {
                System.out.print(numPatternStart + " ");
                numPatternStart++;
                pattern++;
            }

            System.out.print("0 ");

            // right loop
            pattern = 0;
            numPatternStart = n-1;
            while (pattern < patterns) {
                System.out.print(numPatternStart + " ");
                numPatternStart--;
                pattern++;
            }

            space = 1;
            while(space <= spaces) {
                System.out.print("  ");
                space++;
            }

            System.out.println();
            row++;
            patterns++;
            spaces--;
        }
    }
}
