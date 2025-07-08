package Trees;

public class MaxDepthOfTree {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

       public TreeNode() {}
        public TreeNode(int val)
        { this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
      }
  }
    public static int maxDepth(TreeNode root) {
         if (root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int depth = Math.max(left,right) +1;
        return depth;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println("Maximum depth is : "+maxDepth(root));
    }
}
