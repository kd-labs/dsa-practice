package codingblocks.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackReverse {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        // adding elements in stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Before reverse");
        stack.stream().forEach(System.out::println);

        reverseStack(stack);

        System.out.println("After reverse");
        stack.stream().forEach(System.out::println);

    }

    private static void reverseStack(Deque<Integer> stack) {

        // Base Case
        // if stack is empty then return
        if(stack.isEmpty()) {
            return;
        }

        // Recursive Case
        // pop TOS and store variable in array
        int val = stack.pop();
        reverseStack(stack);
        addToBottom(stack, val);
    }

    private static void addToBottom(Deque<Integer> stack, int val) {


        // Base Case
        // If stack is empty then insert val
        if(stack.isEmpty()) {
            stack.push(val);
            return;
        }

        // Recursive Case
        // pop TOS and store in variable
        int tos = stack.pop();
        addToBottom(stack, val);
        stack.push(tos);
    }

}
