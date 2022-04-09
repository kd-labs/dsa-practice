package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 15 :
 * * * * *
     * * * *
         * * *
             * *
                 *
             * *
         * * *
     * * * *
 * * * * *
 */
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = 2*n;
        int row = 1;
        int spaces = 0;
        int stars = n;

        while (row < rows) {

            int space = 1;
            int star = 1;
            while (space <= spaces) {
                System.out.print("  ");
                space++;
            }

            while (star <= stars) {
                System.out.print("* ");
                star++;
            }

            System.out.println();
            row++;
            if(row <= n) {
                spaces += 2;
                stars -= 1;
            } else {
                spaces -= 2;
                stars += 1;
            }
        }
    }
}
