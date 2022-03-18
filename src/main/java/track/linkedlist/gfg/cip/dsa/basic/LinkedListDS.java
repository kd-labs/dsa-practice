package track.linkedlist.gfg.cip.dsa.basic;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDS {

    public static void main(String[] args) {

        DataStructure ds = new DataStructure();

        ds.add(10);
        ds.add(20);
        ds.add(10);
        ds.add(30);
        ds.removeAndPrint(10);

        ds.add(30);
        ds.add(40);
        ds.add(60);
        ds.removeAndPrint(30);
    }
}

class DataStructure {

    LinkedList<Integer> list = new LinkedList<>();

    public void add(int i) {
        list.add(i);
    }

    public void removeAndPrint(int i) {

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            Integer n = iterator.next();
            if(n == i) {
                iterator.remove();
            } else {
                System.out.println(n + " ");
            }
        }

        System.out.println();

    }

}
