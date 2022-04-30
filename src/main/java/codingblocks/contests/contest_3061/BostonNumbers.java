package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class BostonNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isBostonNumber(n) ? 1 : 0);
    }

    private static boolean isBostonNumber(int n) {
        int sum = digitsSum(n);

        int sum1 = sumOfPrimeFactors(n);

        System.out.println("Digits sum : " + sum);
        System.out.println("Factors sum : " + sum1);

        return sum == sum1;
    }

    private static int sumOfPrimeFactors(int n) {
        int primeFactor = 2;
        int sum = 0;
        while (n > 1) {
            if(n % primeFactor == 0) {
                sum += primeFactor;
                n = n / primeFactor;
            } else {
                primeFactor++;
            }
        }
        return sum <= 9 ? sum : digitsSum(sum);
    }

    private static int digitsSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n%10;
            n = n/10;
        }
        return sum <= 9 ? sum : digitsSum(sum);
    }
}
