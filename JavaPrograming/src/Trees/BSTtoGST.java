package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BSTtoGST {
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
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(5);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(9);
        System.out.println("Before GST to BST");

        printTree(root);

        TreeNode gstbst = bstToGst(root);
        System.out.println("After GST to BST");
        printTree(gstbst);
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
    static int result;
    public static TreeNode bstToGst(TreeNode root) {
        result = 0;
        helper(root);
        return root;
    }
    private static void helper(TreeNode root) {
        if (root == null) return;

        helper(root.right);

        result += root.val;
        root.val = result;
        helper(root.left);
    }
}
