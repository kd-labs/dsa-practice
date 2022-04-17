package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class OddEvenSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printOddEvenSum(num);

    }

    private static void printOddEvenSum(int num) {
        int oddSum = 0, evenSum = 0;
        int n = 1;

        while (num > 0) {

            if((n++ & 1) == 1) {
                oddSum += num % 10;
            } else {
                evenSum += num % 10;
            }

            num = num / 10;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
