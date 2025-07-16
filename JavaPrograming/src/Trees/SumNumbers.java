package Trees;

public class SumNumbers {
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

        System.out.println(sumNumbers(root));

    }
    public static int sumNumbers(TreeNode root) {
        return helper(root , 0);
    }
    public static int helper(TreeNode root , int sum) {
        if (root == null){
            return 0;
        }
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return helper(root.left,sum) + helper(root.right,sum);

    }

}
