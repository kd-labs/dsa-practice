package practice_july_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSetII {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        subsets(nums, 0, new ArrayList<Integer>(), res);

        return res;

    }
    public void subsets(int[] nums, int idx, List<Integer> ans, List<List<Integer>> res) {

        // base case
        if(idx == nums.length) {
            for(List<Integer> arr : res) {
                if(arr.equals(ans)) return;
            }
            res.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[idx]); // add nums[i]
        subsets(nums, idx+1, ans, res);
        ans.remove(ans.size()-1); // backtrack : remove nums[i]
        subsets(nums, idx+1, ans, res);
    }
}
