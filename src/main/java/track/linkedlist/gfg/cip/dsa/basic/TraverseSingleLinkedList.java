package track.linkedlist.gfg.cip.dsa.basic;

public class TraverseSingleLinkedList {

    public static void main(String[] args) {

    }

    private static void printList(Node node) {
        Node curr = node;
        while(curr != null) {
            System.out.println(curr.x);
            curr = curr.next;
        }
    }

    private static void printListRecursively(Node node) {

        // Base Case
        if(node == null) {
            return;
        }
        System.out.println(node.x);
        printListRecursively(node.next);
    }

    private static int searchLL(Node node, int key) {
        // Base Case 1
        if(node == null) return Integer.MIN_VALUE;

        // Base Case 2
        if(node.x == key) return 1;

        // Recursive Case
        int res = searchLL(node.next, key);
        return res == Integer.MIN_VALUE ? Integer.MIN_VALUE : searchLL(node.next, key) + 1;
    }

    private static Node insertAtBegin(Node head, int key) {
        Node newNode = new Node(key);
        newNode.next = head;
        return newNode;
    }

    private static Node insertAtEnd(Node head, int key) {
        Node newNode = new Node(key);
        if(head == null) return newNode;
        Node ptr = head;

        while(ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
        return head;
    }

    private static Node deleteFromBegin(Node head) {
        if(head == null) return null;
        return head.next;
    }

    private static Node deleteFromEnd(Node head) {
        if(head == null || head.next == null) return null;
        Node ptr = head;
        while(ptr.next.next != null) {
            ptr = ptr.next;
        }

        ptr.next = null;
        return head;
    }

    private static Node insertAtPos(Node head, int key, int pos) {
        if(head == null) return new Node(key);
        Node newNode = new Node(key);
        if(pos == 1) {
            newNode.next = head;
            return newNode;
        }
        Node ptr = head;
        for(int i = 1 ; i < pos - 2 && ptr != null ; i++){
            ptr = ptr.next;
        }

        if(ptr == null) return head;

        newNode.next = ptr.next;
        ptr.next = newNode;
        return head;
    }

    private static Node sortedInsert(Node head, int key) {
        Node newNode = new Node(key);
        if(head == null) return newNode;
        if(head.x > key) {
            newNode.next = head;
            return newNode;
        }
        Node ptr = head;
        while(ptr.next != null && ptr.next.x < key) ptr = ptr.next;
        newNode = ptr.next;
        ptr.next = newNode;
        return head;
    }
}
