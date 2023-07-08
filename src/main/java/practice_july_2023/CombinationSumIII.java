package practice_july_2023;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> res = new ArrayList<>();
        boolean[] isUsed = new boolean[10];
        combinationSum3(k, n, 1, isUsed, new ArrayList<Integer>(), res);
        return res;
    }

    public void combinationSum3(int k, int target, int currIdx, boolean[] isUsed, List<Integer> ans, List<List<Integer>> res) {

        // base case : negative
        if(ans.size() == k && target != 0) return;

        // base case : positive
        if(ans.size() == k && target == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = currIdx ; i < 10 ; i++) {
            if(!isUsed[i] && i <= target) {
                ans.add(i);
                isUsed[i] = true;

                combinationSum3(k, target-i, i+1, isUsed, ans, res);

                isUsed[i] = false;
                ans.remove(ans.size()-1);
            }
        }
    }
}
