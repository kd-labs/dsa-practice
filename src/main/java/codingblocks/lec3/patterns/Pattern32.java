package codingblocks.lec3.patterns;

import java.util.Scanner;

public class Pattern32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {

        int rows = 2*n-1;
        int row = 1;
        int patterns = 1;
        int numPattern = 1;

        while (row <= rows) {

            int pattern = 1;

            while (pattern <= patterns){

                if((pattern & 1) == 1) {
                    System.out.print(numPattern + " ");
                } else {
                    System.out.print("* ");
                }

                pattern++;
            }

            System.out.println();
            row++;

            if(row <= n) {
                patterns += 2;
                numPattern++;
            } else {
                patterns -= 2;
                numPattern--;
            }
        }
    }
}
