package track.stack.gfg.cip.libraries;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class StockSpan {

    public static void main(String[] args) {

        List<Integer> stockPrices = Arrays.asList(60, 10, 20, 40, 35, 30, 50, 70, 65);

        int[] span = calculateSpan(stockPrices);

        for(int x : span) System.out.print(x + " ");
    }

    private static int[] calculateSpan(List<Integer> stockPrices) {
        int[] res = new int[stockPrices.size()];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0 ; i < stockPrices.size() ; i++) {
            while(!stack.isEmpty() && stockPrices.get(stack.peek()) <= stockPrices.get(i)) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                res[i] = i + 1;
            } else {
                res[i] = i - stack.peek();
            }
            stack.push(i);
        }

        return res;
    }
}
