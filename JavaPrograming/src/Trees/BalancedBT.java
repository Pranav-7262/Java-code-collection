package Trees;

public class BalancedBT {
   public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int value) {
            this.val = value;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(TreeNode root) {
        return heights(root) != -1;
    }

    private static int heights(TreeNode root) {
       if (root == null) {
           return 0;
       }
       int left = heights(root.left);
       if (left == -1) return -1;
       int right = heights(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) { //current node unbalanced !
            return -1;
        }
        return 1 + Math.max(left,right);

    }

}
