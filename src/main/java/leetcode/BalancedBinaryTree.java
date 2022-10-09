package leetcode;

import codingblocks.tree.TreeNode;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode node) {

        if(node == null) return true;

        DiaPair pair = checkBalanced(node);
        return pair.isBalanced;

    }

    private DiaPair checkBalanced(TreeNode node) {
        // Base Case :
        // when node is null then return dia pair with height -1 and isBalanced true
        if(node == null) {
            return new DiaPair();
        }

        // Recursive Case :
        // Call Recursive case to left and right subtree
        DiaPair leftSubtreePair = checkBalanced(node.left);
        DiaPair rightSubtreePair = checkBalanced(node.right);

        // Check if leftSubtree and rightSubtree is height balanced
        if(!(leftSubtreePair.isBalanced && rightSubtreePair.isBalanced)) {
            // If so, then return diaPair with isBalanced = false
            return new DiaPair(false);
        } else {
            // Check if absolute diff between height of leftSubtreePair and rightSubtreePair is less than equal to one
            DiaPair pair = new DiaPair();
            if(Math.abs(leftSubtreePair.height - rightSubtreePair.height) <= 1) {
                pair.isBalanced = true;
                pair.height = Math.max(leftSubtreePair.height, rightSubtreePair.height) + 1;
            } else {
                pair.isBalanced = false;
            }

            return pair;
        }
    }
}
