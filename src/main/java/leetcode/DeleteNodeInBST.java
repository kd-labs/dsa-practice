package leetcode;

import codingblocks.tree.TreeNode;

public class DeleteNodeInBST {

    public static void main(String[] args) {

    }

    public TreeNode deleteNode(TreeNode node, int key) {


        // Base Case
        if(node == null) return null;

        if(node.data < key) { // key is greater than node, then look in the right sub-tree
            node.right = deleteNode(node.right, key);
        } else if(node.data > key) { // key is smaller than node, then look in the left sub-tree
            node.left = deleteNode(node.left, key);
        } else { // node with value = key is found, then remove that node and send it's children nodes if they exist

            if(node.left == null) { // case when node is leaf or one of the child exists, then return null
                return node.right;
            } else if(node.right == null) {
                return node.left;
            } else { // case when both left and right sub-tree exists, then

                // Approach 1 : delete node and replace with min value from right sub-tree
                int min = min(node.right);
                node.right = deleteNode(node.right, min);
                node.data = min;


                // Approach 2 : delete node and replace with max value in left sub-tree
            }
        }

        return node;
    }

    public int min(TreeNode node) {

        if(node == null) return Integer.MAX_VALUE;

        int min = min(node.left);
        return Math.min(node.data, min);

    }
}
