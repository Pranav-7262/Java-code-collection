package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSum {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
    public static int maxLevelSum(TreeNode root) {
         if (root == null) return 0;
         int maxSum = Integer.MIN_VALUE;
        int maxLevel = 1;
        int currentLevel = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int length = queue.size();
            int sum = 0;
            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = currentLevel;
            }

            currentLevel++;
        }
        return maxLevel;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxLevelSum(root));
    }
}
