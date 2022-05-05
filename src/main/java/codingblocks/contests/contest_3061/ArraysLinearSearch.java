package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class ArraysLinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        int i = 0;
        while (i<arrSize) {
            arr[i] = sc.nextInt();
            i++;
        }

        int target = sc.nextInt();

        int res = linearSearch(arr, target);
        System.out.println(res);
    }

    private static int linearSearch(int[] arr, int target) {

        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
