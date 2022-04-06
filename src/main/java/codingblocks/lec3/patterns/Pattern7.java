package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 7 :

* * * * *
*       *
*       *
*       *
* * * * *
 */
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int row = 1;
        int stars = n-2;

        while (row <= n) {

            String pattern;

            if(row == 1 || row == n) {
                pattern = "* ";
            } else {
                pattern = "  ";
            }

            System.out.print("* ");

            int star = 1;
            while (star <= stars) {
                System.out.print(pattern);
                star++;
            }

            System.out.print("* ");

            System.out.println();
            row++;
        }
    }
}
