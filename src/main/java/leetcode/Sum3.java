package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sum3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arrSize = sc.nextInt();
       int[] arr = new int[arrSize];
       for(int i = 0 ; i < arrSize ; i++) {
           arr[i] = sc.nextInt();
       }
        List<List<Integer>> res = threeSum(arr);
        for (List<Integer> re : res) {
            System.out.println(re);
        }
    }

    private static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        if(arr.length == 0 || arr.length == 1) return res;
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length - 2 ; i++) {
            int left = i+1, right = arr.length-1, newTarget = 0-arr[i];

            while(left < right) {
                if(arr[left] + arr[right] == newTarget) {
                    res.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while(left < right && arr[left] == arr[left+1]) left++;
                    while(left < right && arr[right] == arr[right-1]) right--;
                    left++;
                    right--;
                } else if(arr[left] + arr[right] > newTarget){
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }
}
