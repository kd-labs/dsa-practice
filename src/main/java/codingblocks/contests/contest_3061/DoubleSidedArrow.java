package codingblocks.contests.contest_3061;

import java.util.Scanner;

/*
Pattern n=7 :
                            1
                        2 1   1 2
                    3 2 1       1 2 3
                4 3 2 1           1 2 3 4
                    3 2 1       1 2 3
                        2 1   1 2
                            1
 */
public class DoubleSidedArrow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int outerSpaces = n-1;
        int nos = 1;
        int innerSpaces = -1;

        while ( row <= rows) {

            int outerSpace = 1;
            while(outerSpace <= outerSpaces) {
                System.out.print("\t");
                outerSpace++;
            }

            int no = 1;
            int val = row;
            while(no <= nos) {
                System.out.print(val-- + "\t");
                no++;
            }

            int innerSpace = 1;
            while(innerSpace <= innerSpaces) {
                System.out.print("\t");
                innerSpace++;
            }

            no = 1;
            val=1;
            while((row != 1 || row != n) && no <= nos) {
                System.out.print(val++ + "\t");
                no++;
            }

            outerSpace = 1;
            while(outerSpace <= outerSpaces) {
                System.out.print("\t");
                outerSpace++;
            }

            if(row <= n/2) {
                outerSpaces -= 2;
                innerSpaces += 2;
                nos++;
            } else {
                outerSpaces += 2;
                innerSpaces -= 2;
                nos--;
            }
            System.out.println();
            row++;
        }
    }
}
