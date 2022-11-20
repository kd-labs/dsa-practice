package leetcode;

import codingblocks.tree.TreeNode;

public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {

        int ans = 0;
        String num = "";
//        return rootToPathSum(root, num, ans);
        return rootToPathSum(root, 0);

    }

/*
    private int rootToPathSum(TreeNode root, String num, int ans) {

        // Base Case
        if(root == null) {
            ans += Integer.parseInt(num);
            return ans;
        }

        num += root.data;

        // Recursive Case
        return rootToPathSum(root.left, num, ans) + rootToPathSum(root.right, num, ans);
    }
*/

    private int rootToPathSum(TreeNode root, int ans) {

        // Base Case : when node is null
        if(root == null) return 0;

        // Base Case : when node is leaf
        if(root.left == null && root.right == null) return ans*10+root.data;

        // Recursive Case
        int l = rootToPathSum(root.left, ans*10+root.data);
        int r = rootToPathSum(root.right, ans*10+root.data);
        return l+r;

    }
}
