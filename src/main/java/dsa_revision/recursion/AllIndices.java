package dsa_revision.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class AllIndices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for(int i = 0; i < arrSize ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = new int[arrSize];
        Arrays.fill(res, -1);

        int target = sc.nextInt();
        allIndices(arr, target, res, 0, -1);
        for (int idx : res) {
            if(idx != -1)
                System.out.print(idx + "\t");
        }
    }

    public static int[] allIndices(int[] arr, int target, int[] res, int i, int k) {

        // base case
        if(i == arr.length) return res;

        // base case positive
        if(arr[i] == target) {
            res[++k] = i;
        }

        return allIndices(arr, target, res, i+1, k);
    }
}
