package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class OddAndEvenBackInDelhi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();

        while(tcs-- != 0) {
            int carNum = sc.nextInt();
            isCarAllowedOnSunday(carNum);
        }
    }

    private static void isCarAllowedOnSunday(int carNum) {

        int sumOdd = 0, sumEven = 0;
        while(carNum > 0) {
            if((carNum%10) % 2 == 0) {
                sumEven += carNum % 10;
            } else {
                sumOdd += carNum % 10;
            }

            carNum = carNum/10;
        }
        if(sumOdd % 3 == 0 || sumEven % 4 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}