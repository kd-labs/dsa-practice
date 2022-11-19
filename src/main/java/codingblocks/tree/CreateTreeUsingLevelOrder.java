package codingblocks.tree;

import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateTreeUsingLevelOrder {

    private TreeNode root;

    public CreateTreeUsingLevelOrder() {
        this.root = createTree();
    }

    private TreeNode createTree() {

        Queue<TreeNode> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int item = sc.nextInt();
        TreeNode root = new TreeNode(item);
        TreeNode nn = null;
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode n = q.remove();
            item = sc.nextInt();
            if(item != -1) {
                nn = new TreeNode(item);
                q.add(nn);
                n.left = nn;
            }

            item = sc.nextInt();
            if(item != -1) {
                nn = new TreeNode(item);
                q.add(nn);
                n.right = nn;
            }
        }

        return root;
    }
}
