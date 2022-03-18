package track.queue.gfg.cip.libraries;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class ReverseKItems {

    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 3;

        q = reverseKItems(q, k);

        q.forEach(System.out::println);
    }

    private static Queue<Integer> reverseKItems(Queue<Integer> q, int k) {
        if(k > q.size() || k<=0) return q;

        ArrayDeque<Integer> stack = new ArrayDeque<>();

       for(int i = 0 ; i < k ; i++) {
           stack.push(q.poll());
       }

       while(!stack.isEmpty()) {
           q.offer(stack.pop());
       }

       for(int i = 0 ; i < q.size()-k; i++) {
           q.offer(q.poll());
       }
       return q;
    }
}
