package practice_july_2023;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combinationSum(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    public void combinationSum(int[] candidates, int target, int currIdx, List<Integer> ans, List<List<Integer>> res) {

        // base case
        if(target == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = currIdx ; i < candidates.length ; i++) {
            if(candidates[i] <= target) {
                ans.add(candidates[i]);
                combinationSum(candidates, target - candidates[i], i, ans, res);
                ans.remove(ans.size()-1);
            }
        }
    }
}
