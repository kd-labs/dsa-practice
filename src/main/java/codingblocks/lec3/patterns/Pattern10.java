package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 10 :
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
 */
public class Pattern10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int row = 1;
        int spaces = 0;
        int stars = 2*n-1;

        while(row <= n) {

            int space1 = 0;
            int space2 = 0;
            int star = 1;
            while(space1 < spaces) {
                System.out.print("  ");
                space1++;
            }

            while(star <= stars) {
                System.out.print("* ");
                star++;
            }

            while(space2 < spaces) {
                System.out.print("  ");
                space2++;
            }


            System.out.println();
            row++;
            stars -= 2;
            spaces++;
        }
    }
}
