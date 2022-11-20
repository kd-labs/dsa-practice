package leetcode;

import codingblocks.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

    int pastLevel = -1;

    public List<Integer> rightSideView(TreeNode node) {

        List<Integer> ll = new ArrayList<>();
        rightView(node, 0, ll);

        return ll;

    }

    private void rightView(TreeNode node, int currentLevel, List<Integer> ll) {

        if(node == null) {
           return;
        }

        if(pastLevel < currentLevel) {

            ll.add(node.data);
            pastLevel = currentLevel;
        }

        if(ll.size() < currentLevel) {

            ll.add(node.data);
        }

        rightView(node.right, currentLevel+1, ll);
        rightView(node.left, currentLevel+1, ll);

    }
}
