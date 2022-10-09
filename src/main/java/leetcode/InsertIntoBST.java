package leetcode;

import codingblocks.tree.TreeNode;

public class InsertIntoBST {

    public TreeNode insertIntoBST(TreeNode node, int val) {

        if(node == null) {
            return new TreeNode(val);
        }

        if(node.data < val) {
            node.right = insertIntoBST(node.right, val);
        } else {
            node.left = insertIntoBST(node.left, val);
        }

        return node;

    }
}
