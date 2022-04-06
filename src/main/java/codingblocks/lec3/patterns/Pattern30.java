package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 30:
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
 */
public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printPattern(n);
    }

    private static void printPattern(int n) {

        int rows = n;
        int row = 0;

        while (row < rows) {

            int counter = 0;
            while (n-counter > 0) {
                System.out.print(n-counter + " ");
                counter++;
            }

            System.out.println();
            row++;
        }
    }
}
