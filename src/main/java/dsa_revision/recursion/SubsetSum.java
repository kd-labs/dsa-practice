package dsa_revision.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for(int i = 0; i < arrSize ; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        List<String> res = new ArrayList<>();

        subsetSum(arr, target, 0, res, "");

        for (String subset : res) {
            for (String s : subset.split("")) {
                System.out.print(s + " ");
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(res.size());

    }

    public static void subsetSum(int[] arr, int target, int idx, List<String> res, String s) {

        // base case : positive
        if(target == 0) {
            res.add(s);
            return;
        }

        // base case : negative
        if(idx == arr.length || target < 0) return;

        // Recursive Case
        // Select
        subsetSum(arr, target-arr[idx], idx+1, res, s+arr[idx]);
        // Not Select
        subsetSum(arr, target, idx+1, res, s);

    }
}
