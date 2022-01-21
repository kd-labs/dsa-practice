package track.recursion.aditya.verma;

public class HeightBinaryTree {

    public static void main(String[] args) {

    }

    /*
        Hypothesis :
            This method returns the height of the binary tree
     */
    public int heightBinaryTreeRecursive(Node head) {

        /*
            Base Case :
                If head is null then return 0
         */
        if(head == null) return 0;

        /*
            Induction :
                if head != null, then +1
                and recursive call to head.left and head.right
                and find the max result between them
         */

        int maxHeightOfChildSubTree = Math.max(heightBinaryTreeRecursive(head.getLeft()), heightBinaryTreeRecursive(head.getRight()));
        return maxHeightOfChildSubTree + 1;


    }
}
