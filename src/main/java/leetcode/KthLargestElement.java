package leetcode;

import java.util.PriorityQueue;

public class KthLargestElement {

    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public int findKthLargest(int[] nums, int k) {

        // create a min heap from the first k elements from input arr
        for(int i = 0 ; i < k ; i++) {
            this.minHeap.add(nums[i]);
        }

        // iterate over the next len-k elements and compare each element with minHeap's smallest value or kth largest element
        for(int i = k; i < nums.length ; i++) {
            if(this.minHeap.peek() < nums[i]) { // next element is greater than current kth largest element

                // remove the kth largest element from current min heap i.e. remove the smallest element
                this.minHeap.poll();
                this.minHeap.add(nums[i]);

            } else continue; // next element is smaller than current minHeap's kth largest or smallest element, so no need to remove minimum and don't add next element
        }

        return this.minHeap.peek();
    }
}
