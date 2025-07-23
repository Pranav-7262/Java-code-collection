package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteNodeBST {
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
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        int key = 6;

        System.out.println("Original");
        printTree(root);

        TreeNode newTree = deleteNode(root,key);
        System.out.println("After delete");
        printTree(newTree );

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
    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if(key < root.val) {
            root.left = deleteNode(root.left,key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right,key);
        }
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            TreeNode node = find(root.right);
            root.val = node.val;
            root.right = deleteNode(root.right, node.val);
        }
        return root;
    }
    public static TreeNode find(TreeNode node){
        while (node.left!=null) node = node.left;
        return node;
    }
}
