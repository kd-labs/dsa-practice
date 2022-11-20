package codingblocks.tree;

import java.util.Scanner;

public class BinaryTree {

    // Driver Main Code
    public static void main(String[] args) {

        sc = new Scanner(System.in);

        // Binary Tree create
        BinaryTree tree = new BinaryTree();

        displayTree(tree.getHead());

    }

    // static property
    private static Scanner sc = new Scanner(System.in);

    private Node head;

    BinaryTree() {
        this.head = this.createBinaryTree();
    }

    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public Node getHead() {
        return this.head;
    }

    private Node createBinaryTree() {
        Node node = new Node(sc.nextInt());

        if(sc.nextBoolean()) { // left sub-tree exists

            // recursion call
            node.left = this.createBinaryTree();
        }

        if(sc.nextBoolean()) { // right sub-tree exists
            node.right = this.createBinaryTree();
        }

        return node;
    }


    /**
     *  Display the tree
     */

    public static void displayTree(Node ptr) {

        // base case
        if(ptr == null) {
            return;
        } else {
            System.out.println(ptr.data);
        }

        // recursive call to print the left sub-tree
        if(ptr.left != null) {
           displayTree(ptr.left);
        }

        // recursive call to print the right sub-tree
        if(ptr.right != null) {
            displayTree(ptr.right);
        }
    }

    public int getMax() {
        return getMax(this.head);
    }

    private static int getMax(Node ptr) {

        // Base Case
        if(ptr == null) return Integer.MIN_VALUE;

        int left = getMax(ptr.left);
        int right = getMax(ptr.right);

        return Math.max(ptr.data, Math.max(left, right));

    }

    public int getSize() {
        return getSize(this.head);
    }

    private static int getSize(Node ptr) {

        // Base Case
        if(ptr == null) return 0;

        int left = getSize(ptr.left);
        int right = getSize(ptr.right);
        return 1 + left + right;
    }

    public int getHeight() {
        return getHeight(this.head);
    }

    private static int getHeight(Node ptr) {

        // Base Case
        if(ptr == null) return -1;

        int left = getHeight(ptr.left);
        int right = getHeight(ptr.right);

        return 1 + Math.max(left, right);

    }

}
