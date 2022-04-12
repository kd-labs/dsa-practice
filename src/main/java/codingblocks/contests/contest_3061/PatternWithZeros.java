package codingblocks.contests.contest_3061;

import java.util.Scanner;

/*
Pattern:
1
2	2
3	0	3
4	0	0	4
5	0	0	0	5
 */
public class PatternWithZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
        int rows = n;
        int row = 1;
        int nos = 1;

        while(row <= rows) {

            int no = 1;

            while(no <= nos) {

                if (no == 1 || no == nos) {
                    System.out.print(row+"\t");
                } else {
                    System.out.print(0+"\t");
                }

                no++;
            }

            System.out.println();
            nos++;
            row++;
        }
    }
}
