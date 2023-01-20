package codingblocks.sorting;

import java.util.Arrays;
import java.util.EnumSet;

public class CountingSort {

    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();

        int[] nums = new int[]{2,1,1,0,1,2,5,4,0,2,8,7,9,2,6,1,9};

        int[] sorted = countingSort.countSort(nums);

        for (int i : sorted) {
            System.out.print(i + "\t");
        }
    }

    public int[] countSort(int[] nums) {

        // 1. Get the maximum in array
        int max = Arrays.stream(nums).max().getAsInt();

        // 2. Create a frequency array of length max+1
        int[] freq = new int[max+1];

        // 3. Fill the freq array for each element as index
        for(int i : nums) {
            freq[i]++;
        }

        // 4. Create a cumulativeSum arr of same length
        int[] cumSum = new int[max+1];
        cumSum[0] = freq[0];
        for(int i = 1 ; i < cumSum.length ; i++) {
            cumSum[i] = cumSum[i-1] + freq[i];
        }

        // 5. Create an array of length = nums.length which will contain the sorted elements
        int[] res = new int[nums.length];

        // 6. Loop from the end of nums
        for(int i = nums.length-1 ; i >= 0 ; i--) {

            // 7. Get position from cumSum array
            int pos = cumSum[nums[i]];

            // 8. Place nums[i] in res array at idx = pos-1
            res[pos-1] = nums[i];

            // 9. decrement pos and update in cumSum at idx = nums[i]
            cumSum[nums[i]] = pos-1;
        }
        return res;
    }

}
