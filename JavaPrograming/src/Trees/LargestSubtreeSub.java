package Trees;

public class LargestSubtreeSub {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
        public TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        System.out.println(findLargestSubtreeSum(root));


    }
    static int maxi;
    public static int findLargestSubtreeSum(TreeNode root) {
        // code here
        maxi = Integer.MIN_VALUE;
        find(root);
        return maxi;

    }
    private static int find(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = find(root.left);
        int right = find(root.right);
        int sum = left + right + root.val;
        maxi = Math.max(maxi,sum);
        return sum;
    }
}
