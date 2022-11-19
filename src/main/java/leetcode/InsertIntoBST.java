package leetcode;

public class InsertIntoBST {

    /*
        ThoughtProcess : To add val as leaf node
     */
    public TreeNode insertIntoBST(TreeNode node, int val) {

        // Base Case : When node is null, then create TreeNode with val and return
        if(node == null) {
            return new TreeNode(val);
        }

        // Recursive Case
        //  If val is smaller than node's val, then go to left sub-tree
        //  If val is greater than node's val, then go to right sub-tree
        if(node.data < val) {
            node.right = insertIntoBST(node.right, val);
        } else {
            node.left = insertIntoBST(node.left, val);
        }

        return node;

    }
}
