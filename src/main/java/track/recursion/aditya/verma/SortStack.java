package track.recursion.aditya.verma;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-3);
        stack.push(14);
        stack.push(18);
        stack.push(-5);
        stack.push(30);

        Stack<Integer> sortedStack = sortStack(stack);
        sortedStack.forEach(System.out::println);

    }

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        if(stack.size() == 1) return stack;

        int tmp = stack.pop();
        Stack<Integer> sortedStack = sortStack(stack);
        insertInSortedStack(sortedStack, tmp);

        return sortedStack;
    }

    private static void insertInSortedStack(Stack<Integer> sortedStack, int ele) {
        if(sortedStack.size() == 0 || sortedStack.peek() <= ele) {
            sortedStack.push(ele);
            return;
        }
        int tmp = sortedStack.pop();
        insertInSortedStack(sortedStack, ele);
        sortedStack.push(tmp);
    }
}
