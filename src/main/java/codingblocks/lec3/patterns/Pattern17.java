package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 17:
 *	*	*	 	*	*	*
 *	*		 		*	*
 *			 			*

 *			 			*
 *	*		 		*	*
 *	*	*	 	*	*	*
 */
public class Pattern17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int stars = n/2;
        int spaces = 0;

        while (row <= rows) {

            int star1 = 1;
            int space1 = 1;

            // print star first on left of mirror
            while (star1 <= stars) {
                System.out.print("*\t");
                star1++;
            }

            // print spaces after star on left of mirror
            while (space1 <= spaces) {
                System.out.print("\t");
                space1++;
            }

            System.out.print(" \t"); // print mirror line

            int star2 = 1;
            int space2 = 1;

            // print spaces first after mirror line
            while (space2 <= spaces) {
                System.out.print("\t");
                space2++;
            }

            // print stars after spaces after mirror line
            while (star2 <= stars) {
                System.out.print("*\t");
                star2++;
            }

            System.out.println();
            row++;
            if(row <= (n/2+1)) {
                spaces += 1;
                stars -= 1;
            } else {
                spaces -= 1;
                stars += 1;
            }
        }
    }
}
