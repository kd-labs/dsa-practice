package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 31:
5 4 3 2 *
5 4 3 * 1
5 4 * 2 1
5 * 3 2 1
* 4 3 2 1
 */
public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {

        int rows = n;
        int row = 1;

        while (row <= rows) {

            int counter = 0;

            while (n > counter) {

                if(row == (n-counter)) {
                    System.out.print("* ");
                } else {
                    System.out.print(n-counter + " ");
                }
                counter++;
            }


            System.out.println();
            row++;
        }
    }
}
