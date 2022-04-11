package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPascalTriangle(n);
    }

    /*
        Observation:
            - Every row of pascal triangle starts with 1 i.e. nC0
        Concept Used:
            - nCr
            - nCr+1 = (nCr * (n-r))/r+1
                where:
                    n = row#
                    r = col#
                meaning if we have calculated value for nth row and rth col, then to calculate for next col in same row,
                we can use the formula and not calculate nCr+1 from scratch.
     */

    private static void printPascalTriangle(int n) {
        int rows = n;
        int row = 0;
        int nos = 1;

        while (row < rows) {

            int i = 0;
            int val = 1;
            while (i < nos) {
                System.out.print(val+"\t");
                val = (val*(row-i)/(i+1)); // nCr+1 = ((nCr * (n-r))/r+1)
                i++;
            }

            System.out.println();
            row++;
            nos++;
        }
    }
}
