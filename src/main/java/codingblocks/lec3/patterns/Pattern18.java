package codingblocks.lec3.patterns;

import java.util.Scanner;

/*

            *
        *	* 	*
    *	*	*	*	*
 *	*	*	*	*	*	*
    *	*	*	*	*
        *	*	*
            *
 */
public class Pattern18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        printPattern(n);
        printPatternOptimized(n);
    }

    private static void printPatternOptimized(int n) {
        int rows = n;
        int row = 1;
        int spaces = n/2;
        int stars = 1;

        while (row <= rows) {

            int space = 1;
            while (space <= spaces) {
                System.out.print("\t");
                space++;
            }

            int star = 1;
            while(star <= stars) {
                System.out.print("*\t");
                star++;
            }

            space = 1;
            while (space <= spaces) {
                System.out.print("\t");
                space++;
            }

            if(row <= n/2) {
                spaces -= 1;
                stars += 2;
            } else {
                spaces += 1;
                stars -= 2;
            }
            System.out.println();
            row++;
        }
    }

    private static void printPattern(int n) {

        int rows = n;
        int row = 1;
        int spaces = n/2;
        int stars = 0;

        while (row <= rows) {

            int space1 = 1;
            int star1 = 1;
            while (space1 <= spaces) {
                System.out.print("\t");
                space1++;
            }

            while (star1 <= stars) {
                System.out.print("*\t");
                star1++;
            }

            System.out.print("*\t"); // print mirror line

            int star2 = 1;
            int space2 = 1;
            while (star2 <= stars) {
                System.out.print("*\t");
                star2++;
            }

            while (space2 <= spaces) {
                System.out.print("\t");
                space2++;
            }

            System.out.println();
            row++;
            if(row <= (n/2+1)) {
                spaces -= 1;
                stars += 1;
            } else {
                spaces += 1;
                stars -= 1;
            }
        }
    }
}
