package codingblocks.lec3.patterns;

import java.util.Scanner;

public class Pattern19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int spaces = 1;
        int stars = n/2;

        while(row <= rows) {

            int star = 1;
            while (star <= stars) {
                System.out.print("*\t");
                star++;
            }

            int space = 1;
            while (space <= spaces) {

                if(space == 1 || space == spaces) {
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }

                space++;
            }

            star = 1;
            while (star <= stars) {
                System.out.print("*\t");
                star++;
            }

            if(row <= n/2) {
                stars -= 1;
                spaces += 2;
            } else {
                stars += 1;
                spaces -= 2;
            }

            System.out.println();
            row++;
        }
    }
}
