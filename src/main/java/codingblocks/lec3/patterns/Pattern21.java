package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 21
 *                 *
 * *             * *
 * * *         * * *
 * * * *     * * * *
 * * * * * * * * * *
 */
public class Pattern21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int stars = 2;
        int spaces = 2*n-stars;

        while(row <= rows) {

            int star = 1;
            int space = 1;

            while (star <= (stars/2)) {
                System.out.print("* ");
                star++;
            }

            while(space <= spaces) {
                System.out.print("  ");
                space++;
            }

            while (star <= stars) {
                System.out.print("* ");
                star++;
            }

            System.out.println();
            row++;
            stars += 2;
            spaces -= 2;

        }
    }
}
