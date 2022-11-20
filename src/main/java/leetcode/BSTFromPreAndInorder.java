package leetcode;

import codingblocks.tree.TreeNode;

import java.net.Inet4Address;

public class BSTFromPreAndInorder {

    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {

        return createTree(preOrder, inOrder, 0, 0, 0, 0);

    }

    public TreeNode createTree(int[] preOrder, int[] inOrder, int inLo, int inHi, int preLo, int preHi) {

        // Base Case
        if(inLo > inHi || preLo > preHi) {
            return null;
        }

        TreeNode res = new TreeNode();
        res.data = preOrder[preLo];

        int i = search(inOrder, inLo, inHi, preOrder[preLo]);
        int net = i - inLo;
        res.left = createTree(preOrder, inOrder, inLo, inHi-1, preLo + 1, preLo + net);
        res.right = createTree(preOrder, inOrder, inLo + 1, inHi, preLo + net + 1, preHi);

        return res;

    }

    public int search(int[] inOrder, int inLo, int inHi, int target) {

        for(int i = inLo ; i <= inHi ; i++) {
            if(inOrder[i] == target) return i;
        }
        return -1;
    }
}
