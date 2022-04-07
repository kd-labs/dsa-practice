package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 1 :
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stars = sc.nextInt();

        pattern0(stars);
    }

    private static void pattern0(int stars) {
        int row = 1;

        while (row <= stars) {

            int star = 1;
            while (star <= stars) {

                System.out.print("* ");

                star++;
            }

            System.out.println();
            row++;
        }

    }
}
