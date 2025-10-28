package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessBT {
     static class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static void main(String[] args) {
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.right = new TreeNode(3);
      root.left.left = new TreeNode(4);
      root.left.right = new TreeNode(5);
      root.right.right = new TreeNode(7);

        System.out.println(isCompleteTree(root));
    }
    public static boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean nullFound = false;

        while(!q.isEmpty()) {
            TreeNode curr = q.poll();
            if(curr.left != null) {
                if(nullFound ) {
                    return false;
                }
                q.offer(curr.left);
            }
            else {
                nullFound = true;
            }

            if(curr.right != null) {
                if(nullFound ) {
                    return false;
                }
                q.offer(curr.right);
            }
            else {
                nullFound = true;
            }
        }
        return true;
    }


}
