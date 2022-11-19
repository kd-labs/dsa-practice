package track.heap;

import java.util.ArrayList;

public class Heap {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 5, 7, 3, 2, -10};

        ArrayList<Integer> minHeap = createMinHeap(arr);

        for(Integer i : minHeap) {
            System.out.print(i + "\t");
        }
    }

    public static ArrayList<Integer> createMinHeap(int[] arr) {
        ArrayList<Integer> minHeap = new ArrayList();
        for(int i : arr) {
            minHeap.add(i);
            upHeapify(minHeap, minHeap.size()-1);
        }

        return minHeap;
    }

    public static void upHeapify(ArrayList<Integer> minHeap, int childIndex) {

        // calculate parent index
        int parentIndex = (childIndex-1)/2;

        // compare value at parent index and child
        if(minHeap.get(parentIndex) > minHeap.get(childIndex)) {
            // swap parent and child
            swap(minHeap, parentIndex, childIndex);

            // again compare with parent by making a recursive call
            upHeapify(minHeap, parentIndex);
        } else {
            // minHeap is still intact, then return
            return; // Base Case
        }

    }

    private static void swap(ArrayList<Integer> minHeap, int a, int b) {
        int temp = minHeap.get(a);
        minHeap.set(a, minHeap.get(b));
        minHeap.set(b, temp);
    }
}
