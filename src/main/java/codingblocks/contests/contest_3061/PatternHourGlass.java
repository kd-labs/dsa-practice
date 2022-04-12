package codingblocks.contests.contest_3061;

import java.util.Scanner;

/*
Pattern :
                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4
                              3 2 1 0 1 2 3
                                2 1 0 1 2
                                  1 0 1
                                    0
                                  1 0 1
                                2 1 0 1 2
                              3 2 1 0 1 2 3
                            4 3 2 1 0 1 2 3 4
                          5 4 3 2 1 0 1 2 3 4 5
 */
public class PatternHourGlass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = 2*n;
        int row = 0;
        int cols = 2*n;
        int spaces = 0;

        while (row <= rows) {

            int space = 1;
            while (space <= spaces) {
                System.out.print("\t");
                space++;
            }

            int val = Math.abs(n-row);
            int col = 0;

            while(col <= cols) {
                System.out.print(val+"\t");

                if(col < cols/2) val--;
                else val++;

                col++;
            }

            System.out.println();
            if(row < rows/2) {
                cols -= 2;
                spaces++;
            } else {
                cols += 2;
                spaces--;
            }
            row++;
        }
    }
}
