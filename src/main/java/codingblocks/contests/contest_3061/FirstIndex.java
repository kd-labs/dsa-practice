package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class FirstIndex {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for(int i = 0 ; i < arrSize ; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = getIndex(arr, 0, target);
        System.out.println(index);
    }

    private static int getIndex(int[] arr, int i, int target) {

        // negative base case
        if(i == arr.length) {
            return -1;
        }

        // positive base case
        if(arr[i] == target) {
            return i;
        }

        // recursive call
        return getIndex(arr, i+1, target);

    }
}
