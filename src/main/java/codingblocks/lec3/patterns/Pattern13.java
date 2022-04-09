package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 13:
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class Pattern13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printPattern(n);
        
    }

    private static void printPattern(int n) {
        int rows = 2*n;
        int row = 1;
        int stars = 1;
        int spaces = n-1;

        while(row < rows) {

            int star = 1;
            int space = 1;

            while(star <= stars) {
                System.out.print("* ");
                star++;
            }

            while(space <= spaces) {
                System.out.print("  ");
                space++;
            }

            System.out.println();

            if (row < n) {
                stars++;
                spaces--;
            } else {
               stars--;
               spaces++;
            }
            row++;

        }
    }
}
