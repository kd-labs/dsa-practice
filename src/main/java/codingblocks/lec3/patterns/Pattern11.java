package codingblocks.lec3.patterns;

import java.util.Scanner;

/*

Pattern 11:
         *
       *   *
     *   *   *
   *   *   *   *
 *   *   *   *   *
 */
public class Pattern11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int row = 1;
        int patterns = 1;
        int spaces = n-1;

        while(row <= n) {

            int space1 = 1;
            int pattern = 1;
            int space2 = 1;

            while (space1 <= spaces) {
                System.out.print("  ");
                space1++;
            }

            while (pattern <= patterns) {
                if((pattern & 1) == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                pattern++;
            }

            while (space2 <= spaces) {
                System.out.print("  ");
                space2++;
            }

            System.out.println();
            row++;
            spaces--;
            patterns +=2;
        }
    }
}
