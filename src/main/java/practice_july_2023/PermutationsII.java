package practice_july_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> uniquePerms = new ArrayList<>();
        permuteUnique(nums, uniquePerms, new ArrayList<>());
        return uniquePerms;
    }

    public void permuteUnique(int[] nums, List<List<Integer>> res, List<Integer> perm) {

        // Base Case
        if(nums.length == 0) {
            res.add(new ArrayList<>(perm));
            return;
        }

        boolean isDuplicate = false;
        for(int i = 0 ; i < nums.length ; i++) {
            isDuplicate = false;
            // for loop checks if same element is present after it
            for(int j = 0 ; j < i ; j++) {
                if(nums[j] == nums[i]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                perm.add(nums[i]);
                // create a new array
                int[] slice1 = Arrays.copyOfRange(nums, 0, i);
                int[] slice2 = Arrays.copyOfRange(nums, i+1, nums.length);
                int[] newNums = IntStream.concat(Arrays.stream(slice1), Arrays.stream(slice2)).toArray();
                // recursion call
                permuteUnique(newNums, res, perm);
                // backtrack to undo changes
                perm.remove(perm.size()-1);
            }
        }
    }
}
