package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 5:
 * * * * *
 * * * *
 * * *
 * *
 *
 */
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {

        int row = 1;
        int stars = n;
        int spaces = 0;

        while (row <= n) {

            int star = 1;
            int space = 0;

            while(space < spaces) {
                System.out.print("  ");
                space++;
            }

            while (star <= stars) {
                System.out.print("* ");
                star++;
            }

            row++;
            spaces++;
            stars--;
            System.out.println();
        }
    }
}
