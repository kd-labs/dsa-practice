package practice_july_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> permsList = new ArrayList<>();
        permute(nums, permsList, new ArrayList<>());

        return permsList;
    }

    public void permute(int[] nums, List<List<Integer>> res, List<Integer> perm) {

        // base case : when nums.length == 0
        if(nums.length == 0) {
            res.add(new ArrayList<>(perm));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++) {
            int idx = i;
            // changing the input nums
            int[] newNums = Arrays.stream(nums).filter(x -> x != nums[idx]).toArray();
            perm.add(nums[idx]);
            permute(newNums, res, perm);
            perm.remove((Integer) nums[idx]);
        }
    }
}
