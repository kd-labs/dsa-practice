package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 6:
 * * * * *
     * * * *
          * * *
              * *
                  *
 */
public class Pattern6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int row = 1;
        int stars = n;
        int spaces = 0;

        while(row <= n) {

            int space = 0;
            int star = 1;

            while(space < spaces) {
                System.out.print("  ");
                space++;
            }

            while(star <= stars) {
                System.out.print("* ");
                star++;
            }

            System.out.println();
            row++;
            spaces += 2;
            stars--;
        }
    }
}
