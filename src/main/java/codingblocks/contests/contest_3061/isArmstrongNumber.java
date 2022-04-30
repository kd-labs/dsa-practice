package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class isArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isArmstrong(num)) System.out.println("true");
        else System.out.println("false");
    }

    private static boolean isArmstrong(int num) {

        int countOfDigits = countDigits(num);
        int init = num;

        int sum = 0;
        while(init > 0) {

            sum += Math.pow((init % 10), countOfDigits);

            init = init /10;
        }

        return sum == num;
    }

    private static int countDigits(int num) {

        int digits = 0;
        while (num > 0) {
            digits++;
            num = num/10;
        }
        return digits;
    }
}
