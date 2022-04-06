package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 3 :
 * * * * *
 * * * *
 * * *
 * *
 *
 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int i = 1;
        int star = n;

        while (i <= n) {

            int j = 1;

            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            i++;
            star--;
        }
    }
}
