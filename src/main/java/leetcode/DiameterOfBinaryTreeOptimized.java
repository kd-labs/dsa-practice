package leetcode;

import codingblocks.tree.TreeNode;

public class DiameterOfBinaryTreeOptimized {

    public int diameterOfBinaryTree(TreeNode node) {

        DiaPair result = diameterOfBinaryTreeOptimized(node);

        return result.diameter;

    }

    private DiaPair diameterOfBinaryTreeOptimized(TreeNode node) {

        // Base Case
        if(node == null) {
            return new DiaPair();
        }

        DiaPair leftSubtreeDiaPair = diameterOfBinaryTreeOptimized(node.left);
        DiaPair rightSubtreeDiaPair = diameterOfBinaryTreeOptimized(node.right);

        int selfDia = leftSubtreeDiaPair.height + rightSubtreeDiaPair.height + 2;

        return new DiaPair(Math.max(leftSubtreeDiaPair.height, rightSubtreeDiaPair.height)+1,
                Math.max(Math.max(leftSubtreeDiaPair.diameter, rightSubtreeDiaPair.diameter), selfDia));

    }
}

class DiaPair {
    int height = -1;
    int diameter = 0;

    public DiaPair(int height, int diameter) {
        this.height = height;
        this.diameter = diameter;
    }

    public DiaPair() {}
}
