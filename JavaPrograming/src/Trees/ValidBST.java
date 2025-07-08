package Trees;

public class ValidBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {}
        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode( TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(9);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(10);

        System.out.println(isValidBST(root));
    }
    public static boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    public static boolean helper(TreeNode node , Integer low , Integer high) {
        if (node == null) {
            return true;
        }
        if (low!= null && node.val <= low) {
            return false;
        }
        if (high!= null && node.val >= high) {
            return false;
        }
        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val , high);

        return leftTree && rightTree;
    }
}
