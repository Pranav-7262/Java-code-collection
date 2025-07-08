package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.right = new TreeNode(3);
      root.right.left = new TreeNode(4);
      root.right.right = new TreeNode(5);

        System.out.println(sumLeaves(root));
    }
    public static int sumLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
       int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
             sum = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                sum += current.val;
                if (current.left!=null) {
                    queue.add(current.left);
                }
                if (current.right!=null) {
                    queue.add(current.right);
                }
            }
        }
        return sum;
    }
}
