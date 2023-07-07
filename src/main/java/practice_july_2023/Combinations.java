package practice_july_2023;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        combine(n, k, 1, new ArrayList<Integer>(), res);
        return res;
    }

    public void combine(int n, int k, int curr, List<Integer> ans, List<List<Integer>> res) {

        // base case
        if(ans.size() == k) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = curr ; i <= n ; i++) {
            ans.add(i);
            combine(n, k, i+1, ans, res);
            ans.remove(ans.size()-1);
        }
    }

}
