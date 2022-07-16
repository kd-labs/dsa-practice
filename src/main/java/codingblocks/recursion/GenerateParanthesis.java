package codingblocks.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParanthesis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> res = new ArrayList<>();

        generateParanthesis(0, 0, n, "", res);

        for (String re : res) {
            System.out.println(re);
        }

    }

    public static void generateParanthesis(int open, int close, int n, String str, List<String> res) {

        // Base Case
        if(open == n && close == n) {
            res.add(str);
            return;
        }

        // if open < n, then pass opening brack
        if(open < n) {
            generateParanthesis(open+1, close, n , str + "(", res);
        }

        // if close < open, then pass closing bracket
        if(close < open) {
            generateParanthesis(open, close + 1, n , str + ")", res);
        }

    }
}
