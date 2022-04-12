package codingblocks.contests.contest_3061;

import java.util.Scanner;

/*
Pattern :
1										1
1	2								2	1
1	2	3						3	2	1
1	2	3	4				4	3	2	1
1	2	3	4	5		5	4	3	2	1
1	2	3	4	5	6	5	4	3	2	1
 */
public class PatternMountain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int spaces = 2*n-1;
        int nos = 0;

        while( row <= rows) {

            int val = 1;
            int no = 1;

            while(no <= nos/2) {
                System.out.print(val++ + "\t");
                no++;
            }

            int space = 1;
            while ( space <= spaces) {
                if(space == 1 || space == spaces) {
                    System.out.print(row + "\t");
                } else {
                    System.out.print("\t");
                }
                space++;
            }

            while(no <= nos) {
                System.out.print(--val + "\t");
                no++;
            }

            System.out.println();
            spaces -= 2;
            nos += 2;
            row++;
        }
    }
}
