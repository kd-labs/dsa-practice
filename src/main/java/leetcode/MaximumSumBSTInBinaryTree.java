package leetcode;

import codingblocks.tree.TreeNode;

public class MaximumSumBSTInBinaryTree {

    public class BSTPair {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        boolean isBst = true;
        int sum;
        int ans;
    }

    public boolean isValidBST(TreeNode node) {
        return isBST(node).isBst;
    }

    public int maxSumBST(TreeNode node) {
        return isBST(node).ans;
    }

    public BSTPair isBST(TreeNode node) {

        // Base Case
        if(node == null) {
            return new BSTPair();
        }

        // Recursion Call
        BSTPair lbst = isBST(node.left);
        BSTPair rbst = isBST(node.right);
        BSTPair res = new BSTPair();
        res.sum = lbst.sum + rbst.sum + node.data;
        if(lbst.isBst && rbst.isBst && node.data > lbst.max && node.data < rbst.min) {
            res.isBst = true;
            res.min = Math.min(node.data, lbst.min);
            res.max = Math.max(node.data, rbst.max);
            res.ans = Math.max(res.sum, Math.max(lbst.ans, rbst.ans));
        } else {
            res.isBst = false;
            res.min = Math.min(node.data, Math.min(lbst.min, rbst.min));
            res.max = Math.max(node.data, Math.max(lbst.max, rbst.max));
            res.ans = Math.max(lbst.ans, rbst.ans);
        }
        return res;
    }
}
