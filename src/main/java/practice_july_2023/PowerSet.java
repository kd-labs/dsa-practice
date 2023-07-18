package practice_july_2023;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        subsets(nums, 0, new ArrayList<Integer>(), res);

        return res;

    }
    public void subsets(int[] nums, int idx, List<Integer> ans, List<List<Integer>> res) {

        // base case
        if(idx == nums.length) {
            res.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[idx]); // add nums[i]
        subsets(nums, idx+1, ans, res);
        ans.remove(ans.size()-1); // backtrack : remove nums[i]
        subsets(nums, idx+1, ans, res);
    }
}
