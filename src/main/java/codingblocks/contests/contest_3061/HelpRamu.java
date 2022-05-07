package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class HelpRamu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();

        while (tcs > 0 ) {

            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            int rickshaws = sc.nextInt();
            int cabs = sc.nextInt();

            int[] rickshawsArr = new int[rickshaws];
            int[] cabsArr = new int[cabs];
            int i = 0;
            while(i < rickshaws) {
                rickshawsArr[i++] = sc.nextInt();
            }
            i=0;
            while(i < cabs) {
                cabsArr[i++] = sc.nextInt();
            }

            int minRickshawCost = 0;
            for(int k = 0 ; k < rickshaws ; k++) {
                minRickshawCost += Math.min(rickshawsArr[k] * c1, c2);
            }
            minRickshawCost = Math.min(minRickshawCost, c3);

            int minCabsCost = 0;
            for(int k = 0 ; k < cabs ; k++) {
                minCabsCost += Math.min(cabsArr[k] * c1, c2);
            }
            minCabsCost = Math.min(minCabsCost, c3);

            int minTotalCost = Math.min(minRickshawCost + minCabsCost, c4);

            System.out.println(minTotalCost);

            tcs--;
        }
    }
}
