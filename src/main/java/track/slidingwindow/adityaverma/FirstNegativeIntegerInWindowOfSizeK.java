package track.slidingwindow.adityaverma;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
* @see <a href="https://www.geeksforgeeks.org/first-negative-integer-every-window-size-k/">GFG link</a>
 */
public class FirstNegativeIntegerInWindowOfSizeK {
    public static void main(String[] args) {

        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;

        List<Integer> res = firstNegativeIntegerInWindowK(arr, k);
        res.forEach(System.out::println);

    }

    private static List<Integer> firstNegativeIntegerInWindowK(int[] arr, int k) {
        List<Integer> res = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();

        int i = 0, j = 0, n = arr.length;

        while(j < n) {
            if(arr[j] < 0) {
                q.offer(arr[j]);
            }

            // when window size hits condition k, then
            // calculate answer from queue, and
            // slide the window and maintain window size by
            // removing the ith element from q if it's negative, and then
            // incrementing i
            if(j-i+1 == k) {
                if(q.size() != 0)
                    res.add(q.peek());
                else res.add(0);

                if(q.size() != 0 && arr[i] == q.peek()){
                    q.poll();
                }
                i++;
            }

            j++;
        }

        return res;
    }
}
