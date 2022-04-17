package leetcode;

import com.sun.applet2.AppletParameters;

import java.util.Arrays;
import java.util.HashMap;

public class SubarraysWithKDifferentIntegers {

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3};
        int k = 2;
//        int[] nums = {1,2,1};
//        int k = 2;
//        int[] nums = {1,2,1,3,4};
//        int k = 3;

//        int res = countSubarraysWithKIntegersBrute(nums, k);
        int res = countSubarraysWithKIntegersOptimized(nums, k);
        System.out.println(res);

    }

    private static int countSubarraysWithKIntegersOptimized(int[] nums, int k) {
        int res = 0;
        int j = 0, i = 0, len = nums.length, count;
        HashMap<Integer, Integer> intMap = new HashMap<>();
        HashMap<Integer, Integer> distinctMap = new HashMap<>();


        while(j < len) {
//            {1,2,1,2,3}
//            {1,2,1}
            intMap.put(nums[j], intMap.getOrDefault(nums[j], 0)+1);
            count = intMap.size();
            distinctMap.put(count, distinctMap.getOrDefault(count, 0)+1);

            if(count < k) {
                j++;
            } else if((j+1-i == count) && count == k) {
                res++;
                j++;
            } else if(count == k) {
                res++;
                res += distinctMap.getOrDefault(((j+1-i) - count), 0);
                j++;
            } else if(count > k) {
                while(count > k) {
                    intMap.put(nums[i], intMap.get(nums[i])-1);
                    if(intMap.get(nums[i]) == 0) intMap.remove(nums[i]);
                    count = intMap.size();
                    distinctMap.put(count, distinctMap.get(count)-1);
                    i++;
                }
            }

        }

        return res;
    }

    private static int countSubarraysWithKIntegersBrute(int[] nums, int k) {
        int res = 0, len = nums.length;
        int need = k, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < len ; i++) {
            need = k;
            map.clear();
            for(int j = i ; j < len ; j++) {

                map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
                count = map.size();

                if(count == need) {
                    res++;
                    System.out.println(Arrays.toString(Arrays.copyOfRange(nums, i,j+1)));
                }
                else if(count > need) break;

            }
        }

        return res;
    }

    private static int countSubarraysWithKIntegers(int[] nums, int k) {
        int res = 0, j = 0, i=0, len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = map.size();

        while(j < len) {

            map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
            count = map.size();

            if(count < k) j++;
            else if(count == k) {
                res++;
                j++;
            } else if(count > k) {
                while(count > k) {

                    map.put(nums[i], map.get(nums[i])-1);
                    if(map.get(nums[i]) == 0) map.remove(nums[i]);
                    count = map.size();

                    i++;
                }
                j++;
            }

        }


        return res;
    }
}
