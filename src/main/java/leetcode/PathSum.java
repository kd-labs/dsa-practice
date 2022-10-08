package leetcode;

public class PathSum {

    public static void main(String[] args) {

    }

    private static boolean hasPathSum(TreeNode root, int sum) {

        // Base Case : when root is null
        if(root == null) return false;

        // Base Case : when root is a leaf node, then check if it's value is equal to sum
        if(root.left == null && root.right == null) {
            return sum == root.data;
        }

        // check if path exists in left sub-tree
        boolean leftPredicate = hasPathSum(root.left, sum-root.data);
        // check if path exists in right sub-tree
        boolean rightPredicate = hasPathSum(root.right, sum-root.data);

        return hasPathSum(root.left, sum - root.data) || hasPathSum(root.right, sum-root.data);
//        OR
//        return leftPredicate || rightPredicate;
    }

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
    }
}
