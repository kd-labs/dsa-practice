package codingblocks.lec3.patterns;

import java.util.Scanner;

public class Pattern20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int spaces = n/2;
        int mixed = 1;

        while (row <= rows) {

            int space = 1;
            while (space <= spaces) {
                System.out.print("\t");
                space++;
            }

            int mix = 1;
            while (mix <= mixed) {
                if(mix == 1 || mix == mixed) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
                mix++;
            }

            if(row <= n/2) {
                spaces -= 1;
                mixed += 2;
            } else {
                spaces += 1;
                mixed -= 2;
            }

            System.out.println();
            row++;
        }
    }
}
