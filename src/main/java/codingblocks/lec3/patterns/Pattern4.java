package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 4:
         *
      * *
    * * *
  * * * *
* * * * *
 */
public class Pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int row = 1;
        int spaces = n-1;
        int stars = 1;

        // looping for each row
        while(row <= n) {

            int space = 1;
            int star = 1;

            // task to print space
            while(space <= spaces) {
                System.out.print("  ");
                space++;
            }

            // task to print star
            while(star <= stars) {
                System.out.print("* ");
                star++;
            }

            row++;
            stars++;
            spaces--;
            System.out.println();
        }
    }
}
