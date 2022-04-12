package codingblocks.contests.contest_3061;

import java.util.Scanner;
/*
Pattern :
 *********
 **** ****
 ***   ***
 **     **
 *       *
 **     **
 ***   ***
 **** ****
 *********
 */
public class PatternMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = 2*n-1;
        int row = 1;
        int stars = n-1;
        int spaces = 1;

        while(row<= rows) {

            int star = 1;
            while(star <= stars) {
                System.out.print("*");
                star++;
            }

            int space = 1;
            while(space <= spaces) {
                if(space == 1 || space == spaces) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                space++;
            }

            star = 1;
            while(star <= stars) {
                System.out.print("*");
                star++;
            }

            if(row <= rows/2) {
                stars--;
                spaces += 2;
            } else {
                stars++;
                spaces -= 2;
            }

            System.out.println();
            row++;
        }
    }
}
