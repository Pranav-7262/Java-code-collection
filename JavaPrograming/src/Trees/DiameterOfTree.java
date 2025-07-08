package Trees;
public class DiameterOfTree {
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

        System.out.println(diameterOfBT(root));
    }
   static int diameter = 0;
    public static int diameterOfBT(TreeNode root) {
        height(root);
        return diameter-1;
    }
    public static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftH = height(node.left);
        int rightH = height(node.right);

        int dia = leftH + rightH + 1;
        diameter = Math.max(diameter,dia);
        return Math.max(leftH,rightH)+1;
    }
}

