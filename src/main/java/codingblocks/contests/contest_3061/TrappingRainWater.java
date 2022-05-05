package codingblocks.contests.contest_3061;

import java.util.Scanner;

/*
    Approach :

        Input :
            arr = [3, 0, 0, 2, 0, 4]

        1.
            calculate the prefix array where each element in the prefix array represents the
            max element to left of arr[i].

                leftMax = [3, 3, 3, 3, 3, 4];

        2.
            calculate the prefix array where each element in the prefix array represents the
            max element to right of arr[i].
                rightMax = [4, 4, 4, 4, 4, 4];

        3.
            water trapped in arr[i] = Math.min(leftPrefix[i], rightPrefix[i]) - arr[i]

                trappedWater = [0, 3, 3, 1, 3, 0]

        4.
            total water trapped += water trapped in arr[i]

                total water trapped = 10;
 */

public class TrappingRainWater {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int tcs = sc.nextInt();

       while(tcs > 0) {

           int arrSize = sc.nextInt();
           int[] arr = new int[arrSize];

           int i = 0;
           while(i < arrSize) {
               arr[i++] = sc.nextInt();
           }

           int res = trappedRainWater(arr, arrSize);
           System.out.println(res);

           tcs--;
       }
    }

    private static int trappedRainWater(int[] arr, int arrSize) {
        int sum = 0;

        /*
            1.
                calculate the prefix array where each element in the prefix array represents the
                max element to left of arr[i].
         */

        int[] leftMax = new int[arrSize];
        leftMax[0] = arr[0];
        for(int i = 1; i < arrSize ; i++) {
           leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }

        /*
            2.
                calculate the prefix array where each element in the prefix array represents the
                max element to right of arr[i].
         */
        int[] rightMax = new int[arrSize];
        rightMax[arrSize-1] = arr[arrSize-1];
        for(int i = arrSize-2 ; i >= 0 ; i--) {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        /*
            3.
                water trapped in arr[i] = Math.min(leftPrefix[i], rightPrefix[i]) - arr[i]

            4.
                total water trapped += water trapped in arr[i]
         */

        for(int i = 0 ; i < arrSize ; i++) {
            sum += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return sum;
    }
}
