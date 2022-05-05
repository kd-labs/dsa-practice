package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class MaxValueInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        int i = 0 ;
        while(i < arrSize) {
            arr[i] = sc.nextInt();
            i++;
        }
        int max = maxValue(arr, arrSize);
        System.out.println(max);
    }

    private static int maxValue(int[] arr, int arrSize) {
        int max = arr[0];
        if(arrSize == 1) return max;
        for(int i = 1 ; i < arrSize ; i++) {
            if(arr[i] > max) max = arr[i];
        }

        return max;
    }
}
