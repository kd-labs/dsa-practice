package codingblocks.dailycodebyte;

import java.util.Scanner;

public class LongestValidPairOfParanthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parans = sc.nextLine();

        int res = longestValidPairOfParanthesis(parans);
        System.out.println(res);
    }

    private static int longestValidPairOfParanthesis(String parans) {
        int res = 0, sum = 0;
        for(int i = 0; i < parans.length();i++) {
            sum += parans.charAt(i) == '(' ? 1 : -1;
            if(sum == 0) res = i;
        }

        return res+1;
    }
}
