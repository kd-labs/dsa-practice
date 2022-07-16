package leetcode;

public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int res = maxProfit(prices);
        System.out.println(res);

    }

    private static int maxProfit(int[] prices) {
        int res = 0;

        for(int i = 1 ; i < prices.length ; i++) {
            res += (prices[i] - prices[i-1]) > 0 ? (prices[i] - prices[i-1]) : 0;
        }

        return res;
    }
}
