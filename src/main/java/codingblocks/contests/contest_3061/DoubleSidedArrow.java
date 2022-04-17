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
        int nos = 0;
        int innerSpaces = 1;
        int val = row;

        while ( row <= rows) {

            // print outer space left
            int outerSpace = 1;
            while(outerSpace <= outerSpaces) {
                System.out.print("\t");
                outerSpace++;
            }

            // print numbers left
            int no = 1;
            while(no <= nos) {
                System.out.print(val-- + "\t");
                no++;
            }

            // print inner space
            int innerSpace = 1;
            while(innerSpace <= innerSpaces) {
                if(innerSpace == 1 || innerSpace == innerSpaces) {
                    System.out.print(1+"\t");
                } else {
                    System.out.print("\t");
                }
                innerSpace++;
            }

            // print numbers right
            no = 1;
            while(no <= nos) {
                System.out.print(++val + "\t");
                no++;
            }

            // print outer space right
            outerSpace = 1;
            while(outerSpace <= outerSpaces) {
                System.out.print("\t");
                outerSpace++;
            }

            if(row <= n/2) {
                outerSpaces -= 2;
                innerSpaces += 2;
                nos++;
                val++;
            } else {
                outerSpaces += 2;
                innerSpaces -= 2;
                nos--;
                val--;
            }
            System.out.println();
            row++;
        }
    }
}
