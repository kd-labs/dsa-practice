package leetcode;

public class DeleteNodeInABST {

    public TreeNode deleteNode(TreeNode node, int key) {

        /*
            Base Case :
                if node is null then return null
         */
        if(node == null) return node;

        if(key < node.data ) {
            return deleteNode(node.left, key);
        } else if(node.data < key) {
            return deleteNode(node.right, key);
        } else {

            // Once the node is found, then check if it has 1 child, 0 child or 2 child
            if(node.left == null) { // node has 1 right child
                return node.right;
            } else if(node.right == null) { // node has 1 left child
                return node.left;
            } else { // node has 2 children
                // Option 1 : Find the max from left sub-tree and replace it in node's value to maintain BST

                int max = getMax(node.left);
                node.data = max;
                node.left = deleteNode(node.left, max);

                // Option 2 : Find the min from right sub-tree and replace it in node's value to maintain BST
//                int min = getMin(node.right);
//                node.data = min;
//                node.right = deleteNode(node.right, min);

            }

        }
        return node;
    }

    private int getMax(TreeNode node) {
        if (node == null) return Integer.MIN_VALUE;

        int max = getMax(node.right);
        return Math.max(node.data, max);
    }

    private int getMin(TreeNode node) {
        if(node == null) {
            return Integer.MAX_VALUE;
        }

        int min = getMin(node.left);
        return Math.min(node.data, min);
    }
}
