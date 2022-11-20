package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public static int kthSmallestElement(int[] nums, int k) {

        // create a max heap from the first k elements
        for(int i = 0 ; i < k ; i++) {
            maxHeap.add(nums[i]);
        }

        // iterate over the next len-k elements and compare the element with maxHeap's largest/kth smallest element
        for(int i = k ; i < nums.length ; i++) {
            if(maxHeap.peek() > nums[i]) { // if elements is smaller than current maxHeaps' largest/kth smallest element, then after the elemnent
                // is added, it won't remain the kth smallest anymore so remove
                maxHeap.poll();

                // then add the next element
                maxHeap.add(nums[i]);
            } else continue; // current maxHeap is smaller than next element, so it will still be kth smallest element, therefore continue to next iteration
        }


        return maxHeap.peek();

    }

    public static void main(String[] args) {

        int[] nums = {7, 4, 6, 3, 9, 1};

        int i = kthSmallestElement(nums, 3);

        System.out.println("Kth smallest element : " + i);
    }
}
