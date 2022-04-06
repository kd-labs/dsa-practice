package grokking.coding.interview.patterns.slidingwindow;

import java.util.HashMap;

public class FruitsIntoBasket {

    public static void main(String[] args) {

        char[] fruits = {'A', 'B', 'C', 'B', 'B', 'C'};
        int res = maxFruits(fruits, 2);
        System.out.println(res);
    }

    private static int maxFruits(char[] fruits, int k) {
        int res = 0, j = 0, i = 0, len = fruits.length, count;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < len) {

            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
            count = map.size();

            while(count > k) {

                map.put(fruits[i], map.get(fruits[i])-1);
                if (map.get(fruits[i]) == 0) {
                    map.remove(fruits[i]);
                    count--;
                }

                i++;
            }

            res = Math.max(res, j+1-i);

            j++;
        }

        return res;
    }
}
