package leetcode;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
//        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {2,4,1};

        int res = maxProfit(prices);
        System.out.println(res);
    }

    /*
        Idea :
            1. find the min value -> day of buying = buyIndex
            2. if buyIndex == prices.length-1, there is no sellIndex i.e. profit = -1
            3. if prices[i] > min, calculate profit = prices[i]-min and
            4. maxProfit = Math.max(maxProfit - profit)
     */
    private static int maxProfit(int[] prices) {
        int min = prices[0], profit = 0, maxProfit = 0;
        /**
         * Find the day to buy stock
         */
        for(int i = 1 ; i < prices.length ; i++) {
            if(prices[i] < min) {
                min = prices[i];
            } else if(prices[i] > min) {
                maxProfit = Math.max(maxProfit, prices[i] - min);
            }
        }

        return maxProfit;
    }
}
