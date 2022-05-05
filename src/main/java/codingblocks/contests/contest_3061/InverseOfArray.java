package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class InverseOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        int i = 0 ;
        while(i < arrSize) {
            arr[i] = sc.nextInt();
            i++;
        }
        int[] res = inverseArray(arr, arrSize);
        for (int k : res) {
            System.out.print(k + "\t");
        }
    }

    private static int[] inverseArray(int[] arr, int arrSize) {
        int[] res = new int[arrSize];
        for(int i = 0 ; i < arrSize ; i++) {
            res[arr[i]] = i;
        }
        return res;
    }
}
