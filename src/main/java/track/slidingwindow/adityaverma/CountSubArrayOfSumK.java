package track.slidingwindow.adityaverma;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayOfSumK {

    public static void main(String[] args) {

        int[] arr = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;

        int count = largestSubArrayOfSumK(arr, k);
        System.out.printf("Count of sub-arrays of count %d is %d.\n", k, count);

    }

    private static int largestSubArrayOfSumK(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int j = 0, n = arr.length, sum = 0, count = 0;

        while(j < n) {

            sum = sum + arr[j];

            if(sum == k) {
                count++;
            } else if(sum != k) {
                if(map.containsKey(sum-k)) {
                    count++;
                }
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
            j++;
        }
        return count;
    }

}

