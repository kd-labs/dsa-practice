package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 26:
        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
 */
public class Pattern26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {

        int rows = n;
        int row = 1;
        int spaces = 2*n-1;
        int nums = 1;

        while(row <= rows) {

            int space = 1;
            int num = 1;

            while(space <= (spaces/2)) {
                System.out.print("  ");
                space++;
            }

            while(num <= nums) {
                System.out.print(num + " ");
                num++;
            }

            while(space <= spaces) {
                System.out.print("  ");
                space++;
            }

            System.out.println();
            row++;
            spaces -= 2;
            nums += 2;
        }


    }
}
