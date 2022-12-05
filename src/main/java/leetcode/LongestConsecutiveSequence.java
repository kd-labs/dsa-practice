package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        // Edge Case
        if(nums == null || nums.length == 0) return 0;

        // Part 1 : Create HashMap which contains number starts a sequence or not
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(Integer i : nums) {
            if(!map.containsKey(i-1)) { // if map does not contain previous key, then this key might be start of a new seq
                map.put(i, true);
            } else {
                // else previous key exists and thus this key can be part of another seq
                map.put(i, false);
            }

            // Also check if next key exists in the map,
            if(map.containsKey(i+1) && map.get(i+1)) {
                // if true, then the next key could also be part of some other sequence
                map.put(i+1, false);
            }
        }

        // Part 2 : Loop thru the map to find the longest consecutive sequence
        int ans = 1;
        for (Map.Entry<Integer, Boolean> e : map.entrySet()) {
            int currLen = 1;
            if(e.getValue()) { // we have come across a start of a sequence, from here count it's length
                Integer key = e.getKey();
                while(map.containsKey(key + 1)) {
                   currLen++;
                   key++;
                }
            }
            ans = Math.max(ans, currLen);
        }

        return ans;
    }
}
