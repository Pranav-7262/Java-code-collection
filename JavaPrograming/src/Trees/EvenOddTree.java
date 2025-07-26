package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
        public TreeNode(TreeNode left , TreeNode right){
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(4);

        System.out.println(isEvenOddTree(root));
    }
    public static boolean isEvenOddTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()){
            int n = queue.size();
            int prev = (level % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                TreeNode curr = queue.poll();
                int val = curr.val;
                if (level % 2 == 0){
                    if (val % 2 == 0 || val <= prev){
                        return false;
                    }
                } else {
                    if (val % 2 != 0 || val >= prev){
                        return false;
                    }
                }
                prev = val;
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            level++;
        }
        return true;
    }
}
