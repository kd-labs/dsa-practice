package leetcode;

import java.util.ArrayDeque;

/*
 * @see <a href="https://leetcode.com/problems/backspace-string-compare/">Backspace String Compare</a>
 */
public class BackspaceStringCompare {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a#c", "b"));
    }

    private static boolean backspaceCompare(String s , String t) {

        ArrayDeque<Character> stack1 = getStackAfterRemovingBackspace(s);
        ArrayDeque<Character> stack2 = getStackAfterRemovingBackspace(t);

        if(stack1.size() != stack2.size()) {
            return false;
        } else {
            while (!stack1.isEmpty()) {
               if(stack1.poll() != stack2.poll()) return false;
            }
        }

        return true;
    }

    private static ArrayDeque<Character> getStackAfterRemovingBackspace(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) != '#') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == '#' && !stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack;
    }

}
