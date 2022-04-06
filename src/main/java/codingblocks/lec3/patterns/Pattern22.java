package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 22:
 * * * * * * * * *
 * * * *   * * * *
 * * *       * * *
 * *           * *
 *               *
 */
public class Pattern22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {

        int rows = n;
        int row = 1;
        int totalStars = 2*n-1;
        int stars = totalStars;
        int spaces = -1;

        while (row <= rows) {

            int star = 1;
            int space = 1;

            while (star <= stars/2) {
                System.out.print("* ");
                star++;
            }

            while (spaces > 0 && space <= spaces) {
                System.out.print("  ");
                space++;
            }

            while (star <= stars) {
                System.out.print("* ");
                star++;
            }

            System.out.println();
            row++;
            spaces += 2;
            stars = totalStars - spaces;
        }
    }
}
