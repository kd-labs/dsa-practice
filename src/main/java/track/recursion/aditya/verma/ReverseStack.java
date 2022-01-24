package track.recursion.aditya.verma;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-2);
        stack.push(4);
        stack.push(8);
        stack.push(-1);
        stack.push(3);

        reverseStack(stack);

        stack.forEach(System.out::println);

    }

    /*
        Hypothesis :
            reverseStack returns original stack with reversed elements
            original stack = {-2, 4, 8, -1, 3}
            reversed stack = {3, -1, 8, 4, -2}
     */
    public static void reverseStack(Stack<Integer> stack) {

        /*
            Base :
                if stack size is 1 then return stack
         */
        if(stack.size() == 1) return;

        /*
            Induction :
                Reduce the stack by popping the TOS and recursive call to reverseStack
         */
        int tmp = stack.pop();
        reverseStack(stack);

        // Insert the popped element in the reversed stack
        insert(stack, tmp);
    }

    /*
        New Recursive Problem : To insert element in bottom of stack
        Hypothesis :
            insert will insert element to bottom of stack i.e.
            insert({3, -1, 8, 4}, -2) -> {3, -1, 8, 4, -2}
     */
    private static void insert(Stack<Integer> stack, int k) {

        /*
            Base :
                when stack size is 0 then push element k
         */
        if(stack.size() == 0) {
            stack.push(k);
            return;
        }

        /*
            Induction :
                pop TOS and pass reduced stack to recursive insert until stack size is 0
         */
        int tmp = stack.pop();
        insert(stack, k);

        // then push the popped elements back to stack
        stack.push(tmp);

    }
}
