package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FruitsInABasket {

    public static void main(String[] args) {
//        int[] nums = {0,1,2,2};
//        int[] nums = {1,2,1};
//        int[] nums = {1,2,3,2,2};
//        int[] nums = {0};
//        int[] nums = {3,3,3,1,2,1,1,2,3,3,4};
//        int[] nums = {1,1};
        int[] nums = {3,3,3,3,3,3};
        int k = 2;

        int totalFruits = betterTotalFruit(nums, k);
        System.out.println(totalFruits);
    }

    private static int totalFruit(int[] fruits, int k) {
        int res = Integer.MIN_VALUE;

        int left = 0, right =0, size = fruits.length, count;
        Map<Integer, Integer> basket = new HashMap<>();

        if(k >= fruits.length) return fruits.length;

        while(right < size) {

            // add fruit in basket
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            count = basket.size();

            if(count <= k) {
                res = Math.max(res, right+1-left);
            }

            while(count > k) {

                if(basket.containsKey(fruits[left])) {
                    basket.put(fruits[left], basket.get(fruits[left])-1);
                }
                if(basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                    count--;
                }

                left++;
            }
            right++;
        }

        return res;
    }

    private static int betterTotalFruit(int[] fruits, int k) {
        int res = Integer.MIN_VALUE;

        int left = 0, right =0, size = fruits.length, count;
        Map<Integer, Integer> basket = new HashMap<>();

        if(k >= fruits.length) return fruits.length;

        while(right < size) {

            // add fruit in basket
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            count = basket.size();

            while(count > k) {

                if(basket.containsKey(fruits[left])) {
                    basket.put(fruits[left], basket.get(fruits[left])-1);
                }
                if(basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                    count--;
                }
                left++;
            }
            res = Math.max(res, right+1-left);
            right++;
        }

        return res == Integer.MIN_VALUE ? (basket.size() > 0 ? size : 0) : res;
    }

}
