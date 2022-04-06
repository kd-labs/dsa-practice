package codingblocks.lec3.patterns;

import java.util.Scanner;

/*

Pattern 9:
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
 */
public class Pattern9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int row = 1;
        int stars = 1;
        int spaces = n-1;

        while(row <= n) {

            int space1 = 1;
            int star = 1;
            int space2 = 1;

            while (space1 <= spaces) {
                System.out.print("  ");
                space1++;
            }

            while (star <= stars) {
                System.out.print("* ");
                star++;
            }

            while (space2 <= spaces) {
                System.out.print("  ");
                space2++;
            }

            System.out.println();
            row++;
            spaces--;
            stars +=2;
        }
    }
}
