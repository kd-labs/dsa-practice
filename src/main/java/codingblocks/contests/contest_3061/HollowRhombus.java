package codingblocks.contests.contest_3061;

import java.util.Scanner;

/*
Pattern:
    *****
   *   *
  *   *
 *   *
*****
 */
public class HollowRhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int spaces = n-1;
        int stars = n;

        while( row <= rows) {

            int space = 1;
            while(space <= spaces) {
                System.out.print(" ");
                space++;
            }

            int star = 1;
            while(star <= stars) {

                if(row == 1 || row == n) {
                    System.out.print("*");
                } else {
                    if(star == 1 || star == stars)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                star++;
            }

            System.out.println();
            spaces--;
            row++;
        }
    }
}
