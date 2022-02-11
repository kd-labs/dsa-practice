package track.slidingwindow.adityaverma;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        List<Integer> res = slidingWindowMaximum(arr, k);
        res.forEach(System.out::println);
    }

    private static List<Integer> slidingWindowMaximum(int[] arr, int k) {

        List<Integer> res = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();

        int i = 0, j = 0, n = arr.length;

        while(j < n) {

            /*
                caculation :
                    enque arr[j] into deque, but before adding arr[j] in deque, check
                    if deque.peekLast() < arr[j], if so then means we are keeping elements in
                    deque which are smaller than arr[j] and are thus not required
                    continue check while deque.peekLast() < arr[j]
                    then add arr[j] in deque
             */

            while(deque.size() !=0 && deque.peekLast() < arr[j]) {
                deque.pollLast();
            }
            deque.offerLast(arr[j]);

            if(j-i+1 == k) {
                /*
                    ans <---- deque
                 */
                res.add(deque.peekFirst());

                /*
                    maintain and slide the window with j++ and i++, but
                    before incrementing i check if arr[i] == deque.peekFirst(), if so
                    then remove the element from deque and then increment i
                 */
                if(deque.size() != 0 && arr[i] == deque.peekFirst()){
                    deque.pollFirst();
                }
                i++;
            }
            j++;

        }

        return res;

    }
}
