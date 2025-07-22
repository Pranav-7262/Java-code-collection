package Trees;

public class BottomLeftNode {
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
          TreeNode root = new TreeNode(4);
          root.left = new TreeNode(2);
          root.left.left = new TreeNode(9);
          root.left.right = new TreeNode(10);
          root.right = new TreeNode(5);

        System.out.println(findBottomLeftValue(root));
    }
    private static int maxDepth = -1;
    private static int left;
    public static int findBottomLeftValue(TreeNode root) {
        helper(root , 0);
        return left;
    }
    public static void helper(TreeNode root , int depth){
        if (root == null)  return;
        if (depth > maxDepth) {
            maxDepth = depth;
            left = root.val;
        }
        helper(root.left,depth + 1);
        helper(root.right,depth + 1);
    }
}
