package leetcode;

import Utilities.Helper;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] res = intersection(nums1, nums2);
        Helper.printArray(res);

    }

    private static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet();
        HashSet<Integer> set2 = new HashSet();
        for(int i : nums1) {
            set1.add(i);
        }

        for(int i : nums2) {
           set2.add(i);
        }

        set1.retainAll(set2);
        return set1.stream().mapToInt(x -> x).toArray();

    }
}
