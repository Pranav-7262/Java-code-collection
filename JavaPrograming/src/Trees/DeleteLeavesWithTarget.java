package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteLeavesWithTarget {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(TreeNode left , TreeNode right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println("Original tree ");
        printTree(root);

        TreeNode deleted = removeLeafNodes(root,4);

        System.out.println("After deletion tree ");
        printTree(deleted);
    }
    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("Empty tree.");
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at current level

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                if (current != null) {
                    System.out.print(current.val + " ");
                    queue.offer(current.left);
                    queue.offer(current.right);
                } else {
                    System.out.print("null ");
                }
            }
            System.out.println(); // Next level
        }
    }
    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;

        root.left = removeLeafNodes(root.left,target);
        root.right = removeLeafNodes(root.right,target);
        if (root.val == target && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }
}
