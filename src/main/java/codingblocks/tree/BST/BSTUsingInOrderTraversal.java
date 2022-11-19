package codingblocks.tree.BST;


import leetcode.TreeNode;

import java.util.Scanner;

public class BSTUsingInOrderTraversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] inOrder = new int[arrSize];
        for(int i = 0 ; i < arrSize ; i++) {
            inOrder[i] = sc.nextInt();
        }

        BSTUsingInOrderTraversal instance = new BSTUsingInOrderTraversal();
        TreeNode rootNode = instance.createBinarySearchTree(inOrder, 0, arrSize-1);
        instance.preOrderDisplay(rootNode);
    }

    private void preOrderDisplay(TreeNode node) {
        // Base Case
        if(node == null) {
            return;
        }

        // Print node value
        System.out.print(node.data);

        // Recursive call for left sub-tree
        preOrderDisplay(node.left);

        // Recursive call for right sub-tree
        preOrderDisplay(node.right);
    }

    private TreeNode createBinarySearchTree(int[] inOrder, int start, int end) {

        // 0. base case : when start > end
        if(start > end) return null;

        // 1. calculate mid
        int mid = start + ((end-start)/2);

        TreeNode node = new TreeNode();
        node.data = inOrder[mid];
        node.left = createBinarySearchTree(inOrder, start, mid-1);
        node.right = createBinarySearchTree(inOrder, mid+1, end);

        return node;

    }
}
