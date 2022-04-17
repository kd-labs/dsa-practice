package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class InvertedHourGlass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = 2*n;
        int row = 0;
        int spaces = 2*n+1;
        int nums = 0;

        while (row <= rows) {

            int val = n;
            int num = 1;
            while (num <= nums) {
                System.out.print(val-- + "\t");
                num++;
            }

            int space = 1;
            while (space <= spaces) {
                if(space == 1 || space == spaces) {
                    System.out.print(Math.abs(n-row)+"\t");
                } else {
                    System.out.print("\t");
                }
                space++;
            }

            num = 1;
            while (num <= nums) {
                System.out.print(++val + "\t");
                num++;
            }

            System.out.println();

            if(row < n) {
                spaces -= 2;
                nums++;
            } else {
                spaces += 2;
                nums--;
            }

            row++;
        }
    }
}
