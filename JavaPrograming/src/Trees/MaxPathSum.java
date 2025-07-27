package Trees;

public class MaxPathSum {
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

        System.out.println(maxSum(root));
    }
    static int answer = Integer.MIN_VALUE;
    public static int maxSum(TreeNode root){
         helper(root);
         return answer;
    }
    public static int helper(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int pathSum = left + right + root.val;
        answer = Math.max(answer,pathSum);

        return Math.max(left,right)+ root.val;
    }
}
