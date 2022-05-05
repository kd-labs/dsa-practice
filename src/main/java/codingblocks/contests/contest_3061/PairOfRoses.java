package codingblocks.contests.contest_3061;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();
        while(tcs > 0) {

            int numOfRoses = sc.nextInt();
            int[] priceOfRoses = new int[numOfRoses];
            int i = 0 ;
            while(i < numOfRoses) {
                priceOfRoses[i] = sc.nextInt();
                i++;
            }
            int target = sc.nextInt();
            sc.nextLine();

            rosesToBuy(priceOfRoses, numOfRoses, target);

            tcs--;
        }
    }

    private static void rosesToBuy(int[] priceOfRoses, int numOfRoses, int target) {
        Arrays.sort(priceOfRoses);
        int start = 0, end = numOfRoses-1, minDiff = Integer.MAX_VALUE, rose1 = 0, rose2 = 0;
        while (start < end) {
            if(priceOfRoses[start] + priceOfRoses[end] == target) {
                if(priceOfRoses[end] - priceOfRoses[start] < minDiff) {
                    minDiff = priceOfRoses[end] - priceOfRoses[start];
                    rose1 = priceOfRoses[start];
                    rose2 = priceOfRoses[end];
                }
                end--;start++;
            } else if(priceOfRoses[start] + priceOfRoses[end] > target) end--;
            else start++;
        }
        System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2);
    }
}
