package leetcode;

import java.util.ArrayDeque;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {


        int length = nums.length;
        int[] res = new int[length-k+1];
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int begin=0, end=0;

        while(end < length) {

            // calculation for end
            while(!queue.isEmpty() && queue.peekLast() < nums[end]) {
                queue.pollLast();
            }

            queue.offerLast(nums[end]);
            if(end-begin+1 < k) {
                end++;
            } else {
                res[begin] = queue.peekFirst();

                // slide the fixed window
                // remove the calculation of begin
                if(nums[begin] == queue.peekFirst()) {
                    queue.pollFirst();
                }
                begin++;
                end++;
            }

        }

        return res;

    }

    public static void main(String[] args) {
        int[] nums = {-7,-8,7,5,7,1,6,0};
        int[] res = maxSlidingWindow(nums, 4);
        for (int re : res) {
            System.out.print(re + " ");
        }
        System.out.println();
    }
}
