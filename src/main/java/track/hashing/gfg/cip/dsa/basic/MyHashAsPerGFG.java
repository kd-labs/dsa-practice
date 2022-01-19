package track.hashing.gfg.cip.dsa.basic;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashAsPerGFG {

    private final int BUCKET_SIZE;
    private final ArrayList<LinkedList<Integer>> table;

    MyHashAsPerGFG(int size) {
        BUCKET_SIZE = size;
        table = new ArrayList<LinkedList<Integer>>();
    }

    public void insert(int key) {
        int idx = hash(key);
        LinkedList<Integer> integers = table.get(idx);
        integers.add(key);
    }

    public void delete(int key) {
        int idx = hash(key);
        table.get(idx).remove(key);
    }

    public boolean search(int key) {
        int idx = hash(key);
        return table.get(idx).contains(key);
    }

    private int hash(int key) {
        return Integer.valueOf(key).hashCode() % BUCKET_SIZE;
    }
}
