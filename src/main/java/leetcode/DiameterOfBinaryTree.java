package leetcode;

public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode node) {

        if(node == null) return 0;

        int leftSubtreeDia = diameterOfBinaryTree(node.left);
        int rightSubtreeDia = diameterOfBinaryTree(node.right);
        int selfDia = height(node.left) + height(node.right) + 2;

        return Math.max(selfDia, Math.max(leftSubtreeDia, rightSubtreeDia));

    }

    private int height(TreeNode node) {
        if(node == null) return -1;

        int leftSubtreeHeight = height(node.left);
        int rightSubtreeHeight = height(node.right);

        return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;
    }
}
