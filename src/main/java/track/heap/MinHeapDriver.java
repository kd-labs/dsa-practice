package track.heap;

import java.util.ArrayList;

public class MinHeapDriver {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 5, 7, 3, 2, -10};

        new MinHeap();

        for(Integer i : arr) {
            System.out.print(i + "\t");
        }
    }
}

class MinHeap {

    private ArrayList<Integer> minHeap;

    public MinHeap() {
        this.minHeap = new ArrayList<>();
    }

    public void add(int value) {
        minHeap.add(value);
        upHeapify(this.minHeap.size()-1);
    }

    public ArrayList<Integer> getMinHeap() {
        return new ArrayList<>(this.minHeap);
    }

    public void upHeapify(int childIndex) {

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
