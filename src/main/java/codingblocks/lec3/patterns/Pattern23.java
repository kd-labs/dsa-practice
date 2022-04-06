package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 23:
        1
      1 1 1
    1 1 1 1 1
  1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1
 */
public class Pattern23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int spaces = 2*n-1;
        int ones = 1;

        while (row <= rows) {

            int space = 1;
            int one = 1;

            while (space <= (spaces/2)) {
                System.out.print("  ");
                space++;
            }

            while(one <= ones) {
                System.out.print("1 ");
                one++;
            }

            while(space <= spaces) {
                System.out.print("  ");
                space++;
            }

            System.out.println();
            row++;
            ones += 2;
            spaces -=2;

        }
    }
}
