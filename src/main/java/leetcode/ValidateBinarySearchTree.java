package leetcode;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode node) {

        // if node is null then return true
        if(node == null) return true;

        BSTPair pair = checkValidBST(node);
        return pair.isValid;

    }

    private BSTPair checkValidBST(TreeNode node) {

        /*
            Base Case :
                when we encounter a null node then create a new BSTPair and return
         */
        if(node == null) {
            return new BSTPair();
        }

        /*
            Recursive Case :
                Make a recursive call for the left subtree and right subtree
         */
        BSTPair leftSubtreeBstPair = checkValidBST(node.left);
        BSTPair rightSubtreeBstPair = checkValidBST(node.right);

        // Check if leftPair and rightPair is valid or not. If not then return BSTPair with isValid=false
        if(!(leftSubtreeBstPair.isValid && rightSubtreeBstPair.isValid)) {
            return new BSTPair(false);
        } else {
            // if leftPair and rightPair is valid, then compare node's value and compute the max from leftPair
            // and compare node's value and compute the min from rightPair
            BSTPair pair = new BSTPair();
            if(node.data > leftSubtreeBstPair.max && node.data < rightSubtreeBstPair.min) {
                // if node's value is greater than left's max and smaller then right's min, then tree is BST
                pair.isValid = true;
            } else {
                pair.isValid = false;
            }
            pair.max = Math.max(Math.max(leftSubtreeBstPair.max, rightSubtreeBstPair.max), node.data);
            pair.min = Math.min(Math.min(leftSubtreeBstPair.min, rightSubtreeBstPair.min), node.data);
            return pair;
        }

    }
}

class BSTPair {
    boolean isValid = true;
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;

    public BSTPair(boolean isValid) {
        this.isValid = isValid;
    }

    public BSTPair() {}
}
