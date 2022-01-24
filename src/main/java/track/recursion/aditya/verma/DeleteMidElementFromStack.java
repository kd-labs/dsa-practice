package track.recursion.aditya.verma;

import java.util.Stack;

public class DeleteMidElementFromStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(5);
        stack.push(3);
        stack.push(-3);
        stack.push(1);

        int k = (stack.size()/2) + 1;

        deleteFromMid(stack, k);

        stack.forEach(System.out::println);

    }

    public static void deleteFromMid(Stack<Integer> stack, int k) {
        int tmp = stack.pop();
        if(k == 1) return;
        deleteFromMid(stack, k-1);
        stack.push(tmp);
    }
}
