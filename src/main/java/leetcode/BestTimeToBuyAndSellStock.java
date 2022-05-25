package leetcode;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int res = maxProfit(prices);
        System.out.println(res);
    }

    /*
        Idea :
            1. find the min value -> day of buying = buyIndex
            2. find the index after buyIndex with max value -> day of selling = sellIndex
            3. if buyIndex == prices.length-1, there is no sellIndex i.e. profit = -1
            4. else profit = prices[sellIndex] - prices[buyIndex];
     */
    private static int maxProfit(int[] prices) {
        int buyIndex = 0, min = prices[buyIndex];
        for(int i = 1 ; i < prices.length ; i++) {
            if(prices[i] < min) {
                buyIndex = i;
                min = prices[i];
            }
        }

        if(buyIndex == prices.length-1) return -1;

        int max = prices[buyIndex+1];
        for(int i = buyIndex+2 ; i < prices.length ; i++) {
            max = Math.max(prices[i], max);
        }

        return max-min;
    }
}
