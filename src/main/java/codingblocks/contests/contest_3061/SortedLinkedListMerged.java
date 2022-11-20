package codingblocks.contests.contest_3061;

import java.util.Scanner;

public class SortedLinkedListMerged {
    private class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node() {}
    }

    private Node head;
    private Node tail;
    private int size;

    public SortedLinkedListMerged() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public SortedLinkedListMerged(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    // O(1)
    public int size() {
        return this.size;
    }

    // O(1)
    public boolean isEmpty() {
        return this.size() == 0;
    }

    // O(1)
    public int getFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty.");
        }

        return this.head.data;
    }

    // O(1)
    public int getLast() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty.");
        }

        return this.tail.data;
    }

    // O(N)
    public int getAt(int idx) throws Exception {
        Node temp = this.getNodeAt(idx);
        return temp.data;
    }

    // O(N)
    public Node getNodeAt(int idx) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty");
        }

        if (idx < 0 || idx >= this.size()) {
            throw new Exception("Invalid arguments");
        }

        Node retVal = this.head;
        for (int i = 0; i < idx; i++) {
            retVal = retVal.next;
        }

        return retVal;
    }

    // O(1)
    public void addFirst(int data) {
        Node node = new Node(data, this.head);

        if (this.size() == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.head = node;
        }

        this.size++;
    }

    // O(1)
    public void addLast(int data) {
        Node node = new Node(data, null);

        if (this.size() == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }

        this.size++;
    }

    // O(n)
    public void addAt(int idx, int data) throws Exception {
        if (idx < 0 || idx > this.size()) {
            throw new Exception("Invalid arguments");
        }

        if (idx == 0) {
            this.addFirst(data);
        } else if (idx == this.size()) {
            this.addLast(data);
        } else {
            Node nm1 = this.getNodeAt(idx - 1);
            Node n = nm1.next;

            Node node = new Node(data, n);
            nm1.next = node;

            this.size++;
        }
    }

    // O(1)
    public int removeFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty");
        }

        int retVal = this.head.data;

        if (this.size() == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }

        this.size--;
        return retVal;
    }

    // O(n)
    public int removeLast() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty");
        }

        int retVal = this.tail.data;

        if (this.size() == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node sm2 = this.getNodeAt(this.size() - 2);
            sm2.next = null;
            this.tail = sm2;
        }

        this.size--;
        return retVal;
    }

    // O(n)
    public int removeAt(int idx) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty");
        }

        if (idx < 0 || idx >= this.size()) {
            throw new Exception("Invalid arguments");
        }

        if (idx == 0) {
            return this.removeFirst();
        } else if (idx == this.size() - 1) {
            return this.removeLast();
        } else {
            Node nm1 = this.getNodeAt(idx - 1);
            Node n = nm1.next;
            Node np1 = n.next;

            nm1.next = np1;
            this.size--;

            return n.data;
        }
    }

    // O(n)
    public void display() {
        Node node = this.head;

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

        //System.out.println("END");
    }

    public static SortedLinkedListMerged mergeList(SortedLinkedListMerged.Node list1Ptr, SortedLinkedListMerged.Node list2Ptr) {

        SortedLinkedListMerged mergedList = new SortedLinkedListMerged();
        SortedLinkedListMerged.Node mergedHead = mergedList.new Node();
        SortedLinkedListMerged.Node temp = mergedHead;

        while(list1Ptr != null && list2Ptr != null) {

            // if node 1 node is smaller than node 2 node
            if(list1Ptr.data < list2Ptr.data) {
                temp.next = list1Ptr;
                list1Ptr = list1Ptr.next;

            } else { // if node 2 node is smaller than node 1 node
                temp.next = list2Ptr;
                list2Ptr = list2Ptr.next;
            }
            temp = temp.next;
        }

        // end-case when either one of the two linked list is left
        if (list1Ptr != null) {
            temp.next = list1Ptr;
        } else if(list2Ptr != null) {
            temp.next = list2Ptr;
        }

        return new SortedLinkedListMerged(mergedHead.next, null, 0);

    }

    public static void main(String[] args) throws Exception {

        // Initialize scanner
        Scanner scn = new Scanner(System.in);
        int tcs = scn.nextInt();

        while(tcs-- > 0) {

            // list 1
            int list1Size = scn.nextInt();
            SortedLinkedListMerged list1 = new SortedLinkedListMerged();
            for (int i = 0; i < list1Size; i++) {
                list1.addLast(scn.nextInt());
            }

            // list 2
            int list2Size = scn.nextInt();
            SortedLinkedListMerged list2 = new SortedLinkedListMerged();
            for (int i = 0; i < list2Size; i++) {
                list2.addLast(scn.nextInt());
            }
            SortedLinkedListMerged mergedList = SortedLinkedListMerged.mergeList(list1.getNodeAt(0), list2.getNodeAt(0));
            mergedList.display();;
        }

    }
}