package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minF = sc.nextInt();
        int maxF = sc.nextInt();
        int step = sc.nextInt();

        printFToCConversion(minF, maxF, step);

    }

    private static void printFToCConversion(int minF, int maxF, int step) {

        for(; minF <= maxF; minF += step) {
            int cel = farenToCel(minF);
            System.out.println(minF + "\t" + cel);
        }
    }

    private static int farenToCel(int faren) {
//        C = (5/9)(F – 32)
        float i = (faren - 32) * (5f / 9);
        return (int)i;
    }
}
