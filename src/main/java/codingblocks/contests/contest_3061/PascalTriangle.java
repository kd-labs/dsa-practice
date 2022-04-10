package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPascalTriangle(n);
    }

    private static void printPascalTriangle(int n) {
        int rows = n;
        int row = 0;
        int nos = 1;

        while (row < rows) {

            int i = 0;
            int val = 1;
            while (i < nos) {
                System.out.print(val+"\t");
                val = (val*(row-i)/(i+1));
                i++;
            }

            System.out.println();
            row++;
            nos++;
        }
    }
}
