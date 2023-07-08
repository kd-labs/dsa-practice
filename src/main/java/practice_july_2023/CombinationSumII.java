package practice_july_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] isUsed = new boolean[nums.length];
        combinationSum2(nums, isUsed, target, 0, new ArrayList<Integer>(), res);
        return res;
    }

    public void combinationSum2(int[] nums, boolean[] isUsed, int target, int currIdx, List<Integer> ans, List<List<Integer>> res) {

        // base case
        if(target == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }

        boolean isDuplicate;
        for(int i = currIdx ; i < nums.length ; i++) {
            // check if same element is present before
            isDuplicate = false;
            for(int k = 0; k < i ; k++) {
                if(nums[i] == nums[k] && !isUsed[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate && nums[i] <= target) {
                ans.add(nums[i]); // add change
                isUsed[i] = true;

                combinationSum2(nums, isUsed, target-nums[i], i+1, ans, res);

                isUsed[i] = false;
                ans.remove(ans.size()-1); // backtrack and undo change
            }
        }
    }
}
