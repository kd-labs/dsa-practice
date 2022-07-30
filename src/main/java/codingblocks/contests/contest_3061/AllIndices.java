package codingblocks.contests.contest_3061;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllIndices {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        List<Integer> res = new ArrayList<Integer>();
        allIndices(arr, 0, target, res);

        res.forEach(x -> {
            System.out.print(x + "\t");
        });
    }

    private static void allIndices(int[] arr, int idx, int target, List<Integer> ans) {

        // Base Case
        if(idx == arr.length) return;
        // Base Case
        if(arr[idx] == target) {
            ans.add(idx);
        }

        allIndices(arr, idx+1, target, ans);
    }
}
