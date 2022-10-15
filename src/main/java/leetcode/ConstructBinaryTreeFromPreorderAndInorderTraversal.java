package leetcode;

import codingblocks.tree.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {

        return createTree(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);

    }

    private TreeNode createTree(int[] preOrder, int preLo, int preHi, int[] inOrder, int inLo, int inHi) {

        if(preLo > preHi || inLo > inHi) return null;

        TreeNode node = new TreeNode(preOrder[preLo]);
        int idx = linearSearch(inOrder, preOrder[preLo], inLo, inHi);
        int numOfElements = idx-inLo;
        node.left = createTree(preOrder, preLo+1, preLo+numOfElements, inOrder, inLo, idx-1);
        node.right = createTree(preOrder, preLo+1+numOfElements, preHi, inOrder, idx+1, inHi);
        return node;

    }

    private static int linearSearch(int[] inOrder, int target, int inLo, int inHi) {
        int res = -1;
        for(int i  = inLo ; i <= inHi ; i++) {
            if(inOrder[i] == target) return i;
        }

        return -1;
    }
}
