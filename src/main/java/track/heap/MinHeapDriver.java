package track.heap;

import java.util.ArrayList;
import java.util.List;

public class MinHeapDriver {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 5, 7, 3, 2, -10, -20};

        MinHeap minHeapObj = new MinHeap(arr);
        ArrayList<Integer> minHeap = minHeapObj.getMinHeap();

        for(Integer i : minHeap) {
            System.out.print(i + "\t");
        }
        System.out.println();

        System.out.println("Min in heap " + minHeapObj.removeMin());
        System.out.println("After removing minimum");

        for(Integer a : minHeapObj.getMinHeap()) {
            System.out.print(a + "\t");
        }
        System.out.println();

        System.out.println("Min in heap " + minHeapObj.removeMin());
        System.out.println("After removing minimum");

        for(Integer a : minHeapObj.getMinHeap()) {
            System.out.print(a + "\t");
        }
        System.out.println();


    }
}

class MinHeap {

    private List<Integer> minHeap;
    private int size;

    public MinHeap(int[] arr) {

        // initialize arraylist
        this.minHeap = new ArrayList<>();
        for(int i : arr) {
            this.add(i);
        }
        this.size = this.minHeap.size();

    }

    public MinHeap() {
        this.minHeap = new ArrayList<>();
    }

    public void add(int value) {
        minHeap.add(value);
        upHeapify(this.minHeap.size()-1);
    }

    public int getMin() {
        return this.minHeap.get(0);
    }

    public int removeMin() {

        int min = this.minHeap.get(0);

        // set 0th index to Integer max
        this.minHeap.set(0, Integer.MAX_VALUE);

        downHeapify(0);

        this.size--;
        this.minHeap = this.minHeap.subList(0, this.size);

        return min;

    }

    private void downHeapify(int parentIndex) {

        // get left child index and right child index
        int leftChildIdx = 2*parentIndex+1;
        int rightChildIdx = 2*parentIndex+2;

        // check if leftChildIdx and rightChildIdx is with size of heap
        // if rightChildIdx is within size and right is not then compare parent with left child
        // if leftChild is smaller than parent, then swap
        if(rightChildIdx < this.size) {

            // get the min between left child and right child
            int min = Math.min(this.minHeap.get(leftChildIdx), this.minHeap.get(rightChildIdx));

            if(min < this.minHeap.get(parentIndex) && min == this.minHeap.get(leftChildIdx)) { // if min is left child, then swap between left child and parent
                swap(leftChildIdx, parentIndex);
                // again compare parent with it's children
                downHeapify(leftChildIdx);
            } else {
                swap(rightChildIdx, parentIndex);
                // again compare parent with it's children
                downHeapify(rightChildIdx);
            }


        } else if(leftChildIdx < this.size) {

            // left child, if with size, will always be smaller than Integer.MAX
            // swap left child with parent
            swap(leftChildIdx, parentIndex);

            // recursive call to downHeapify to again check parent with children
            downHeapify(leftChildIdx);

        } else  // base case, max value has reached it's correct place
            return;

    }

    public ArrayList<Integer> getMinHeap() {
        return new ArrayList<>(this.minHeap);
    }

    private void upHeapify(int childIndex) {

        // calculate parent index
        int parentIndex = (childIndex-1)/2;

        // compare value at parent index and child
        if(minHeap.get(parentIndex) > minHeap.get(childIndex)) {
            // swap parent and child
            swap(parentIndex, childIndex);

            // again compare with parent by making a recursive call
            upHeapify(parentIndex);
        } else {
            // minHeap is still intact, then return
            return; // Base Case
        }

    }

    private void swap(int a, int b) {
        int temp = minHeap.get(a);
        minHeap.set(a, minHeap.get(b));
        minHeap.set(b, temp);
    }
}
