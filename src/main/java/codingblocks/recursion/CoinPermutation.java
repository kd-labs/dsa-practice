package codingblocks.recursion;

public class CoinPermutation {

    public static void main(String[] args) {
        int[] coins = {2, 3, 4, 5};
        int target = 10;

        printCoinPermutation(coins, target, "");
    }

    private static void printCoinPermutation(int[] coins, int target, String ans) {

        // Positive Base Case
        if(target == 0) {
            System.out.println(ans);
            return;
        }

        for(int i = 0 ; i < coins.length ; i++) {
            if(target >= coins[i]) {
                // Recursive Case
                printCoinPermutation(coins, target-coins[i], ans+coins[i]);
            }
        }
    }
}
