package track.recursion.aditya.verma;

import java.util.ArrayList;

/*
    Op-IP Extended Recursive Tree Problem

    where IP : int
          OP : String
 */
public class GenerateBalancedParenthesis {

    private static final ArrayList<String> res = new ArrayList<>();

    public static void main(String[] args) {

        generateBalancedParenthesis(3, 3, "");

        res.forEach(System.out::println);

    }

    private static void generateBalancedParenthesis(int open , int close, String op) {

        if(open == 0 && close == 0) {
            res.add(op);
            return;
        }

        if(open != 0) {
            generateBalancedParenthesis(open - 1, close, op + '(');
        }

        if(close > open) {
            generateBalancedParenthesis(open, close - 1, op + ')');
        }

    }


}
