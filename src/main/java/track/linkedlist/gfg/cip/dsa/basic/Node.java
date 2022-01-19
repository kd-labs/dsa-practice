package track.linkedlist.gfg.cip.dsa.basic;

public class Node {

    int x;
    Node next;

    Node(int x) {
        this.x = x;
        next = null;
    }

    public int getX() {
        return x;
    }

    public Node getNext() {
        return next;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
