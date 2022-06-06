package leetcode;

import java.util.*;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {

        int[] nums = {3,1,3,4,2};

        int res = duplicateNum(nums);
        System.out.println(res);
    }

    /**
     *      Hint : using set
     *
     *      also visit <a href = 'https://leetcode.com/problems/find-the-duplicate-number/discuss/1892921/Java-9-Approaches-Count-%2B-Hash-%2B-Sort-%2B-Binary-Search-%2B-Bit-%2B-Fast-Slow-Pointers'>link</a>
     */

    private static int duplicateNum(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int num : nums) {
            if(map.contains(num)) return num;
            map.add(num);
        }
        return -1;
    }

}
