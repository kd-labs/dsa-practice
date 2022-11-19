package leetcode;


public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        return equals(root, root);

    }

    private boolean equals(TreeNode a, TreeNode b) {

        if(a == null && b == null) return true;
        if(a == null || b == null) return false;

        if(a.data == b.data) {
            return equals(a.left, b.right) && equals(a.right, b.left);
        } else {
            return false;
        }
    }
}
