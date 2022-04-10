package codingblocks.contests.contest_3061;

import java.util.Scanner;
/*
Pattern Rhombus:
		1
	2	3	2
3	4	5	4	3
	2	3	2
		1
 */
public class PatternRhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {

        int rows = 2*n;
        int row = 1;
        int spaces = n-1;
        int nos = 1;
        int val=1;

        while (row < rows) {

            int space = 1;
            while (space <= spaces) {
                System.out.print("\t");
                space++;
            }

            int no = 1;
            int p = val;
            while (no <= nos) {
                System.out.print(p+"\t");
                if(no <= nos/2) {
                    p++;
                } else {
                    p--;
                }

                no++;
            }

            space = 1;
            while (space <= spaces) {
                System.out.print("\t");
                space++;
            }

            if(row < n) {
                nos += 2;
                spaces -= 1;
                val++;
            } else {
                nos -= 2;
                spaces += 1;
                val--;
            }

            System.out.println();
            row++;
        }
    }
}
