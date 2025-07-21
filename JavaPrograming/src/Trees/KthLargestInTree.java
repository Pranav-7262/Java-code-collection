package Trees;

public class KthLargestInTree {
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
         root.right = new TreeNode(9);

        System.out.println(kthLargest(root,2));
    }
    public static int kthLargest(TreeNode root, int k) {
        // Your code here
        count = 0;
        TreeNode result = helper(root, k);
        return (result != null) ? result.val : -1;

    }
    static int count = 0;
    public static TreeNode helper(TreeNode root , int k) {
        if (root == null)  return null;

        TreeNode right = helper(root.right,k);
        if (right  != null) {
            return right;
        }
        count++;

        if (count == k){
            return root;
        }
        return helper(root.left,k);
    }
}
