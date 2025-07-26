package Trees;

public class LongestUnivaluePath {
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
        root.right.right = new TreeNode(3);


        System.out.println(longestUnivaluePath(root));
    }
    static int maximum;
    public static int longestUnivaluePath(TreeNode root) {
        maximum = 0;
        helper(root);
        return maximum;
    }
    public static int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = helper(node.left);

        if (node.left != null && node.left.val == node.val) {
            left++;
        } else {
            left = 0;
        }
        int right = helper(node.right);

        if (node.right != null && node.right.val == node.val) {
            right++;
        } else {
            right = 0;
        }
        maximum = Math.max(maximum,left + right);

        return Math.max(left,right);
    }
}
