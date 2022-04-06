package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 2:
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int row = 1;
        int star = 1;

        while (row <= n) {

            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            star++;
            row++;
        }
    }
}
