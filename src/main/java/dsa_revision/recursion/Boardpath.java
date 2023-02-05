package dsa_revision.recursion;

import java.util.Scanner;

public class Boardpath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        int dice = scanner.nextInt();

        int ans = paths(dice, target, "");

        System.out.println();
        System.out.println(ans);
    }

    private static int paths(int dice, int target, String path) {

        // Base Case : Positive
        if(target == 0) {
            System.out.print(path + " ");
            return 1;
        }

        // Base Case : Negative
        if(target < 0) {
            return 0;
        }

        int ans = 0;

        for(int i = 1 ; i <= dice ; i++) {
            ans += paths(dice, target-i, path+i);
        }

        return ans;
    }
}
