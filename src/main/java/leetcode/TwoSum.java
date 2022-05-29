package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

//        int[] arr = {3,2,4};
//        int target = 6;

        int[] arr = {2,4,11,3};
        int target = 6;


//        int[] res = twoSumBrute(arr, target);
        int[] res = twoSumOptimized(arr, target);
        System.out.print(String.format("[%d, %d]", res[0], res[1]));


    }

    /*
        Approach :
            Using Hashmap as auxilliary data structure
     */
    private static int[] twoSumOptimized(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++) {
            if(map.containsKey(target-arr[i])) {
                int[] res = new int[2];
                res[1] = i;
                res[0] = map.get(target-arr[i]);

                return res;
            }
            map.put(arr[i], i);
        }
        return new int[2];
    }

    private static int[] twoSumBrute(int[] arr, int target) {

        int res[] = new int[2];

        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                if(i == j) continue;
                if(arr[i] + arr[j] == target) {
                    res[0] = Math.min(i, j);
                    res[1] = Math.max(i, j);
                    break;
                }
            }
        }
        return res;
    }
}
