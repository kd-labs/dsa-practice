package codingblocks.lec3.patterns;

import java.util.Scanner;

/*
Pattern 28:
				1
			2	3	2
		3	4	5	4	3
	4	5	6	7	6	5	4
5	6	7	8	9	8	7	6	5
 */
public class Pattern28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int spaces = n-1;
        int nos = 1;

        while (row <= rows) {

            int space = 1;
            while (space <= spaces) {
                System.out.print("\t");
                space++;
            }

            int no = 1;
            int pattern = row;
            while (no <= nos) {
                System.out.print(pattern+"\t");
                if(no < (nos/2+1)) {
                    pattern++;
                } else {
                    pattern--;
                }
                no++;
            }

            space = 1;
            while (space <= spaces) {
                System.out.print("\t");
                space++;
            }

            System.out.println();
            row++;
            spaces -= 1;
            nos += 2;
        }
    }
}
