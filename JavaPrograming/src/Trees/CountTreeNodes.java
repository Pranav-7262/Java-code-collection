package Trees;

import com.sun.source.tree.Tree;

public class CountTreeNodes {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(TreeNode left,TreeNode right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        System.out.println(countNodes(root));
    }
    public static int countNodes(TreeNode root) {
        int count = 0;
        if(root == null) return 0;
        int left = countNodes(root.left);
        int right = countNodes(root.right);

        count = left + right + 1;
        return count;

    }
}
