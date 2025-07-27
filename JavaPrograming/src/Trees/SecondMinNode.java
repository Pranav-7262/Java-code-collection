package Trees;

public class SecondMinNode {
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

    public static void main(String[] args) {
            TreeNode root = new TreeNode(2);
            root.left = new TreeNode(2);
            root.right = new TreeNode(5);
            root.right.left = new TreeNode(5);
            root.right.right = new TreeNode(7);
        System.out.println(findSecondMinimumValue(root));

    }
    public static int findSecondMinimumValue(TreeNode root) {
        return helper(root , root.val);
    }
    private static int helper(TreeNode root , int minval){
        if (root == null) return -1;
        if (root.val > minval) return root.val;
        int left =helper(root.left,minval);
        int right = helper(root.right,minval);
        if (left != -1 && right != -1) return Math.min(left, right);
        return left != -1 ? left : right;
    }
}
