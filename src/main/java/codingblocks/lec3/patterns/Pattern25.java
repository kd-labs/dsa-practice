package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 25:
         1
       2 3 4
     5 6 7 8 9
  10 11 12 13 14 15 16
17 18 19 20 21 22 23 24 25
 */
public class Pattern25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int counter = 1;
        int spaces = 2*n-1;
        int nums = 1;

        while(row <= rows) {

            int space = 1;
            int num = 1;

            while (space <= (spaces/2)) {
                System.out.print("\t");
                space++;
            }

            while (num <= nums) {
                System.out.print(counter++ + "\t");
                num++;
            }

            while(space <= spaces) {
                System.out.print("\t");
                space++;
            }

            System.out.println();
            row++;
            nums+=2;
            spaces -=2;
        }


    }
}
