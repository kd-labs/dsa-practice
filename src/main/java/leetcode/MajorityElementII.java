package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MajorityElementII {

    public static void main(String[] args) {

        int[] nums = {2, 2};

        List<Integer> integers = majorityElement(nums);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

    }

    private static List<Integer> majorityElement(int[] nums) {
//        if(nums.length < 3) {
//            return Arrays.stream(nums).boxed().collect(Collectors.toList());
//        }

        final int cnt = nums.length/3;

        HashMap<Integer, Integer> table = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++) {
            table.put(nums[i], table.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> collect = table.entrySet().stream().filter(entry -> entry.getValue() > cnt).map(entry -> entry.getKey()).collect(Collectors.toList());
        return collect;
    }
}
