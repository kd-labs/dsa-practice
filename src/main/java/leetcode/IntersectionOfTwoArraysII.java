package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] arr1, int[] arr2) {

        // Initially create a map
        Map<Integer, Integer> map = new HashMap<>();

        // Data structure to store the result
        List<Integer> res = new ArrayList<>();

        // Loop over arr1 to build frequency map
        for(Integer i : arr1) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        // Looping over arr2 to reduce the frequence from the map.
        // if the value after subtracting is 0, then add integer in result

        for(Integer i : arr2) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)-1);
                if(map.get(i) == 0) { // if the value after subtraction is 0 then add element in res
                    map.remove(i);
                }
                res.add(i);
            }
        }

        int[] arrRes = new int[res.size()];
        for(int i = 0 ; i < res.size() ; i++) {
            arrRes[i] = res.get(i);
        }

        return arrRes;
    }
}
