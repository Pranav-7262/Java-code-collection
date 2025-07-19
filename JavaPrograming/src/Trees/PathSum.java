package Trees;

public class PathSum {
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
         TreeNode root = new TreeNode(2);
         root.left = new TreeNode(4);
         root.right = new TreeNode(5);
         root.left.left = new TreeNode(7);
         root.left.right = new TreeNode(9);

        System.out.println(hasPathSum(root,13));
    }
    public static boolean hasPathSum(TreeNode root , int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left,targetSum - root.val) || hasPathSum(root.right,targetSum - root.val);
    }
}
