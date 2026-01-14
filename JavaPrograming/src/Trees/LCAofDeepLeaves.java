package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LCAofDeepLeaves {
    public static class TreeNode {
        int val;
       TreeNode left;
       TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
       TreeNode(int val,TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
    }
    public static void main(String[] args) {
      TreeNode node = new TreeNode(3);
      node.left = new TreeNode(5);
      node.right = new TreeNode(1);
        node.right.left = new TreeNode(0);
        node.right.right = new TreeNode(8);
      node.left.left = new TreeNode(6);
      node.left.right = new TreeNode(2);
        node.left.right.left = new TreeNode(7);
        node.left.right.right = new TreeNode(4);
      printTree(node);
        System.out.println("The result : ");
      TreeNode res = lcaDeepestLeaves(node);
      printTree(res);

    }
    private static TreeNode lca = null;
    private static int maxDepth = 0;
    public static TreeNode lcaDeepestLeaves(TreeNode root) {
        helper(root , 0);
        return lca;
    }
    public static int helper(TreeNode root , int depth){
        if(root == null) {
            return depth;
        }
        int left = helper(root.left, depth+1);
        int right = helper(root.right ,depth+1);

        maxDepth = Math.max(maxDepth, Math.max(left, right));

        if(left == right && left == maxDepth)  {
            lca = root;
        }
        return Math.max(left,right);
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

}
