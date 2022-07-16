package leetcode;

import java.util.*;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {

//        int[] nums = {3,1,3,4,2};
        int[] nums = {1,3,4,2,2};

//        int res = duplicateNumUsingSet(nums);
        int res = duplicateNumUsingBinarySearch(nums);
        System.out.println(res);
    }

    /*
     *      Approach :
     *          Using binary search where the sorted search space is [1,n]
     *      Example :
     *          input : [3, 1, 3, 4, 2]
     *          search space : [1, 2, 3, 4]
     *          low = 1, high = 4
     *          mid = 2
     *              count number of elements in input arr <= mid in cnt i.e. cnt = 2
     *              if(cnt <= mid) i.e. number of elements in input array is same as mid so no repeating element
     *                  so the repeating element is > mid
     *                  low = mid + 1
     *          low = 3, high = 4, mid = 3
     *          count number of elements <= mid i.e. cnt 4
     *          since cnt > mid, therefore repeating element lies in before mid, i.e. high = mid or high = 3
     *
     *          do while low < high
     *
     *          return low
     */
    private static int duplicateNumUsingBinarySearch(int[] nums) {

        int low = 1, high = nums.length-1;

        while(low < high) {
            int mid = low + (high-low)/2;

            int cnt = 0;
            for(int i = 0 ; i < nums.length ; i++) {
                if(nums[i] <= mid) cnt++;
            }

            if(cnt <= mid) low = mid + 1;
            else high = mid;
        }
        return low;

    }

    /**
     *      Hint : using set
     *
     *      also visit <a href = 'https://leetcode.com/problems/find-the-duplicate-number/discuss/1892921/Java-9-Approaches-Count-%2B-Hash-%2B-Sort-%2B-Binary-Search-%2B-Bit-%2B-Fast-Slow-Pointers'>link</a>
     */

    private static int duplicateNumUsingSet(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int num : nums) {
            if(map.contains(num)) return num;
            map.add(num);
        }
        return -1;
    }

}
