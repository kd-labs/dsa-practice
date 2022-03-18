package track.stack.gfg.cip.libraries;

import java.util.ArrayDeque;

public class CheckBalancedParanthesis {

    public static void main(String[] args) {
        String str = "[{}]()";

        System.out.print(String.format("is string %s balanced : %b", str, isParanthesisBalanced(str)));
    }

    private static boolean isParanthesisBalanced(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char[] parans = str.toCharArray();

        for(char ch : parans) {
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) return false;
                else if(isMatching(ch, stack.peek())) {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatching(char closing, char opening) {
        return ((closing == ']' && opening == '[') ||
                (closing == '}' && opening == '{') ||
                (closing == ')' && opening == '('));
    }
}
