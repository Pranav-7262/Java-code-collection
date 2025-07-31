package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftSideView {
    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int value) {
            this.val = value;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(10);

        System.out.println(leftView(root));
    }
   static ArrayList<Integer> leftView(TreeNode root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int levelsize  = queue.size();

            for (int i = 0; i < levelsize; i++) {
                TreeNode currentNode = queue.poll();

                if (i == levelsize-1) {
                    result.add(currentNode.val);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
            }
        }
        return result;

    }
}
